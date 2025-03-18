package java_basico;

public class IfYElseIf {
	public static void main(String[] args) {
		String nombre = "Javier";
		int edad = 19;
		String textoVariable;

		// Método if - else, pero repetimos código
		if(edad >= 18) {
		    System.out.printf("%s tiene %d años y es mayor de edad.%n", 
		            nombre, edad);
		} else {
		    System.out.printf("%s tiene %d años y es menor de edad.%n", 
		            nombre, edad);
		}

		//  Método if - else, pero no repetimos código
		if(edad >= 18){
		    textoVariable = "mayor";
		} else {
		    textoVariable = "menor";
		}

		System.out.printf("%s tiene %d años y es %s de edad%n", 
		            nombre, edad, textoVariable);

		// Operador ternario en la determinación del texto variable

		textoVariable = edad >= 18 ? "mayor": "menor"; 

		System.out.printf("%s tiene %d años y es %s de edad%n", 
		            nombre, edad, textoVariable);
		            
		// Operador ternario y solución en una sola linea + plural de años

		System.out.printf("%s tiene %d año%s y es %s de edad%n", 
		            nombre, edad, 
		            edad == 1 ? "": "s",
		            edad >= 18 ? "mayor": "menor");

		// Ternarios anidados
		// En función de un número del 1 al 3 mostrar que la persona es 
		// campeona, subcampeona o perdedora 

		int podium = 2;
		System.out.printf("%s es %s.%n",
		        nombre, podium == 1 ? 
		                    "campeón": 
		                    podium == 2 ? "subcampeón": "perdedor");
		System.out.println("\n\n\n");
		int numeroDePreguntasRespondidas = 0;
		int podium2 = 1;
		if(podium2 == 1) {
		    numeroDePreguntasRespondidas++;
		    System.out.println("Es campeón");
		}

		if(podium2 == 1) {
		    numeroDePreguntasRespondidas++;
		    System.out.println("Es campeón");
		} else {
		    numeroDePreguntasRespondidas++;
		    System.out.println("No es campeón");
		}

		if(podium2 == 1) {
		    numeroDePreguntasRespondidas++;
		    System.out.println("Es campeón");
		} else if(podium2 == 2) {
		    numeroDePreguntasRespondidas++;
		    System.out.println("Es subcampeón");
		} else if(podium2 == 3) {
		    numeroDePreguntasRespondidas++;
		    System.out.println("Es perdedor");
		} else {
		    numeroDePreguntasRespondidas++;
		    System.out.println("No sabemos lo que es");
		}

		System.out.println(numeroDePreguntasRespondidas);
	}
}
