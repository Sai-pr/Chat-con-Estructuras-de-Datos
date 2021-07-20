/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddSaiproG;

/**
 *
 * @author Mauro
 */
public class PrbLSLC
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LSLC ls =new LSLC();
        
        
        NodoMulti n1 = new NodoMulti(null, "7");
        NodoMulti n2 = new NodoMulti(null, "8");
        NodoMulti n3 = new NodoMulti(null, "1");
        NodoMulti n4 = new NodoMulti(null, "6");
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        
        ls.inserta(n1);
        System.out.println(ls.desp(ls.getR().getSig()));
        ls.inserta(n2);
        System.out.println(ls.desp(ls.getR().getSig()));
        ls.inserta(n3);
        System.out.println(ls.desp(ls.getR().getSig()));
        ls.inserta(n4);
        System.out.println(ls.desp(ls.getR().getSig()));
        
        System.out.println(ls.eliminar("4"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("9"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("6"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("7"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("1"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("8"));
        System.out.println(ls.desp(ls.getR()));
        
    }
    
}
