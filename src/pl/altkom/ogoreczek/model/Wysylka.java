/*
 * Copyright 2014 Anna Kosinska-Woloch <anna.kosinska.woloch@gmail.com>.
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
 * @author Anna Kosinska-Woloch <anna.kosinska.woloch@gmail.com>
 */
public class Wysylka {
    
    private Status statusWysylki;
    private Date dataWysylki;
    private Date dataOdebrania;
    private double kosztWysylki;

    public Status getStatusWysylki() {
        return statusWysylki;
    }

    public void setStatusWysylki(Status statusWysylki) {
        this.statusWysylki = statusWysylki;
    }

    public Date getDataWysylki() {
        return dataWysylki;
    }

    public void setDataWysylki(Date dataWysylki) {
        this.dataWysylki = dataWysylki;
    }

    public Date getDataOdebrania() {
        return dataOdebrania;
    }

    public void setDataOdebrania(Date dataOdebrania) {
        this.dataOdebrania = dataOdebrania;
    }

    public double getKosztWysylki() {
        return kosztWysylki;
    }

    public void setKosztWysylki(double kosztWysylki) {
        this.kosztWysylki = kosztWysylki;
    }

    @Override
    public String toString() {
        return "Wysylka{" + "statusWysylki=" + statusWysylki + ", dataWysylki=" + dataWysylki + ", dataOdebrania=" + dataOdebrania + ", kosztWysylki=" + kosztWysylki + '}';
    }
 
    
     
}
