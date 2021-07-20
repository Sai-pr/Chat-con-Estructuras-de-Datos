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
public class ColaD implements Serializable
{

    private Nodo atras;
    private Nodo frente;

    public void insertar(Object dato)
    {
        Nodo nuevo = new Nodo(dato);
        if (getFrente() == null)
        {
            setFrente(nuevo);
            setAtras(nuevo);
        } else
        {
            getAtras().setSig(nuevo);
            setAtras(nuevo);
        }
    }

    public Object eliminar()
    {

        if (getFrente() != null)
        {
            Nodo temp = getFrente();
            if (getFrente() == getAtras())
            {
                setFrente(null);
                setAtras(null);
            } else
            {
                setFrente(getFrente().getSig());
            }
            return temp.getDato();
        } else
        {
            return null;
        }

    }

    public String imprimir()
    {
        String s = "";
        Nodo temp = getFrente();
        while (temp != null)
        {
            System.out.print(temp.getDato() + "\n");
            s += temp.getDato() + "\n";
            temp = temp.getSig();
        }
        return s;
    }

    public Nodo getAtras()
    {
        return atras;
    }

    public void setAtras(Nodo atras)
    {
        this.atras = atras;
    }

    public Nodo getFrente()
    {
        return frente;
    }

    public void setFrente(Nodo frente)
    {
        this.frente = frente;
    }
    
}
