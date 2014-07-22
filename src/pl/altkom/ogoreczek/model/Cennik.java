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
public class Cennik {
     private Cena cenaProduktu;
    private Date dataOd;
    private Date dataDo;
    
    private Produkt produkt;

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }
    
  
    public Cena getCenaProduktu() {
        return cenaProduktu;
    }

    public void setCenaProduktu(Cena cenaProduktu) {
        this.cenaProduktu = cenaProduktu;
    }

    public Date getDataOd() {
        return dataOd;
    }

    public void setDataOd(Date dataOd) {
        this.dataOd = dataOd;
    }

    public Date getDataDo() {
        return dataDo;
    }

    public void setDataDo(Date dataDo) {
        this.dataDo = dataDo;
    }

    @Override
    public String toString() {
        return "Cennik{" + "cenaProduktu=" + cenaProduktu + ", dataOd=" + dataOd + ", dataDo=" + dataDo + ", produkt=" + produkt + '}';
    }

   
    
    
    
    
}
