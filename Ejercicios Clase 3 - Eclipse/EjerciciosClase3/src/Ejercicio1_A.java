
public class Ejercicio1_A {

	public static void main(String[] args) {
		// Dado un String y una letra, que cuente la cantidad de apariciones de 
        //la letra en el String
		String texto = "Eclipse es el IDE preferido por los programadores";
		
		char letraAContar = 'e'; //los char deben estar rodeados por comillas simples
		int contador = 0;
		
		//Como con los conocimientos actuales no se pudo iterar por el String, se
		//convierte a array de char
		char textoEnArray[] = texto.toCharArray();
		
		for (int i=0; i<texto.length(); i++) {
			if(textoEnArray[i]==letraAContar) {
				contador = contador +1;
			}
		}
		System.out.println("En el texto \"" + texto + "\"" + " la letra " + letraAContar + " aparece " + contador + " vez/veces");
		
	}

}
