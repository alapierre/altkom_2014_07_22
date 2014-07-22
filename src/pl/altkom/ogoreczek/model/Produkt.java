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

/**
 *
 * @author Your Name <Ewa Milewska>
 */
public class Produkt {
    private String nazwa;
    private Kategoria kategoria;
    private String gatunek;
    private String opis;
    private Producent producent;
    private int iloscWMagazynie;
    private Boolean czyTrwale;
    private JednostkaMiary jM;
    private Opakowanie opakowanie;
    private double iloscWPaczce;
    private Cena cena;

    public String getNazwa() {
        return nazwa;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public String getGatunek() {
        return gatunek;
    }

    public String getOpis() {
        return opis;
    }

    public Producent getProducent() {
        return producent;
    }

    public int getIloscWMagazynie() {
        return iloscWMagazynie;
    }

    public Boolean isCzyTrwale() {
        return czyTrwale;
    }

    public JednostkaMiary getjM() {
        return jM;
    }

    public Opakowanie getOpakowanie() {
        return opakowanie;
    }

    public double getIloscWPaczce() {
        return iloscWPaczce;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public void setIloscWMagazynie(int iloscWMagazynie) {
        this.iloscWMagazynie = iloscWMagazynie;
    }

    public void setCzyTrwale(Boolean czyTrwale) {
        this.czyTrwale = czyTrwale;
    }

    public void setjM(JednostkaMiary jM) {
        this.jM = jM;
    }

    public void setOpakowanie(Opakowanie opakowanie) {
        this.opakowanie = opakowanie;
    }

    public void setIloscWPaczce(double iloscWPaczce) {
        this.iloscWPaczce = iloscWPaczce;
    }

    public Cena getCena() {
        return cena;
    }

    public void setCena(Cena cena) {
        this.cena = cena;
    }
    
    
}
