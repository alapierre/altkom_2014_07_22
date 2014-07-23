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

package pl.altkom.ogoreczek.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Ogoreczek {
    
    public static void main(String[] args) {
        
        KlientFirmowy klient 
                = new KlientFirmowy("login", "haslo", "mail;", "nowy", new Date());
        klient.setNazwa("jakaś nazwa");
        klient.setNIP("123-123-11-11");
        
        
        List<Klient> klienci = new ArrayList<Klient>();
        
        klienci.add(klient);
        
        KlientIndywidualny klient2 
                = new KlientIndywidualny("drugi", "sekret", "mail", "nowy", new Date());
        
        klient2.setImie("Jan");
        klient2.setNazwisko("Kowalski");
        klient2.setPesel("12231231232");
        
        klienci.add(klient2);
       
        for(Klient k : klienci) {
             System.out.println(k.podajDaneDoFaktury());
        }
       
                
    }
    
}
