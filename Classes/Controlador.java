package Classes;
/***************************************************
controlador.java
Autor: Diego Morales, Javier Azurdia
Fecha: 08/11/2021

Driver program. Instancia la vista y el modelo,
y los comunica de acuerdo con las elecciones del
usuario.
***************************************************/
import java.util.ArrayList;

public class Controlador {
    
    public static void main(String[] args){
        
        //Iniciando catálogo. 
        ArrayList <Producto> catalogo = new ArrayList<Producto>();
        catalogo.add(new Smartphone(0, 0, "patito", "date", 0));
        catalogo.add(new Cellphone(0, 0, "patito", "date", 0));
        catalogo.add(new Phone(0, 0, "patito", "date", 0));
        catalogo.add(new Camera(0, 0, "patito", "date", 0));
        catalogo.add(new Smartphone(0, 0, "patito", "date", 0));
        catalogo.add(new Smartphone(0, 0, "patito", "date", 0));


        
        
        Vista v = new Vista();
        //ArrayList<producto> carrito=new ArrayList<producto>(); 
        //Bienvenida
        //Menu de inicio
        // ver productos
        switch (v.menuOpciones2()) {
            case 1:
                v.menuPrductos();// devuelve un int. 

                
                break;
                
            case 2:

                break;
            
        }
    }

    /**
     * menu de inicio
     * Ver el carrito...
     * ver productos, se despliega la lista de productos que hay. 
     *      probar producto
     *      añadir al carrito
     * 
     * 
     * 
     * 
     *
     */

    
    
    
    public void menuProductos(int opcion2, Producto producto){ // para añadir producto es necesario un método de la vista que compare. 
        switch (opcion2) {
            case 1://probar producto
                producto.execute();
                break;

            case 2:
                // añadir al carrito. 
                break;
            
        }
    }

    




}
