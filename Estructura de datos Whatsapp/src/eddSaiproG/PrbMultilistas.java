package eddSaiproG;

/*
 * @author SaiproG
 */
public class PrbMultilistas
{

    public static void main(String[] args)
    {
        NodoMulti r = null; //referencia al inicio de la lista

        NodoMulti p1 = new NodoMulti(null, "Francia");
        NodoMulti p2 = new NodoMulti(null, "Afganistan");
        NodoMulti p3 = new NodoMulti(null, "Mexico");

        NodoMulti e1 = new NodoMulti(null, "Edo Mexico");
        NodoMulti e2 = new NodoMulti(null, "Jalisco");
        NodoMulti e3 = new NodoMulti(null, "Guerrero");

        NodoMulti m1 = new NodoMulti(null, "Xonacatlan");
        NodoMulti m2 = new NodoMulti(null, "Toluca");
        NodoMulti m3 = new NodoMulti(null, "Valle de Bravo");

        //Empezamos a insertar los paises
/*      String etqs[] = new String[1];
        etqs[0] = "Francia";
        r = Multilistas.insertar(r, p1, 0, etqs);
        etqs[0] = "Afganistan";
        r = Multilistas.insertar(r, p2, 0, etqs);
        etqs[0] = "Mexico";
        r = Multilistas.insertar(r, p3, 0, etqs);

        //Ahora insertamos los estados del pais
        etqs = new String[2];
        etqs[0] = "Mexico";
        etqs[1] = "Edo Mexico";
        r = Multilistas.insertar(r, e1, 0, etqs);
        etqs[1] = "Jalisco";
        r = Multilistas.insertar(r, e2, 0, etqs);
        etqs[1] = "Valle de Bravo";
        r = Multilistas.insertar(r, e3, 0, etqs);

        //Ahora insertamos los municipios
        etqs = new String[3];
        etqs[0] = "Mexico";
        etqs[1] = "Edo Mexico";
        etqs[2] = "Xonacatlan";
        r = Multilistas.insertar(r, m1, 0, etqs);
        etqs[2] = "Toluca";
        r = Multilistas.insertar(r, m2, 0, etqs);
        etqs[2] = "Valle de Bravo";
        r = Multilistas.insertar(r, m3, 0, etqs);

        System.out.println("Multilista insertada: \n");
        System.out.println(Multilistas.desp(r, 0));

        etqs = new String[2];
        etqs[0] = "Mexico";
        etqs[1] = "Edo Mexico";
        System.out.println("");
        NodoMulti ar[] = new NodoMulti[2];
        ar = Multilistas.eliminar(r, 0, etqs, ar);
        r = ar[0];
        System.out.println("\nMultilista eliminando: \n");
        System.out.println(Multilistas.desp(ar[0], 0));

        System.out.println("Eliminado: \n");
        System.out.println(Multilistas.desp(ar[1], 0));
*/
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
        String s = "HOLA CRAYOLA";
        System.out.println(s.toUpperCase());
        System.out.println("\n" + s);
        
        
    }

}
