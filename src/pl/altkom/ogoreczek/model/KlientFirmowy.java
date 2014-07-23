/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.ogoreczek.model;

import java.util.Date;

/**
 *
 * @author weronika
 */
public class KlientFirmowy extends Klient {

    private String Nazwa;
    private String nip;
    private Date dataRejestracjiFirmy;

    public KlientFirmowy(String login, String haslo, String eMail, String status, Date dataUtworzenia) {
        super(login, haslo, eMail, status, dataUtworzenia);
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String Nazwa) {
        this.Nazwa = Nazwa;
    }

    public String getNIP() {
        return nip;
    }

    public void setNIP(String NIP) {
        this.nip = NIP;
    }

    public Date getDataRejestracjiFirmy() {
        return dataRejestracjiFirmy;
    }

    public void setDataRejestracjiFirmy(Date dataRejestracjiFirmy) {
        this.dataRejestracjiFirmy = dataRejestracjiFirmy;
    }

    @Override
    public String toString() {
        return "KlientFirmowy{" + "Nazwa=" + Nazwa + ", NIP=" + nip + ", dataRejestracjiFirmy=" + dataRejestracjiFirmy + '}';
    }

}
