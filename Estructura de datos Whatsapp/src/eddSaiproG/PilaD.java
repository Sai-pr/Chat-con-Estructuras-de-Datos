/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddSaiproG;

import java.io.Serializable;

/*
 * @author SaiproG
 */
public class PilaD implements Serializable
{
    private Nodo tope; // = new Nodo(null);//Top Of Stack
    public void insertar(Object dato)
    {
        Nodo nuevo = new Nodo(dato);
        if (getTope() == null)
        {
            setTope(nuevo);
        } else
        {
            nuevo.setSig(getTope());
            setTope(nuevo);
        }
    }

    public Object eliminar()
    {
        Nodo temp = getTope();
        if (temp != null)
        {
            setTope(getTope().getSig());
            return temp.getDato();
        } else
        {
            return null;
        }
    }

    public String imprimir()
    {
        String s = "";
        Nodo temp = getTope();

        while (temp != null)
        {
            System.out.print(temp.getDato() + "\n");
            s += temp.getDato() + "\n";
            temp = temp.getSig();
        }
        return s;
    }

    public String buscar(String obj)
    {
        String retorna = "";
        Nodo nuevo = new Nodo(null);
        nuevo = getTope();

        while (nuevo != null)
        {
            String aux = nuevo.getDato().toString();
            if (aux.toUpperCase().contains(obj))
            {
                retorna += aux + "\n";
            }
            nuevo = nuevo.getSig();
        }
        if (retorna.equals(""))
        {
            retorna = "No hay incidencias de " + obj;
        }
        return retorna;
    }

    public Nodo getTope()
    {
        return tope;
    }

    public void setTope(Nodo tope)
    {
        this.tope = tope;
    }

}
