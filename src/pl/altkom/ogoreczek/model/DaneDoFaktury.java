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

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class DaneDoFaktury {
    
    private Adres adres;
    private String identyfikatorPodatkowy;
    private String nazwa;

    public DaneDoFaktury() {
    }

    public DaneDoFaktury(Adres adres, String identyfikatorPodatkowy, String nazwa) {
        this.adres = adres;
        this.identyfikatorPodatkowy = identyfikatorPodatkowy;
        this.nazwa = nazwa;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getIdentyfikatorPodatkowy() {
        return identyfikatorPodatkowy;
    }

    public void setIdentyfikatorPodatkowy(String identyfikatorPodatkowy) {
        this.identyfikatorPodatkowy = identyfikatorPodatkowy;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "DaneDoFaktury{" + "adres=" + adres + ", identyfikatorPodatkowy=" + identyfikatorPodatkowy + ", nazwa=" + nazwa + '}';
    }
    
}
