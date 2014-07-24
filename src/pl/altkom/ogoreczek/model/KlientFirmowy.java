/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.ogoreczek.model;

import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author weronika
 */
public class KlientFirmowy extends Klient  {
    public static final String PROP_NAZWA = "PROP_NAZWA";
    public static final String PROP_NIP = "PROP_NIP";
    public static final String PROP_DATAREJESTRACJIFIRMY = "PROP_DATAREJESTRACJIFIRMY";

    private String nazwa;
    private String nip;
    private Date dataRejestracjiFirmy;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public KlientFirmowy() {
    }

    public KlientFirmowy(String login, String haslo, String eMail, String status, Date dataUtworzenia) {
        super(login, haslo, eMail, status, dataUtworzenia);
    }

    

    @Override
    public String toString() {
        return "KlientFirmowy{" + "Nazwa=" + getNazwa() + ", NIP=" + getNip() + ", dataRejestracjiFirmy=" + getDataRejestracjiFirmy() + '}';
    }

    @Override
    public DaneDoFaktury podajDaneDoFaktury() {
        return new DaneDoFaktury(getAdres(), getNip(), getNazwa());
    }

    /**
     * @return the nazwa
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * @param nazwa the nazwa to set
     */
    public void setNazwa(String nazwa) {
        java.lang.String oldNazwa = this.nazwa;
        this.nazwa = nazwa;
        propertyChangeSupport.firePropertyChange(PROP_NAZWA, oldNazwa, nazwa);
    }

    /**
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip) {
        java.lang.String oldNip = this.nip;
        this.nip = nip;
        propertyChangeSupport.firePropertyChange(PROP_NIP, oldNip, nip);
    }

    /**
     * @return the dataRejestracjiFirmy
     */
    public Date getDataRejestracjiFirmy() {
        return dataRejestracjiFirmy;
    }

    /**
     * @param dataRejestracjiFirmy the dataRejestracjiFirmy to set
     */
    public void setDataRejestracjiFirmy(Date dataRejestracjiFirmy) {
        java.util.Date oldDataRejestracjiFirmy = this.dataRejestracjiFirmy;
        this.dataRejestracjiFirmy = dataRejestracjiFirmy;
        propertyChangeSupport.firePropertyChange(PROP_DATAREJESTRACJIFIRMY, oldDataRejestracjiFirmy, dataRejestracjiFirmy);
    }

}
