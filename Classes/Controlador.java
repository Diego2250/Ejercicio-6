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
        catalogo.add(new Desktop(0, 0, "patito", "date", 0));
        catalogo.add(new Laptop(0, 0, "patito", "date", 0));
        catalogo.add(new SmartTV(0, 0, "patito", "date", 0));
        catalogo.add(new Tablet(0, 0, "patito", "date", 0));
        catalogo.add(new SmartWatch(0, 0, "patito", "date", 0));
        
        Vista v = new Vista();
        ArrayList<Producto> carrito = new ArrayList<Producto>(); 
        //Bienvenida
        //Menu de inicio
        // ver productos
        boolean stop = false;
        while (stop == false){
            switch (v.menuOpciones()) {
                case 1: // Ver productos. 
                    switch (v.menuOpciones2()) {
                        case 2:// Probando
                            catalogo.get(v.menuPrductos()-1).execute();
                            break;
                            
                        case 1:// comprando jaja
                            switch (v.menuPrductos()) {
                                case 1:// Smartphone
                                carrito.add(new Smartphone(4000, 03503, "ISamsung", "Ayer", 0353));
                                break;

                                case 2:// 
                                carrito.add(new Cellphone(900, 03503, "ISamsung", "Ayer", 0353));
                                break;

                                case 3:
                                carrito.add(new Phone(900, 03503, "ISamsung", "Ayer", 0353));
                                break;

                                case 4:
                                carrito.add(new Camera(900, 03503, "ISamsung", "Ayer", 0353));
                                break;

                                case 5:
                                carrito.add(new Desktop(900, 03503, "ISamsung", "Ayer", 0353));
                                break;

                                case 6:
                                carrito.add(new Laptop(900, 03503, "ISamsung", "Ayer", 0353));
                                break;

                                case 7:
                                carrito.add(new SmartTV(900, 03503, "ISamsung", "Ayer", 0353));
                                break;

                                case 8:
                                carrito.add(new Tablet(900, 03503, "ISamsung", "Ayer", 0353));
                                break;

                                case 9:
                                carrito.add(new SmartWatch(900, 03503, "ISamsung", "Ayer", 0353));
                                break;
                            }
                            break;
                        
                    }
                    break;
            
                case 2: // ver carrito de compras. 
                    for(int i = 0; i<carrito.size(); i++){
                        v.print(carrito.get(i).get);
                    }

                    break;
            }


                

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
