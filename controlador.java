/***************************************************
controlador.java
Autor: Diego Morales, Javier Azurdia
Fecha: 08/11/2021

Driver program. Instancia la vista y el modelo,
y los comunica de acuerdo con las elecciones del
usuario.
***************************************************/
import java.util.ArrayList;
public class controlador {
    public static void main(String[] args){
        vista v = new vista();
        //ArrayList<producto> carrito=new ArrayList<producto>(); 
        int opcion = 0;
        v.bienvenida();
        while (opcion != 5){
            opcion = v.menuOpciones();
			switch(opcion){
                case 1:
                break; 
                case 2:
                break;
                case 3:
                break;
                case 4:
                v.despedida();
                break;
                default:
				v.opcionInvalida();
				break;
            }
        }
    }
}
