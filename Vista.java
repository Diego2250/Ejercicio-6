
/***************************************************
Vista.java
Autor: Diego Morales, Javier Azurdia
Fecha: 08/11/2021

Vista. Responsable de toda interaccion con el usuario.
***************************************************/
import java.util.Scanner;
public class Vista{
	private Scanner scan;
    /*Costructor de clase*/
	public Vista(){
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

	/*Metodo para llamar a un número de telefono
	*/
	public void Llamada(){
		int num=0;
		try{
			System.out.println("Ingrese el numero de teléfono al que desea llamar");
			num = scan.nextInt();
			System.out.println("Llamando al número "+num);
		}catch (Exception e){
			error();
			scan.next();
		}
	}

	/*Metodo para visitar un sitio web
	*/
  	public void Internet(){
		String url="";
		try{
			System.out.println("Ingrese la dirección web que desea visitar ");
			url = scan.next();
			System.out.println("Visitando la dirección web: "+url);
		}catch (Exception e){
			error();
			scan.next();
		}
	}

	/*Metodo para mostrar mensaje
	*/
	public void Foto(){
		System.out.println("Se ha tomado una fotografía");
	}

	/*Metodo para mostrar mensaje
	*/
	public void Video(){
		System.out.println("Se esta reproduciendo un video");
	}

	/*Metodo para mostrar mensaje
	*/
	public void Jugar(){
		String juego="";
		try{ 
			System.out.println("Ingrese el videojuego que desea jugar");
			juego = scan.next();
			System.out.println("Ejecuntando el jugo: "+juego);
		}catch (Exception e){
			error();
			scan.next();
		}
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

	public void print(String string){
		System.out.println(string);
	}

	public void calling(int phone_number){
		print("LLamando al número" + phone_number);
	}
}
