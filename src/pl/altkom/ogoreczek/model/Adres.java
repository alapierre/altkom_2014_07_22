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
import java.util.Date;

public class Adres {
    
    private String ulica;
    private int numer;
    private String kodPocztowy;
    private String miasto;
    private Date dataDodania;

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public Date getDataDodania() {
        return dataDodania;
    }

    public void setDataDodania(Date dataDodania) {
        this.dataDodania = dataDodania;
    }

    @Override
    public String toString() {
        return "Adres{" + "ulica=" + ulica + ", numer=" + numer + ", kodPocztowy=" + kodPocztowy + ", miasto=" + miasto + ", dataDodania=" + dataDodania + '}';
    }
    
    
    
}
