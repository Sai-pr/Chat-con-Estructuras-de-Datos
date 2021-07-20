package eddSaiproG;

import java.io.Serializable;

public class Multilistas implements Serializable
{
    public static NodoMulti insertar(NodoMulti r, NodoMulti aInsertar, NodoMulti arrb, int nivel, String etqs[])
    {
        if (nivel == etqs.length - 1)
        {
            //Verificar que no exista
            NodoMulti aux = r;
            int i = 0; //Numero que tendra si se repite
            String s = etqs[nivel];
            boolean b = false;
            System.out.println("Inicio");
            while (aux != null)
            {
                if (aux.getEtq().toUpperCase().trim().equals(s.toUpperCase().trim()))
                {
                    i++;
                    s = etqs[nivel] + "(" + i + ")";
                    b = true;
                }
                aux = aux.getSig();
            }
            if (b) //Si habia repetidos, entonces...
            {
                aInsertar.setEtq(s);
            }
            //////////////////////////////////////////
            aInsertar.setArrb(arrb);
            LSL ls = new LSL();
            ls.setR(r);
            ls.inserta(aInsertar);
            r = ls.getR();
            return r;
        } else
        {
            NodoMulti aux = buscar(r, etqs[nivel]);
            if (aux != null)
            {
                aux.setAbj(insertar(aux.getAbj(), aInsertar, arrb, nivel + 1, etqs));
            } else
            {
                System.out.println("No encontre: " + etqs[nivel] + " en el nivel: " + nivel + " para insertar.");
            }
            return r;
        }
    }

    public static NodoMulti[] eliminar(NodoMulti r, int nivel, String etqs[], NodoMulti er[])
    {
        if (nivel == etqs.length - 1)
        {
            LSL ls = new LSL();
            ls.setR(r);
            er[1] = ls.eliminar(etqs[nivel]);
            r = ls.getR();
            er[0] = r;
            return er;
        } else
        {
            NodoMulti aux = buscar(r, etqs[nivel]);
            if (aux != null)
            {
                aux.setAbj(eliminar(aux.getAbj(), nivel + 1, etqs, er)[0]);
            } else
            {
                System.out.println("No encontre: " + etqs[nivel] + " en el nivel " + nivel);
            }
            er[0] = r;
            return er;
        }
    }

    public static String desp(NodoMulti r, int nivel)
    {
        String s = "";
        while (r != null)
        {
            String ss = "";
            for (int i = 0; i < nivel; i++)
            {
                ss += "\t";
            }
            s += "Nivel: " + String.valueOf(nivel) + "\n";
            s += ss + r.getEtq() + "\n";
            s += desp(r.getAbj(), nivel + 1) + "\n";
            r = r.getSig();
        }
        return s;
    }

    public static NodoMulti buscar(NodoMulti raizDondeBuscar, String etqABuscar)
    {
        NodoMulti aux = null;
        while (raizDondeBuscar != null)
        {
            if (raizDondeBuscar.getEtq().equals(etqABuscar))
            {
                aux = raizDondeBuscar;
                break;
            } else
            {
                raizDondeBuscar = raizDondeBuscar.getSig();
            }
        }
        return aux;
    }

}
