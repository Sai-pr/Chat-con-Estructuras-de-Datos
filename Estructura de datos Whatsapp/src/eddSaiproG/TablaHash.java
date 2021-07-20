/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddSaiproG;

import javax.swing.JOptionPane;

/**
 * @author SaiproG
 */
public class TablaHash
{

    public static ArbolBinario[] inserta(ArbolBinario arbR[], NodoArb ins)
    {
        int ascii = ascii(ins.getEtq());
        if (ascii >= 0 && ascii <= 26)
        {
            if (arbR[ascii] == null)
            {
                arbR[ascii] = new ArbolBinario();
            }
            arbR[ascii].setR(arbR[ascii].inserta(arbR[ascii].getR(), ins));
        } else
        {
            System.out.println("ERROR AL INTENTAR INSERTAR EN POSICION == " + ascii);
        }
        return arbR;
    }

    public static ArbolBinario[] eliminar(ArbolBinario arbR[], String etq)
    {
        int ascii = ascii(etq);
        if (arbR[ascii].getR() != null)
        {
            if (ascii >= 0 && ascii <= 26)
            {
                NodoArb arr[] = new NodoArb[2];
                arbR[ascii].elimina(arbR[ascii].getR(), etq, arr);
                arbR[ascii].setR(arr[1]);
            } else
            {
                System.out.println("Error al eliminar en arbR[" + ascii + "] CARACTER NO VALIDO");
            }
        } else
        {
            System.out.println("ERROR AL INTENTAR eliminar EN POSICION arb[" + ascii + "} debido a que es null");
        }
        return arbR;
    }

    /**
     * Retorna el NodoArb que buscabas.
     *
     * @param arbR
     * @param etq
     * @return
     */
    public static NodoArb busqueda(ArbolBinario arbR[], String etq)
    {
        int ascii = ascii(etq);
        NodoArb a = null;
        System.out.println("Tronidos == " + ascii);
        if (ascii >= 0 && ascii <= 26)
        {
            if (arbR[ascii] != null)
            {
                if (ascii >= 0 && ascii <= 26)
                {
                    a = arbR[ascii].busquedaBinaria(arbR[ascii].getR(), etq.toUpperCase().trim());
                } else
                {
                    System.out.println("ERROR AL INTENTAR BUSCAR EN POSICION == " + ascii + " el caracter no es valido");
                }
            } else
            {
                System.out.println("ERROR AL INTENTAR BUSCAR EN POSICION == " + ascii + " arbR[" + ascii + "+]ESTA VACIO");
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Nombre de las personas no pueden comenzar con '" + (char) (ascii + 65) + "' .");
        }

        return a;
    }

    public static int ascii(String s)
    {
        char c[] = s.toUpperCase().toCharArray();
        int ascii = (int) c[0] - 65;
        if (ascii == 144)
        {
            ascii = 26;
        }
        return ascii;
    }
}
