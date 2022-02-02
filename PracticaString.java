import java.util.Scanner;

public class PracticaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pedirnumero = new Scanner (System.in);
		System.out.println("dime el numero de ejercicio");
		int ejercicio = (pedirnumero.nextInt());
			
		switch(ejercicio) {
			case 1:
				
				// Escribe un programa que te calcule la largura de un String que pides al usuario.
		
				// Metodo Length
				
				String ordenador = "ordenador";
				System.out.println(ordenador.length());	
				
				
			break;
			
			case 2:
				
				// toUpperCase() y toLowerCase()
				
				String nombreUsuario = "JAVIER MI AMIGO";
								
				System.out.println(nombreUsuario.toLowerCase());
				
				break;
				
			case 3:
				
				// toUpperCase() y toLowerCase()
				
				String nombreUsuario2 = "javier tu amigo";
								
				System.out.println(nombreUsuario2.toUpperCase());
				
				break;
				
			case 4:
				String nombreUsuario4 = "javier tu amigo";
				String nuevoNombre = nombreUsuario4.substring(3, 10);
				System.out.println(nuevoNombre);
				
				break;
				
			case 5:
				// escribe un programa que reemplace una cadena por otra (por ejemplo "Hola Arrate" 
				//por "Hola Iker");
				
				
				System.out.println("dame un saludo");
				Scanner pedirAlUsuario2 = new Scanner (System.in);
				String saludo = (pedirAlUsuario2.nextLine());				
				String nuevosaludo = "Hola Papa";
				String sNuevaURL = saludo.replace(saludo, nuevosaludo);
				System.out.println(nuevosaludo);
				
					
									
				
		}//switch
	
			
	}

	private static String reemplazar(String saludo, String nuevosaludo) {
		// TODO Auto-generated method stub
		return null;
	}

}
