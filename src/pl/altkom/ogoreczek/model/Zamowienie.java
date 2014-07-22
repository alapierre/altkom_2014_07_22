/*
 * Copyright 2014 Ula.
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
import java.util.List;

/**
 *
 * @author Ula
 */
public class Zamowienie {
private Date dataZlozenia;
    private Date dataPlanowanejRealizacji;
    private Date dataRealizacji;
    
    private StanZamowienia stanZamowienia;
    //private Klient klient
    //private Adres adresDostawy
    
    private double sumaPozycjiZamowienia;//suma cen produktow
    private double kosztDostawyWysylki;
    private double doZaplaty;
    
    private List<PozycjaZamowienia> pozycjeZamowienia;
    private List<Promocja> promocje;
    
    //private TypPotwierdzenia typPotwierdzenia; //paragon/faktura
    //private Faktura faktura;
    //private TypDostarczenia typDostarczenia; //wysylka/odbior/dostawa
    //private Wysylka wysylka;
    //private Dostawa dostawa;
    //private Platnosc platnosc;
    public Date getDataZlozenia() {
        return dataZlozenia;
    }

    public void setDataZlozenia(Date dataZlozenia) {
        this.dataZlozenia = dataZlozenia;
    }

    public Date getDataPlanowanejRealizacji() {
        return dataPlanowanejRealizacji;
    }

    public void setDataPlanowanejRealizacji(Date dataPlanowanejRealizacji) {
        this.dataPlanowanejRealizacji = dataPlanowanejRealizacji;
    }

    public Date getDataRealizacji() {
        return dataRealizacji;
    }

    public void setDataRealizacji(Date dataRealizacji) {
        this.dataRealizacji = dataRealizacji;
    }

    public StanZamowienia getStanZamowienia() {
        return stanZamowienia;
    }

    public void setStanZamowienia(StanZamowienia stanZamowienia) {
        this.stanZamowienia = stanZamowienia;
    }

    public double getSumaPozycjiZamowienia() {
        return sumaPozycjiZamowienia;
    }

    public void setSumaPozycjiZamowienia(double sumaPozycjiZamowienia) {
        this.sumaPozycjiZamowienia = sumaPozycjiZamowienia;
    }

    public double getKosztDostawyWysylki() {
        return kosztDostawyWysylki;
    }

    public void setKosztDostawyWysylki(double kosztDostawyWysylki) {
        this.kosztDostawyWysylki = kosztDostawyWysylki;
    }

    public double getDoZaplaty() {
        return doZaplaty;
    }

    public void setDoZaplaty(double doZaplaty) {
        this.doZaplaty = doZaplaty;
    }

    public List<PozycjaZamowienia> getPozycjeZamowienia() {
        return pozycjeZamowienia;
    }

    public void setPozycjeZamowienia(List<PozycjaZamowienia> pozycjeZamowienia) {
        this.pozycjeZamowienia = pozycjeZamowienia;
    }

    public List<Promocja> getPromocje() {
        return promocje;
    }

    public void setPromocje(List<Promocja> promocje) {
        this.promocje = promocje;
    }
    
        
}
