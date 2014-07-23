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
public class KlientIndywidualny extends Klient{

    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private String pesel;

    public KlientIndywidualny(String login, String haslo, String eMail, String statusKlienta, Date dataUtworzenia) {
        super(login, haslo, eMail, statusKlienta, dataUtworzenia);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "KlientIndywidualny{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", dataUrodzenia=" + dataUrodzenia + ", pesel=" + pesel + '}';
    }

    @Override
    public DaneDoFaktury podajDaneDoFaktury() {
        return new DaneDoFaktury(getAdres(), pesel, imie + " " + nazwisko);
    }
    
}
