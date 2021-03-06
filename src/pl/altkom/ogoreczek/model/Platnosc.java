/*
 * Copyright 2014 Your Name <Ewa Milewska>.
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

import java.util.Date;

/**
 *
 * @author Your Name <Ewa Milewska>
 */
public class Platnosc {
    private Date data;
    private double kwota;
    private Zamowienie Zamowienie;
    private Waluta waluta;
    private SposobPlatnosci sposobPlatnosci;
    private boolean czyPrzeterminowana;

    public Date getData() {
        return data;
    }

    public double getKwota() {
        return kwota;
    }

    public pl.altkom.ogoreczek.model.Zamowienie getZamowienie() {
        return Zamowienie;
    }

    public Waluta getWaluta() {
        return waluta;
    }

    public SposobPlatnosci getSposobPlatnosci() {
        return sposobPlatnosci;
    }

    public boolean isCzyPrzeterminowana() {
        return czyPrzeterminowana;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public void setZamowienie(Zamowienie Zamowienie) {
        this.Zamowienie = Zamowienie;
    }

    public void setWaluta(Waluta waluta) {
        this.waluta = waluta;
    }

    public void setSposobPlatnosci(SposobPlatnosci sposobPlatnosci) {
        this.sposobPlatnosci = sposobPlatnosci;
    }

    public void setCzyPrzeterminowana(boolean czyPrzeterminowana) {
        this.czyPrzeterminowana = czyPrzeterminowana;
    }
    
    
}
