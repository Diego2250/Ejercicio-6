/***************************************************
Vista.java
Autor: Diego Morales, Javier Azurdia
Fecha: 08/11/2021

Vista. Responsable de toda interaccion con el usuario.
***************************************************/
import java.util.Scanner;
public class vista{
	private Scanner scan;
    /*Costructor de clase*/
	public vista(){
		scan = new Scanner(System.in);
	}
  /*Metodo para elegír una opción
  @return número de opción
  */
	public int menuOpciones(){
		int op=0;
				try{
			String s = "¿Que deseas hacer?\n" +
					"1. Ver todos los productos\n" +
					"2. Probar funcionalidades de los productos\n" +
					"3. Ver carrito de compras\n" +
					"4. Salir\n";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}

	/*Metodo para mostrar mensaje de despedida al usuario
	*/
	public void despedida(){
		System.out.println("Gracias por usar este programa, adios");
	}
	/*Metodo para mostrar mensaje de bienvenida al usuario
	*/
	public void bienvenida(){
		System.out.println("¡Bienvendio(a) a Electrónica Latinoamericana!");
	}

	/*Metodo para mostrar mensaje
	*/
	public void opcionInvalida(){
		System.out.println("Has elegido una opción inválida.");
	}

    /*Metodo para mostrar mensaje
	*/
	public void productoAnadido(){
		System.out.println("Se ha añadido un producto al carrito");
	}

	/*Metodo para mostrar mensaje
	*/
  public void error(){
    System.out.println("Ha ocurrido un error");
  }
}
