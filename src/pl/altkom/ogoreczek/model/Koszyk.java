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
public class Koszyk {
    
        String produkt;
        int ilosc;
        double cena;
        String promocja;

    public String getProdukt() {
        return produkt;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getPromocja() {
        return promocja;
    }

    public void setPromocja(String promocja) {
        this.promocja = promocja;
    }

    @Override
    public String toString() {
        return "Koszyk{" + "produkt=" + produkt + ", ilosc=" + ilosc + ", cena=" + cena + ", promocja=" + promocja + '}';
    }
        
       

      
        
}
