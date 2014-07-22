/*
 * Copyright 2014 Agnieszka Znosko agnieszka@znosko.net.pl.
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
 * @author Agnieszka Znosko agnieszka@znosko.net.pl
 */
public class Faktura {
     private double kwotaDoZaplatyNetto;
    private double kwotaDoZaplatyBrutto;
    private Date dataWystawienia;
    private String nrFaktury;
    
    private Klient klient;
    private Wysylka wysylka;
    private Platnosc platosc;
    private Zamowienie zamowienie;

    public String getNrFaktury() {
        return nrFaktury;
    }

    public void setNrFaktury(String nrFaktury) {
        this.nrFaktury = nrFaktury;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Wysylka getKosztWysyki() {
        return wysylka;
    }

    public void setKosztWysyki(Wysylka kosztWysyki) {
        this.wysylka = kosztWysyki;
    }

    public Platnosc getPlatosc() {
        return platosc;
    }

    public void setPlatosc(Platnosc platosc) {
        this.platosc = platosc;
    }

    public Zamowienie getNumerPlatnosci() {
        return zamowienie;
    }

    public void setNumerPlatnosci(Zamowienie numerPlatnosci) {
        this.zamowienie = numerPlatnosci;
    }
    
   
    //produkty
    public double getKwotaDoZaplatyNetto() {
        return kwotaDoZaplatyNetto;
    }

    public void setKwotaDoZaplatyNetto(double kwotaDoZaplatyNetto) {
        this.kwotaDoZaplatyNetto = kwotaDoZaplatyNetto;
    }

    public double getKwotaDoZaplatyBrutto() {
        return kwotaDoZaplatyBrutto;
    }

    public void setKwotaDoZaplatyBrutto(double kwotaDoZaplatyBrutto) {
        this.kwotaDoZaplatyBrutto = kwotaDoZaplatyBrutto;
    }

    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    @Override
    public String toString() {
        return "Faktura{" + "kwotaDoZaplatyNetto=" + kwotaDoZaplatyNetto + ", kwotaDoZaplatyBrutto=" + kwotaDoZaplatyBrutto + ", dataWystawienia=" + dataWystawienia + ", nrFaktury=" + nrFaktury + ", klient=" + klient + ", kosztWysyki=" + wysylka + ", platosc=" + platosc + ", numerPlatnosci=" + zamowienie + '}';
    }

    
    
}
