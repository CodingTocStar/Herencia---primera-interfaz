/*
Vamos a crear una interfaz con un método abstracto. 
Luego desde el main intentaremos instanciar un objeto a partir de la interfaz
 */
package Main;

import Entidades.MiClase;
import Entidades.MiInterfaz;

/*===============================================*/
 /*===============================================*/
public class Java2Encuentros19Al28CreandoPrimerInterfaz {

    public static void main(String[] args) {
        MiInterfaz instancia = new MiClase();

        instancia.miMetodoAbstracto();
    }

}
