
public class Ejercicio2_refactor {

	public static void main(String[] args) {
		//Genere una clase que tenga los métodos para realizar la codificación y 
		//decodificación de un string, dado un número de desplazamiento.
		//Esta vez se usa un solo método para evitar código repetido. Todavia se puede
		//hacer refactor cambiando los if por switch
		
		System.out.println("*******************************");
		System.out.println("Probando codificar mensaje");
		System.out.println("El mensaje original es: hola que tal " );
		System.out.println("El resultado es: " );
		
		System.out.println(traducirMensaje("hola que tal",1,"codificar"));
		
		System.out.println("*******************************");
		System.out.println("Probando decodificar mensaje");
		System.out.println("El mensaje original es: ipmbarvfaubm" );
		System.out.println("El resultado es: " );
		
		System.out.println(traducirMensaje("ipmbarvfaubm",1,"decodificar"));

	}//end of main
	
	public static String traducirMensaje(String mensaje,int clave, String operacion) {
		//Ahora las operaciones de codificación y decodificación se realizan
		//en el mismo método, de acuerdo al parámetro "operación"
		
		String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
		int cantLetrasAbc = abecedario.length();
		
		String resultadoMsj=""; //lo que será devuelto en el método
		
		int nuevoIndiceEnAbc=0; //para usar con indexOf contra abecedario
				
		char [] mensajeEnArray = mensaje.toCharArray();
		int cantLetrasMsj = mensajeEnArray.length;
		
		for(int i=0; i<cantLetrasMsj; i++) {
			
			char letraOriginal = mensajeEnArray[i];
			int indiceEnAbc=abecedario.indexOf(letraOriginal);
			
			if (operacion.equals("codificar")){
				nuevoIndiceEnAbc = indiceEnAbc + clave;
				
				//Ciudado con los errores "out of bounds"
				if (nuevoIndiceEnAbc >= cantLetrasAbc) {
					nuevoIndiceEnAbc -= cantLetrasAbc;				
					
				}
				
			}else if(operacion.equals("decodificar")) {
				nuevoIndiceEnAbc = indiceEnAbc - clave;
				
				//Ciudado con los errores "out of bounds"
				if (nuevoIndiceEnAbc < 0) {
					nuevoIndiceEnAbc += cantLetrasAbc;				
					
				}
				
			}
			
			//letra (de)codificada se agrega al mensaje
			resultadoMsj+= abecedario.charAt(nuevoIndiceEnAbc);
		}//end of for
		return resultadoMsj;
		
	}//end of traducirMensaje

}//end of class
