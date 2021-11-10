/***************************************************
Vista.java
Autor: Diego Morales, Javier Azurdia
Fecha: 08/11/2021

Vista. Responsable de toda interaccion con el usuario.
***************************************************/
package Classes;
import java.util.ArrayList;
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
					"1. Ver productos\n" +
					"2. Ver carrito de compras\n" +
					"3. Pagar\n"+
					"4. Salir\n"; 

			System.out.println(s);
			op = scan.nextInt();
		}catch (Exception e){
			error();
			scan.next();
		}
		return op;
	}

		/*Metodo para elegír una opción
	@return número de opción
	*/
	public int menuOpciones2(){
		int op=0;
		try{
			String s = "¿Que deseas hacer?\n" +
					"1. Comprar Productos\n" +
					"2. Probar Productos\n";
			System.out.println(s);
			op = scan.nextInt();
		}catch (Exception e){
			error();
			scan.next();
		}
		return op;
	}


/*Metodo para elegír una opción
@return número de opción
*/
public int menuPrductos(){
	int op=0;
	try{
		String s = "Seleccione un producto\n" +
				"1. Smartphone\n" +
				"2. Celular\n" +
				"3. Telefono Fijo\n" +
				"4. Camara\n"+
				"5. Computadora pesonal Desktop\n"+ 
				"6. Computadora personal Laptop\n" +
				"7. Smart TV\n" +
				"8. Tablet\n" +
				"9. SmartWatch\n"; 				

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
	public int pedirNumero(){
		int num=0;
		try{
			System.out.println("Ingrese el numero de teléfono al que desea llamar");
			num = scan.nextInt();
		}catch (Exception e){
			error();
			scan.next();
		}
		return num; 
	}

	/*Metodo para pedir datos
	*/
	public String[] PedirDatosClienteString(){
		String[] data={"", ""};
		try{
			System.out.println("Ingrese El nombre del cliente: ");
			data[0] = scan.nextLine();
			System.out.println("Ingrese la fecha de la compra: ");
			data[1] = scan.nextLine();
		}catch (Exception e){
			error();
			scan.next();
		}
		return data; 
	}

		/*Metodo para pedir datos
	*/
	public int PedirDatosClienteInt(){
		int nit=0;
		try{
			System.out.println("Ingrese NIT del cliente: ");
			nit= scan.nextInt();
		}catch (Exception e){
			error();
			scan.next();
		}
		return nit; 
	}


	/*Metodo para visitar un sitio web
	*/
  	public String PedirURL(){
		String url="";
		try{
			System.out.println("Ingrese la dirección web que desea visitar ");
			url = scan.next();
		}catch (Exception e){
			error();
			scan.next();
		}
		return url; 
	}

	/*Metodo para mostrar mensaje
	*/
	public void Internet(String url){
		System.out.println("Visitando el sitio: "+url);
	}


	/*Metodo para mostrar mensaje
	*/
	public void Foto(boolean comp){
		if(comp == true){
			System.out.println("Se ha tomado una fotografía");
		}else{
			// ya we, está bien, ponme 100. 
		}
	}

	/*Metodo para mostrar mensaje
	*/
	public void video(boolean comp){
		if(comp == true){
			System.out.println("Se esta reproduciendo un video");
		}else{
			//que andas viendo aquí, vete y ponme 100 :)
		}
	}

	/*Metodo para mostrar mensaje
	*/
	public String pedirJuego(){
		String juego="";
		try{ 
			System.out.println("Ingrese el videojuego que desea jugar");
			juego = scan.next();
		}catch (Exception e){
			error();
			scan.next();
		}
		return juego;
	}

	/*Metodo para mostrar mensaje
	*/
	public void Jugar(String juego){
		System.out.println("Ejecutando el juego: "+ juego);
	}

	/*Metodo para mostrar mensaje de despedida al usuario
	*/
	public void factura(int nit, int total, int factura, String nombre, String fecha, ArrayList<Integer> precios, ArrayList<String> articulos){
		System.out.println("********************Electorica Latinoamericana********************");
		System.out.println("Factura numero: "+factura);
		System.out.println("Nombre del cliente: "+nombre);
		System.out.println("NIT: "+nit);

		print("*** Listado de Artículos ***");
		for(int i = 0; i < precios.size(); i++ ){
			print(articulos.get(i) + "  Q." + precios.get(i));
		}
		System.out.println("Fecha de compra: "+fecha);
		System.out.println("Total a cancelar: Q"+total);
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
