import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio1_B {

	public static void main(String[] args) {
		//b Dados 3 números y un orden (ascendente o descendente) que ordene los 
		//mismos y los retorne en un vector de 3
		
		Scanner entradaUsuario = new Scanner(System.in);
		
		System.out.println("Se pedirán tres números y si se los ordenará en forma ascendente o descendente");
		System.out.println("Ingrese el primer nùmero: ");
		int primerNum = entradaUsuario.nextInt();
		System.out.println("Ingrese el segundo nùmero: ");
		int segundoNum = entradaUsuario.nextInt();
		System.out.println("Ingrese el tercer nùmero: ");
		int tercerNum = entradaUsuario.nextInt();
		
		entradaUsuario.nextLine(); //para evitar que saltee el input siguiente
		
		System.out.println("Ingrese \"A\" para ordenar en forma ascendente o \"D\" "
				+ "para ordenar en forma descendente ");
		
		
		String orden = entradaUsuario.nextLine().toUpperCase();
		//ORDEN DEBE SER A O D. No se puede comparar con ==
	
		System.out.println("La opcion elegida fue " + orden);
		
		
		
		//Ahora toca ordenar los números con la función
		
		int [] resultado =  ordenarNumeros(primerNum,segundoNum,tercerNum,orden);
		
		System.out.println("Los números a ordenar eran "  + primerNum + ", " + segundoNum + " y " + tercerNum);
		if(orden.equals("A")){
			System.out.println("El orden elegido fue ascendente");
		}else {
			System.out.println("El orden elegido fue descendente" );
		}
		
		
		System.out.println("El resultado es: ");
		for(int num : resultado) {
			System.out.print(num + " ");
		}
		
	}//end of main
	
	public static int[] ordenarNumeros(int a,int b, int c,String orden) {
			
		int [] arrayDeParametros = {a,b,c};
		
		//Hay que hacer sort en ambos casos
		Arrays.sort(arrayDeParametros);
		//No pregunto por el ascendente porque se ordena siempre !	
		if (orden.equals("D")) {
			//Orden descendente
			for (int i = 0, j= arrayDeParametros.length - 1; i<j; i++, j--) {
				int temp = arrayDeParametros[i];
				arrayDeParametros[i] = arrayDeParametros[j];
				arrayDeParametros[j] = temp;
			}
		}
						
		return arrayDeParametros;
		
	}//end of method

} // end of class
