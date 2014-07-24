/*
 * Copyright 2014 Adrian Lapierre <adrian@soft-project.pl>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.altkom.ogoreczek;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import pl.altkom.ogoreczek.model.Klient;
import pl.altkom.ogoreczek.model.KlientFirmowy;
import pl.altkom.ogoreczek.model.KlientIndywidualny;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Ogoreczek {
    
    private static final Logger LOG = Logger.getLogger(Ogoreczek.class.getName());
    
    static {
        FileHandler fh;
        try {
            fh = new FileHandler("log.txt");
            LOG.addHandler(fh);
        } catch (IOException ex) {
            Logger.getLogger(Ogoreczek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Ogoreczek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static List<Klient> load() {
        
        File file = new File("klinci.bin");
        
        if(file.exists()) {
            try (ObjectInputStream ooi = new ObjectInputStream(new FileInputStream(file))) {
                
                return (List<Klient>) ooi.readObject();
            } catch (IOException | ClassNotFoundException  ex) {
                LOG.log(Level.WARNING, "problem z odczytem " + ex.getMessage(), ex);
                return new ArrayList<Klient>();
            } 
        } else {
            LOG.log(Level.INFO, "brak pliku z danymi");
            return new ArrayList<Klient>();
        }
        
    }
    
    public static void save(List<Klient> klienci) throws IOException {
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("klinci.bin"));
        oos.writeObject(klienci);
        oos.close();
    }
    
    public static void main(String[] args) {
        
        LOG.log(Level.FINE, "start aplikacji");
        
        List<Klient> klienci = load();
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            pokazMenu();
            int i = czytajLiczbeZKlawiatury(sc);        
            System.out.println("wybrałeś: " + i);
            
            switch (i) {
                case 1:
                    for(Klient klient : klienci) {
                        System.out.println(klient);
                    }
                    break;
                case 2:
                    Klient klient = wczytajDaneKlientaZKlawiatury(sc);
                    System.out.println(klient); 
                    klienci.add(klient);
                    
                            
                    try {
                        save(klienci);
                    } catch (IOException ex) {
                        LOG.log(Level.WARNING, "błąd zapisu pliku " + ex.getMessage());
                        ex.printStackTrace();
                    }
                    break;
                case 0:
                    LOG.log(Level.INFO, "stop aplikacji");
                    return;
            }
            
        }
        
    }
    
    
    public static Klient wczytajDaneKlientaZKlawiatury(Scanner sc) {
        
        System.out.println("Jaki typ klienta:");
        System.out.println("1. Firmowy");
        System.out.println("2. Indywidualny");
        
        System.out.println("inna wartość = powrót");
        
        int res = czytajLiczbeZKlawiatury(sc);
        
        switch (res) {
            case 1:
                return wczytajKlientaFirmowego(sc);
            case 2:
                return wczytajKlientaIndywidualnego(sc);
            default:
                return null;
        }
    }
    
    public static KlientFirmowy wczytajKlientaFirmowego(Scanner sc) {
        
        KlientFirmowy klient = (KlientFirmowy) przygotujKlienta(sc, true);
        
        System.out.println("Nazwa: ");
        klient.setNazwa(sc.next());
        
        System.out.println("NIP: ");
        klient.setNIP(sc.next());
        
        System.out.println("DFata powstania firmy: ");
        
        try {
            klient.setDataRejestracjiFirmy(konwertujDate(sc.next()));
        } catch (ParseException ex) {
            System.out.println("błędna data");
        }
        return klient;
    }

    private static Klient przygotujKlienta(Scanner sc, boolean firmowy) {
        System.out.println("login: ");
        String login = sc.next();
        System.out.println("Haslo: ");
        String haslo = sc.next();
        System.out.println("Mail: ");
        String email = sc.next();
        
        Klient klient;
        
        if(firmowy) {
            klient = new KlientFirmowy(login, haslo, email, "nowy", new Date());
        } else {
            klient = new KlientIndywidualny(login, haslo, email, "nowy", new Date());
        }
        return klient;
    }
    
    public static Date konwertujDate(String str) throws ParseException {
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        return df.parse(str);
    }
    
    public static KlientIndywidualny wczytajKlientaIndywidualnego(Scanner sc) {
        
        KlientIndywidualny klient =   (KlientIndywidualny) przygotujKlienta(sc, false);
        
        System.out.println("Imię: ");
        klient.setImie(sc.next());
        
        System.out.println("Nazwisko: ");
        klient.setImie(sc.next());
        
        System.out.println("Pesel: ");
        klient.setImie(sc.next());
        
        return klient;
        
    }
    
    public static void pokazMenu() {
        
        System.out.println("1. Lista klientów");
        System.out.println("2. Dodaj kliena");
        System.out.println("3. Lista zamówień");
        System.out.println("4. Dodaj zamówienie");
        
        System.out.println("0. Koniec");
        
    }
    
    public static int czytajLiczbeZKlawiatury(Scanner sc) {
        
        while(!sc.hasNextInt()) {
            System.out.println("błędny wybór " + sc.next());
        } 
        
        return sc.nextInt();
    }
    
}
