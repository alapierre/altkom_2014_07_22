/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.ogoreczek.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author weronika
 */
public class KlientFirmowy extends Klient  {

    private String nazwa;
    private String nip;
    private Date dataRejestracjiFirmy;

    
    
    public KlientFirmowy(String login, String haslo, String eMail, String status, Date dataUtworzenia) {
        super(login, haslo, eMail, status, dataUtworzenia);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String Nazwa) {
        this.nazwa = Nazwa;
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
        return "KlientFirmowy{" + "Nazwa=" + nazwa + ", NIP=" + nip + ", dataRejestracjiFirmy=" + dataRejestracjiFirmy + '}';
    }

    @Override
    public DaneDoFaktury podajDaneDoFaktury() {
        return new DaneDoFaktury(getAdres(), nip, nazwa);
    }

}
