package eddSaiproG;

import java.io.Serializable;

/*
 * @author SaiproG
 */
public class ArbolBinario implements Serializable
{

    private NodoArb r = null;
    NodoArb hilo = null;

    public NodoArb inserta(NodoArb r, NodoArb n)
    {

        if (r == null)
        {
            return n;
        } else
        {
            if (r.getEtq().compareTo(n.getEtq()) > 0) //se va a ala derecha
            {
                r.setIzq(inserta(r.getIzq(), n));
            } else
            {
                r.setDer(inserta(r.getDer(), n));
            }
            return balancear(r);
        }

    }

    /*public NodoArb inserta(NodoArb r, NodoArb n, NodoMulti hilo)
    {
        if (r == null)
        {
            return n;
        } else
        {
            r.setHilo(hilo);
            if (r.getEtq().compareTo(n.getEtq()) > 0) //se va a ala derecha
            {
                r.setIzq(inserta(r.getIzq(), n));
            } else
            {
                r.setDer(inserta(r.getDer(), n));
            }
            return balancear(r);
        }
    }*/
    public void elimina(NodoArb r, String etq, NodoArb arr[])
    {
        if (r == null)
        {
            arr[0] = null;
            arr[1] = balancear(r);
        } else
        {
            if (r.getEtq().equals(etq))//encontre el dato a eliminar
            {
                arr[0] = r;
                if (r.getDer() == null && r.getIzq() == null)//no tiene hijos
                {
                    arr[1] = null;
                } else
                {
                    if (!(r.getDer() != null && r.getIzq() != null))//tiene un null
                    {
                        if (r.getDer() != null)
                        {
                            arr[1] = balancear(r.getDer());
                        } else
                        {
                            arr[1] = balancear(r.getIzq());
                        }
                    } else//cuando tiene dos hijos
                    {
                        if (r.getDer().getIzq() == null)
                        {
                            /*NodoArb se = r.getDer();
                            se.setIzqu(r.getIzqu());
                            r.setDer(null);
                            r.setIzqu(null);
                            arr[1] = se;*/
                            //simplificado
                            arr[1] = balancear(r.getDer());
                            r.getDer().setIzq(r.getIzq());
                        } else
                        {
                            /*NodoArb aux = sucesorE(r.getDer());
                            NodoArb se = aux.getIzqu();
                            aux.setIzqu(se.getDer());
                            se.setDer(r.getDer());
                            se.setIzqu(r.getIzqu());
                            arr[1] = se;*/
                            //simplificado
                            NodoArb se = sucesorE(r.getDer());
                            arr[1] = balancear(se.getIzq());
                            se.setIzq(arr[1].getDer());
                            arr[1].setDer(r.getDer());
                            arr[1].setIzq(r.getIzq());

                        }
                        r.setDer(null);
                        r.setIzq(null);
                    }
                }
            } else
            {
                if (r.getEtq().compareTo(etq) > 0)
                {
                    elimina(r.getIzq(), etq, arr);
                    r.setIzq(arr[1]);
                } else
                {
                    elimina(r.getDer(), etq, arr);
                    r.setDer(arr[1]);
                }
                arr[1] = balancear(r);
            }
        }
    }

    public NodoArb sucesorE(NodoArb r)
    {
        if (r.getIzq().getIzq() != null)
        {
            return sucesorE(r.getIzq());
        } else
        {
            return r;
        }
    }

    public String enOrden(NodoArb r)
    {
        String s = "";
        if (r != null)
        {
            s += enOrden(r.getIzq());
            s += r.getEtq();
            s += enOrden(r.getDer());
        }
        return s;
    }

    /**
     * Recorre TODO el Arbol Binario Balanceado.
     *
     * @param r
     * @param s es la cadena que vas a buscar
     * @param ls
     */
    public void busquedaEnOrden(NodoArb r, String s, LSL ls) //Busca en todo el arbol
    {

        if (r != null)
        {
            busquedaEnOrden(r.getIzq(), s.trim(), ls);
            if (r.getEtq().toUpperCase().trim().startsWith(s.toUpperCase()))
            {
                NodoMulti n = new NodoMulti(null, r.getEtq());
                ls.inserta(n);
            }
            busquedaEnOrden(r.getDer(), s.trim(), ls);
        }

    }

    /**
     * Este metodo busca unicamente un solo NodoMulti implementando Busqueda
     * Binaria eliminando de mitad en mitad, el nodo regresado tiene el hilo
     * usado en la multilista que lleva a sus fechas con conversaciones.
     *
     * @param r albolbinario donde buscar al String s
     * @param s cadena a busacar en el arbol binario r
     * @param ls
     * @return NodoMulti con el hilo que lleva a la Multilista
     */
    public NodoArb busquedaBinaria(NodoArb r, String s)
    {
        NodoArb n = null;
        if (r != null)
        {
            if (r.getEtq().toUpperCase().trim().equals(s))
            {
                System.out.println("r == " + r.getEtq());
                System.out.println("r.getHilo(): " + r.getHilo().getEtq());
                return r;
            } else
            {
                return (s.compareTo(r.getEtq().toUpperCase().trim()) <= 0)
                        ? busquedaBinaria(r.getIzq(), s)
                        : busquedaBinaria(r.getDer(), s);
            }
        }
        return n;
    }

    /**
     * Este metodo retorna una lista con todas las incidencias desde su
     * PARAMETRO, no con el return.
     *
     * @param r arbol donde buscar.
     * @param s Cadena a buscar.
     * @param ls Se manda como parametro, ya que aqui estaran todas las
     * incidencias.
     */
    public void busquedaBinaria(NodoArb r, String s, LSL ls)
    {
        if (r != null)
        {
            if (r.getEtq().toUpperCase().trim().startsWith(s))
            {
                busquedaBinaria(r.getIzq(), s, ls);
                ls.inserta(r.getHilo());
                busquedaBinaria(r.getDer(), s, ls);
            } else if (s.compareTo(r.getEtq().toUpperCase().trim()) < 0)
            {
                busquedaBinaria(r.getIzq(), s, ls);
            } else
            {
                busquedaBinaria(r.getDer(), s, ls);
            }
        }
    }

    public String preOrden(NodoArb r)
    {
        String s = "";
        if (r != null)
        {
            s += r.getEtq();
            s += preOrden(r.getIzq());
            s += preOrden(r.getDer());
        }
        return s;
    }

    public String posOrden(NodoArb r)
    {
        String s = "";
        if (r != null)
        {
            s += posOrden(r.getIzq());
            s += posOrden(r.getDer());
            s += r.getEtq();
        }
        return s;
    }

    public NodoArb getR()
    {
        return r;
    }

    public void setR(NodoArb r)
    {
        this.r = r;
    }

    //Metodos de balanceo del arbol.
    public NodoArb balancear(NodoArb r)
    {
        if (r != null)
        {
            if (altura(r.getIzq(), 0) - altura(r.getDer(), 0) == 2)
            {
                /* desequilibrio hacia la izquierda! */
                if (altura(r.getIzq().getIzq(), 0) >= altura(r.getIzq().getDer(), 0))
                /* desequilibrio simple hacia la izquierda */
                {
                    r = rotar_s(r, true);
                } else
                /* desequilibrio doble hacia la izquierda */
                {
                    r = rotar_d(r, true);
                }
            } else if (altura(r.getDer(), 0) - altura(r.getIzq(), 0) == 2)
            {
                /* desequilibrio hacia la derecha! */
                if (altura(r.getDer().getDer(), 0) >= altura(r.getDer().getIzq(), 0))
                /* desequilibrio simple hacia la derecha */
                {
                    r = rotar_s(r, false);
                } else
                /* desequilibrio doble hacia la derecha */
                {
                    r = rotar_d(r, false);
                }
            }
        }
        return r;
    }

    public NodoArb rotar_d(NodoArb r, boolean izq)
    {
        if (izq)
        /* rotación izquierda */
        {
            r.setIzq(rotar_s(r.getIzq(), false));
            r = rotar_s(r, true);
        } else
        /* rotación derecha */
        {
            r.setDer(rotar_s(r.getDer(), true));
            r = rotar_s(r, false);
        }

        return r;
    }

    public NodoArb rotar_s(NodoArb r, boolean izq)
    {
        NodoArb tmp;
        if (izq)
        /* rotación izquierda */
        {
            tmp = r.getIzq();
            r.setIzq(tmp.getDer());
            tmp.setDer(r);
        } else
        /* rotación derecha */
        {
            tmp = r.getDer();
            r.setDer(tmp.getIzq());
            tmp.setIzq(r);
        }
        return tmp;
    }

    public int altura(NodoArb r, int a)
    {
        if (r == null)
        {
            return a;
        } else
        {
            return max(altura(r.getIzq(), a + 1), altura(r.getDer(), a + 1));
        }

    }

    public int max(int a, int b)
    {
        return a > b ? a : b;
    }

}
