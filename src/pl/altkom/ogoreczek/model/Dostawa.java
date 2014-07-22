
package pl.altkom.ogoreczek.model;

/**
 *
 * @author Ania
 */

import java.util.Date;
 
public class Dostawa {
    
    private SposobDostawy sposobDostawy;
    private double kosztDostawy;
    private String adresWysyłki;
    private Date dataDostawy;

    public SposobDostawy getSposobDostawy() {
        return sposobDostawy;
    }

    public void setSposobDostawy(SposobDostawy sposobDostawy) {
        this.sposobDostawy = sposobDostawy;
    }

    public double getKosztDostawy() {
        return kosztDostawy;
    }

    public void setKosztDostawy(double kosztDostawy) {
        this.kosztDostawy = kosztDostawy;
    }

    public String getAdresWysyłki() {
        return adresWysyłki;
    }

    public void setAdresWysyłki(String adresWysyłki) {
        this.adresWysyłki = adresWysyłki;
    }

    public Date getDataDostawy() {
        return dataDostawy;
    }

    public void setDataDostawy(Date dataDostawy) {
        this.dataDostawy = dataDostawy;
    }

    @Override
    public String toString() {
        return "Dostawa{" + "sposobDostawy=" + sposobDostawy + ", kosztDostawy=" + kosztDostawy + ", adresWysy\u0142ki=" + adresWysyłki + ", dataDostawy=" + dataDostawy + '}';
    }
    
    
}
