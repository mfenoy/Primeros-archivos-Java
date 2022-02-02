
public class PracticaJueves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaraciones
		//indica []da indicacion lista
		String ordenador = "ordenador";
		String coches []= {"Fiat","Seat","Hyundai"};
		
		
		// Metodo Length
		
		System.out.println(coches.length);		
		System.out.println(ordenador.length());	
		
		// Metodo concat()
		
		String laptop = "soy el portatil";
		String sumaDeElementos =ordenador.concat(laptop);
		System.out.println(sumaDeElementos);
		//
		
		// Metodo equals
		
		System.out.println(ordenador.equals("ordenador"));
		
		//Metodo indefox
		
		System.out.println(ordenador.indexOf("z"));
		
		// z es menos -1 si no encuentra la z
		
		if (ordenador.indexOf("z") == -1 ) {
			System.out.println("no existe el caracter en la palabra");
			
		}
			
		// nuevo ejemplo
		
		String estudiante = "estudianteBAJA";
		
		if (ordenador.indexOf("BAJA") == -1 ) {
			System.out.println("el estudiante esta en activo");}
		else {
			System.out.println("Esta de baja");
		}
		
		// Metodo charArt()
		
		System.out.println(estudiante.charAt(2));
		
		// toUpperCase() y toLowerCase()
		
		System.out.println(estudiante.toLowerCase());
		
		// ejemplo
		
		String nombre = "Miguel";
				
		
	
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	}

}
