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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class FakturaTest {

    /**
     * Test of dodajPozycje method, of class Faktura.
     */
    @Test
    public void testDodajPozycje() {
        
        Faktura faktura = new Faktura();
        
        PozycjaFaktury pozycjaFaktury = new PozycjaFaktury();
        pozycjaFaktury.setCena(new Cena(100));
        pozycjaFaktury.setIlosc(1);
        pozycjaFaktury.setWaga(1);
        
        int iloscPozycji = 11;
        
        for(int i = 0; i < iloscPozycji; i++)
            faktura.dodajPozycje(pozycjaFaktury);
        
        assert faktura.getIloscPozycjiFaktury() == iloscPozycji : "nieprawidłowa ilosć pozycji";
        
        
    }

    
    
    
}
