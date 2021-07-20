/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardar;

import eddSaiproG.ArbolBinario;
import eddSaiproG.NodoArb;
import eddSaiproG.NodoMulti;
import java.io.Serializable;

/**
 *
 * @author SaiproG
 */
public class Guardar implements Serializable
{

    private NodoMulti r;
    private ArbolBinario arbR[] = new ArbolBinario[27];

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

    /**
     * @return the arbR
     */
    public ArbolBinario[] getArbR()
    {
        return arbR;
    }

    /**
     * @param arbR the arbR to set
     */
    public void setArbR(ArbolBinario[] arbR)
    {
        this.arbR = arbR;
    }

    /**
     * @return the arbR
     */
    /**
     * @return the hash
     */
}
