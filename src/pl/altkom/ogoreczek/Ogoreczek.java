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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import pl.altkom.ogoreczek.model.Klient;
import pl.altkom.ogoreczek.model.KlientFirmowy;
import pl.altkom.ogoreczek.model.KlientIndywidualny;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Ogoreczek {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            pokazMenu();
            int i = czytajLiczbeZKlawiatury(sc);        
            System.out.println("wybrałeś: " + i);
            
            switch (i) {
                case 2:
                    Klient klient = wczytajDaneKlientaZKlawiatury(sc);
                    System.out.println(klient);        
                    break;
                case 0:
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
        
        System.out.println("login: ");
        String login = sc.next();
        
        System.out.println("Haslo: ");
        String haslo = sc.next();
        System.out.println("Mail: ");
        String email = sc.next();
        
        KlientFirmowy klient = new KlientFirmowy(login, haslo, email, "nowy", new Date());
        
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
    
    public static Date konwertujDate(String str) throws ParseException {
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        return df.parse(str);
    }
    
    public static KlientIndywidualny wczytajKlientaIndywidualnego(Scanner sc) {
        
        KlientIndywidualny klient = new KlientIndywidualny(null, null, null, null, null);
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