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
class Rabat {
    private int cenaZamowienia;
    private int stalyRabat;
    private String przelewZgory;

    public int getCenaZamowienia() {
        return cenaZamowienia;
    }

    public void setCenaZamowienia(int cenaZamowienia) {
        this.cenaZamowienia = cenaZamowienia;
    }

    public int getStalyRabat() {
        return stalyRabat;
    }

    public void setStalyRabat(int stalyRabat) {
        this.stalyRabat = stalyRabat;
    }

    public String getPrzelewZgory() {
        return przelewZgory;
    }

    public void setPrzelewZgory(String przelewZgory) {
        this.przelewZgory = przelewZgory;
    }

    @Override
    public String toString() {
        return "Rabat{" + "cenaZamowienia=" + cenaZamowienia + ", stalyRabat=" + stalyRabat + ", przelewZgory=" + przelewZgory + '}';
    }
    
    
}
