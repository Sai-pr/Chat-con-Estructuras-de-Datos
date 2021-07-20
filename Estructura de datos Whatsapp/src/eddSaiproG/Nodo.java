/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddSaiproG;

import java.io.Serializable;

/**
 *
 * @author SaiproG
 */
public class Nodo implements Serializable
{

    private Object dato;
    private Nodo sig = null;

    public Nodo(Object dato)
    {
        this.dato = dato;
    }

    public Object getDato()
    {
        return dato;
    }

    public void setDato(Object dato)
    {
        this.dato = dato;
    }

    public Nodo getSig()
    {
        return sig;
    }

    public void setSig(Nodo sig)
    {
        this.sig = sig;
    }
}
