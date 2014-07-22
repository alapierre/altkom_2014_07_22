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
public class Kategoria {
    private String nazwa;
    private Typ typ;

    public String getNazwa() {
        return nazwa;
    }

    public Typ getTyp() {
        return typ;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }
    
}
