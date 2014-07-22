/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.ogoreczek.model;

/**
 *
 * @author Student
 */
public class KlientFirmowy {
    private String Nazwa;
    private String NIP;
    private Rabat rabat;
    private Faktura faktura;
    private Adres adres;

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String Nazwa) {
        this.Nazwa = Nazwa;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public Rabat getRabat() {
        return rabat;
    }

    public void setRabat(Rabat rabat) {
        this.rabat = rabat;
    }

    public Faktura getFaktura() {
        return faktura;
    }

    public void setFaktura(Faktura faktura) {
        this.faktura = faktura;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "KlientFirmowy{" + "Nazwa=" + Nazwa + ", NIP=" + NIP + ", rabat=" + rabat + ", faktura=" + faktura + ", adres=" + adres + '}';
    }
    
    
    
}
