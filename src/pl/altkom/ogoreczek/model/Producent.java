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
public class Producent {
    private String nazwa;
    private Adres adres;
    private String opinia;
    private int czasDostawy;
    private String terminyDostawy;

    public String getNazwa() {
        return nazwa;
    }

    public String getOpinia() {
        return opinia;
    }

    public int getCzasDostawy() {
        return czasDostawy;
    }

    public String getTerminyDostawy() {
        return terminyDostawy;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCzasDostawy(int czasDostawy) {
        this.czasDostawy = czasDostawy;
    }
    
}
