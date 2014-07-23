/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.ogoreczek.model;

import java.util.Date;

/**
 *
 * @author Student
 */
public class Klient {

    private String login;
    private String haslo;
    private String eMail;
    private String statusKlienta;
    private Date dataUtworzenia;
    private Faktura faktura;
    private Adres adres;
    private Rabat rabat;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getStatusKlienta() {
        return statusKlienta;
    }

    public void setStatusKlienta(String status) {
        this.statusKlienta = status;
    }

    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
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

    public Rabat getRabat() {
        return rabat;
    }

    public void setRabat(Rabat rabat) {
        this.rabat = rabat;
    }

    @Override
    public String toString() {
        return "Klient{" + "login=" + login + ", haslo=" + haslo + ", eMail=" + eMail + ", statusKlienta=" + statusKlienta + ", dataUtworzenia=" + dataUtworzenia + ", faktura=" + faktura + ", adres=" + adres + ", rabat=" + rabat + '}';
    }

    public Klient(String login, String haslo, String eMail, String statusKlienta, Date dataUtworzenia) {

        this.login = login;
        this.haslo = haslo;
        this.eMail = eMail;
        this.statusKlienta = statusKlienta;
        this.dataUtworzenia = dataUtworzenia;
    }

}
