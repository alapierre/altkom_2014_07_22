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

/**
 *
 * @author Agnieszka Znosko agnieszka@znosko.net.pl
 */
public class Cena {
     private double cenaNetto;
    private double vatWartosc;
    private Waluta waluta;

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public double getVatWartosc() {
        return vatWartosc;
    }

    public void setVatWartosc(double vatWartosc) {
        this.vatWartosc = vatWartosc;
    }

    public Waluta getWaluta() {
        return waluta;
    }

    public void setWaluta(Waluta waluta) {
        this.waluta = waluta;
    }

   

    @Override
    public String toString() {
        return "Cena{" + "cenaNetto=" + cenaNetto + ", vatWartosc=" + vatWartosc + ", waluta=" + waluta + '}';
    }
    
}
