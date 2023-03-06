
public class Ejercicio1_C {

	public static void main(String[] args) {
		//dado un vector de números, y un número X, que sume todos los números > X y
		//retorne el resultado
		
		int [] vectorDeNumeros = {1,2,5,7,9,10,20,30,40};
		
		int sumarMayoresQue = 9;
		
		int suma = 0;
		
		for(int num: vectorDeNumeros) {
			if(num > sumarMayoresQue) {
				suma +=num;
			}
		}
		
		System.out.println("Este es el vector de nùmeros");
		for(int n:vectorDeNumeros) {
			System.out.print(n + " ");
		}
		System.out.println("");
		System.out.println("Se sumarán los números de dicho vector que sean mayores a " + sumarMayoresQue);
		System.out.println("El resultado es " + suma);
		

	}

}
