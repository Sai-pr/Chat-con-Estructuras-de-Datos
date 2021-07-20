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
public class LSLC implements Serializable
{
    private NodoMulti r=null;

    /**
     * @return the r
     */
    public NodoMulti getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoMulti r)
    {
        this.r = r;
    }
    
    public boolean inserta(NodoMulti n)
    {
        if (n==null)
        {
            return false;
        } else
        {
            //el primero en la lista
            if (r==null)
            {
                r=n;
                r.setSig(r);
            } else
            {
                //menor al primero de la lista
                //último de la lista
                if (n.getEtq().compareTo(r.getSig().getEtq())<=0 ||
                    n.getEtq().compareTo(r.getEtq())>=0     )
                {
                    n.setSig(r.getSig());
                    r.setSig(n);
                    if (n.getEtq().compareTo(r.getEtq())>=0 )
                    {
                        r=n;
                    }
                    
                } else
                {
                    //cuando el dato va en medio de la lista
                    NodoMulti aux=r;
                    boolean b=true;
                    while ( b)
                    {
                        if(n.getEtq().compareTo(aux.getSig().getEtq())<0)
                        {
                            n.setSig(aux.getSig());
                            aux.setSig(n);
                            b=false;
                        }else
                        {
                            aux=aux.getSig();
                        }
                    }
                }
            }
            return true;
        }
    }
    
    public NodoMulti eliminar(String etq)
    {
        if (r==null)
        {
            return null;
        } else
        {
            NodoMulti aux=null;
            if(etq.compareTo(r.getSig().getEtq())>=0 &&
               etq.compareTo(r.getEtq())<=0  )
            {
                if (r.getSig().getEtq().equals(etq))
                {
                    aux=r.getSig();
                    r.setSig(aux.getSig());
                    aux.setSig(null);
                    if (r==aux)
                    {
                        r=null;
                    }
                } else
                {
                    NodoMulti aux2=r.getSig();
                    boolean b=true;
                    while (b)
                    {
                        if(etq.compareTo(aux2.getSig().getEtq())<=0)
                        {
                            if (aux2.getSig().getEtq().equals(etq))
                            {
                                aux=aux2.getSig();
                                aux2.setSig(aux.getSig());
                                aux.setSig(null);
                                b=false;
                                if(r==aux)
                                {
                                    r=aux2;
                                }
                            } else
                            {
                                aux2=aux2.getSig();
                            }
                        }else
                        {
                            break;
                        }
                    }
                }  
            }
            return aux;
        }
    }
    
    public String desp(NodoMulti aux)
    {
        String s="";
        if(aux == null)
        {
            s="no hay datos";
        }else
        {
            aux=aux.getSig();
            do
            {
                s+=aux.getEtq();
                aux=aux.getSig();
            }while (aux!=r.getSig());
        }
        return s;
    }
}
