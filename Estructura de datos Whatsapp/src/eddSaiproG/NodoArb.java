package eddSaiproG;

import java.io.Serializable;

/*uthor SaiproG
 */
public class NodoArb implements Serializable
{

    private String etq;
    private Object obj;
    private NodoArb izq = null;
    private NodoArb der = null;
    private NodoMulti hilo = null;

    public NodoArb()
    {
    }

    public NodoArb(String etq, Object obj)
    {
        this.etq = etq;
        this.obj = obj;
    }
    
    public NodoArb(String etq, Object obj, NodoMulti hilo)
    {
        this.etq = etq;
        this.obj = obj;
        this.hilo = hilo;
    }

    public String getEtq()
    {
        return etq;
    }

    public void setEtq(String etq)
    {
        this.etq = etq;
    }

    public Object getObj()
    {
        return obj;
    }

    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    public NodoArb getIzq()
    {
        return izq;
    }

    public void setIzq(NodoArb izq)
    {
        this.izq = izq;
    }

    public NodoArb getDer()
    {
        return der;
    }

    public void setDer(NodoArb der)
    {
        this.der = der;
    }

    public NodoMulti getHilo()
    {
        return hilo;
    }

    public void setHilo(NodoMulti hilo)
    {
        this.hilo = hilo;
    }

}
