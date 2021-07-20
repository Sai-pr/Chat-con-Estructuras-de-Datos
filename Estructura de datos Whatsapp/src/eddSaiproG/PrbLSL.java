/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddSaiproG;

import java.io.Serializable;

/**
 *
 * @author Mauro
 */
public class PrbLSL 
{
    public static void main(String[] args)
    {
        LSL ls = new LSL();
        
        NodoMulti n1 = new NodoMulti(null, "5");
        NodoMulti n2 = new NodoMulti(null, "3");
        NodoMulti n3 = new NodoMulti(null, "4");
        NodoMulti n4 = new NodoMulti(null, "6");
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        
        ls.inserta(n1);
        System.out.println(ls.desp(ls.getR()));
        ls.inserta(n2);
        System.out.println(ls.desp(ls.getR()));
        ls.inserta(n3);
        System.out.println(ls.desp(ls.getR()));
        ls.inserta(n4);
        System.out.println(ls.desp(ls.getR()));
        
        System.out.println(ls.eliminar("5"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("4"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("6"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("2"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("1"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("3"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("30"));
        System.out.println(ls.desp(ls.getR()));
    }
}
