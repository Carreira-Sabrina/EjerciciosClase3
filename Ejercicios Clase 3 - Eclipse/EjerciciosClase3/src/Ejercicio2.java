
public class Ejercicio2 {

	public static void main(String[] args) {
		// Genere una clase que tenga los métodos para realizar la codificación y 
		// decodificación de un string, dado un número de desplazamiento.
		
		//Hay mucho còdigo repetido !!!!!!!!!!!! Lo unico que cambia es la suma y la resta
		
		
		System.out.println(codificarMensaje("abc ",1)); //OK
		
		
		System.out.println(decodificarMensaje( "ipmbarvfaubm",1));

	} // end of main
	
	public static String decodificarMensaje(String mensaje, int clave) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
		int cantLetrasAbc = abecedario.length();
		
		//Acà resto
		String mensajeDecodificado="";
		
		char [] mensajeEnArray = mensaje.toCharArray();
		int cantLetrasMsj = mensajeEnArray.length;
		
		for(int i=0; i<cantLetrasMsj; i++) {
			char letraOriginal = mensajeEnArray[i];
	
			int indiceEnAbc=abecedario.indexOf(letraOriginal);
			
			int nuevoIndiceEnAbc = indiceEnAbc - clave;
			
			//Ciudado con los errores "out of bounds"
			if (nuevoIndiceEnAbc < 0) {
				nuevoIndiceEnAbc += cantLetrasAbc;				
				
			}//end of if
						
			mensajeDecodificado += abecedario.charAt(nuevoIndiceEnAbc);
			
			
		}//end of for
		
		return mensajeDecodificado;
		
		
		
	}//end of decodificarMensaje
	
	public static String codificarMensaje(String mensaje, int clave) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
		int cantLetrasAbc = abecedario.length();
		
		String mensajeCodificado="";
		
		//Acà sumo
		char [] mensajeEnArray = mensaje.toCharArray();
		int cantLetrasMsj = mensajeEnArray.length;
		
		for(int i=0; i<cantLetrasMsj; i++) {
			char letraOriginal = mensajeEnArray[i];
	
			int indiceEnAbc=abecedario.indexOf(letraOriginal);
			
			int nuevoIndiceEnAbc = indiceEnAbc + clave;
			
			//Ciudado con los errores "out of bounds"
			if (nuevoIndiceEnAbc >= cantLetrasAbc) {
				nuevoIndiceEnAbc -= cantLetrasAbc;				
				
			}//end of if
						
			mensajeCodificado += abecedario.charAt(nuevoIndiceEnAbc);
			
			
		}//end of for
		
		return mensajeCodificado;
		
	}//end of codificarMensaje

} // end of class
