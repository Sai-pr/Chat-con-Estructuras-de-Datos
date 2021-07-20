package eddSaiproG;

import java.io.Serializable;

public class NodoMulti implements Serializable
{

    private Object obj;
    private PilaD pila1;
    private PilaD pila2;
    private ColaD cola12;
    private String etq;
    private NodoMulti sig = null, ant = null, abj = null, arrb = null;

    public NodoMulti(Object obj)
    {
        this.obj = obj;
    }

    public NodoMulti(Object obj, String etq, NodoMulti arrb)
    {
        this.obj = obj;
        this.etq = etq;
        this.arrb = arrb;
    }

    public NodoMulti(Object obj, String etq)
    {
        this.obj = obj;
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

    public NodoMulti getSig()
    {
        return sig;
    }

    public void setSig(NodoMulti sig)
    {
        this.sig = sig;
    }

    public String getEtq()
    {
        return etq;
    }

    public void setEtq(String etq)
    {
        this.etq = etq;
    }

    public NodoMulti getAnt()
    {
        return ant;
    }

    public void setAnt(NodoMulti ant)
    {
        this.ant = ant;
    }

    public NodoMulti getAbj()
    {
        return abj;
    }

    public void setAbj(NodoMulti abj)
    {
        this.abj = abj;
    }

    public PilaD getPila1()
    {
        return pila1;
    }

    public void setPila1(PilaD pila1)
    {
        this.pila1 = pila1;
    }

    public PilaD getPila2()
    {
        return pila2;
    }

    public void setPila2(PilaD pila2)
    {
        this.pila2 = pila2;
    }

    public ColaD getCola12()
    {
        return cola12;
    }

    public void setCola12(ColaD cola12)
    {
        this.cola12 = cola12;
    }

    public NodoMulti getArrb()
    {
        return arrb;
    }

    public void setArrb(NodoMulti arrb)
    {
        this.arrb = arrb;
    }

}
