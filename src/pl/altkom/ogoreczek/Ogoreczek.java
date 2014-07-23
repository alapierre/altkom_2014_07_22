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
        
        pokazMenu();
        
        Scanner sc = new Scanner(System.in);
        int i = czytajLiczbeZKlawiatury(sc);
        
        System.out.println("wybrałeś: " + i);
    }
    
    public static void pokazMenu() {
        
        System.out.println("1. Lista klientów");
        System.out.println("2. Dodaj kliena");
        System.out.println("3. Lista zamówień");
        System.out.println("4. Dodaj zamówienie");
        
    }
    
    public static int czytajLiczbeZKlawiatury(Scanner sc) {
        
        while(!sc.hasNextInt()) {
            System.out.println("błędny wybór " + sc.next());
        } 
        
        return sc.nextInt();
    }
    
}
