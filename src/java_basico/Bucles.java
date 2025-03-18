package java_basico;

public class Bucles {
	public static void main(String[] args) {
	int multiploDe = 5;
	int numInicial = 25;
	long numFinal = 35;
	long contador = 0;
	
	// A lo bestia
	for(long i = numInicial; i <= numFinal; i++) {
		if(i % multiploDe == 0) contador++;
	}
	
	System.out.printf("Entre %d y %d hay %d múltiplos de %d.%n",
			numInicial, numFinal, contador, multiploDe);
	
	// Un poco optimizado
	long i = numInicial;
	contador = 0;
	for(; i <= numFinal; i++) {
		if(i % multiploDe == 0) {contador++;break;}
	}
	for(i = i + multiploDe; i <= numFinal; i+=multiploDe) {
		contador++;
	}
	
	System.out.printf("Entre %d y %d hay %d múltiplos de %d.%n",
			numInicial, numFinal, contador, multiploDe);
	}
}
