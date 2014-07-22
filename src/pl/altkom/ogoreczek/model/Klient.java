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
    
    private String imie;
    private String nazwisko;
    private String login;
    private String haslo;
    private String eMail;
    private String dataUrodzenia;
    private int pesel;
    private String statusKlienta;
    private Date dataUtworzenia;
    

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

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
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

    @Override
    public String toString() {
        return "Klient{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", login=" + login + ", haslo=" + haslo + ", eMail=" + eMail + ", dataUrodzenia=" + dataUrodzenia + ", pesel=" + pesel + ", statusKlienta=" + statusKlienta + ", dataUtworzenia=" + dataUtworzenia + '}';
    }

    public Klient(String imie, String nazwisko, String login, String haslo, String eMail, String dataUrodzenia, int pesel, String status, Date dataUtworzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.login = login;
        this.haslo = haslo;
        this.eMail = eMail;
        this.dataUrodzenia = dataUrodzenia;
        this.pesel = pesel;
        this.statusKlienta = statusKlienta;
        this.dataUtworzenia = dataUtworzenia;
    }

    public Klient(String imie, String nazwisko, String login, String haslo, String eMail, String dataUrodzenia, String status, Date dataUtworzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.login = login;
        this.haslo = haslo;
        this.eMail = eMail;
        this.dataUrodzenia = dataUrodzenia;
        this.statusKlienta = statusKlienta;
        this.dataUtworzenia = dataUtworzenia;
    }
    
    
    
}
