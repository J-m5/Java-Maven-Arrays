import java.util.Arrays;

public class primerjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("HOLAA MUNDOO DESDE JAVA");
		
		int a= 8;
		int b= 7;
		int resultado = a * b;
		System.out.println("Resultado:" + resultado);
		
		
		// Como se declara un arreglo en Java?
		// Basicamente se indica el tipo de dato, seguido de corchetes y el nombre que se le dara a la variable.
		// Ejemplos:
		// Forma 1: Declarar y luego crear el arreglo
		int [] numeros = new int[5];
		// Forma 2: Declarar e inicializar con valores diferentes
		int[] valores = {1, 2, 3, 4, 5};
		
		// Metodos y utilidades principales para arreglos
		// La clase Arrays pertenece al paquete java.util y contiene metodos utiles para trabajar con arreglos como ordenar, buscar, copiar y comparar.
		// Arrays.sort(): Ordena los elementos de un arreglo en orden ascendente.
		int[] valore = {5, 2, 8, 1, 3};
		Arrays.sort(valore);
		System.out.println(Arrays.toString(valore));
		
		// Arrays.binarySearch(): Busca un elemento dentro del arreglo, el arreglo debe estar ordenado antes de usarlo.
		int [] numero = {1, 3, 5, 7, 9};
		int posicion = Arrays.binarySearch(numero, 5);
		System.out.println("El numero 5 esta en la posicion: " + posicion);
		
		// Arrays.copyOf(): Copia un arreglo en otro nuevo.
		int[] original = {10, 20, 30};
		int[] copia = Arrays.copyOf(original,  5);
		System.out.println(Arrays.toString(copia));
		
		// Arrays.fill(): Llena todo el arreglo con un mismo valor.
		int[] datos =new int[4];
		Arrays.fill(datos, 7);
		System.out.println(Arrays.toString(datos));
		
		// Arrays.toString(): Convierte el arreglo en texto para poder imprimirlo facilmente.
		int[] numeroa = {4, 5, 6};
		System.out.println(Arrays.toString(numeroa));
		
		// Como se reccoren los arreglos en Java?
		// Recorrer un arreglo significa acceder a cada uno de sus elementos para leerlos o modificarlos.
		// For Tradicional (con indices)
		int[] valoree = {10, 20, 30, 40, 50};
		for (int i = 0; i < valoree.length; i++) {
			System.out.println("Posicion " + i + ":" + valoree[i]);
		}
		
		// For-each
		int[] valoress = {10, 20, 30, 40, 50};
		for (int numerro : valoress) {
			System.out.println(numerro);
		}
		
		// Streams
		int[] valorr = {10, 20, 30, 40, 50};
		Arrays.stream(valorr)
		.forEach(numeroo -> System.out.println(numeroo));
		
		// Diferencias entre arreglos y ArrayList en Java
		// En Java existen dos formas muy comunes de almacenar multiples datos: Areglos(arrays), ArrayLISt,
		// Ambos sirven para guardar varios elementos, pero funcionan diferente.
		
		// Tamano fijo vs tamano dinamico.
		// Arreglos: su tamano es fijo, se debe definir al momento de crearlo.
		// ArrayList: su tamano es dinamico, puede crecer o reducirse automaticamente.
		
		// Tipos Primitivos vs Clases Envolventes:
		//Arreglos: Pueden almacenar tipos primitivos directamente.
		// ArrayList No admite tipos primitivos directamente, se deben usar clases envolventes (Wrapper Classes)
		
		// Metodos Disponibles:
		//Arreglos: No tienen muchos metodos propios, se apoyan en la clase Arraays para operaciones como: sort(), equals, etc.
		// ArrayList: Posee muchos metodos integrados que facilitan su uso.
		
		// Rendimiento:
		// Arreglos: Son mas rapidos, consumen menos memoria, son mas eficientes cuando el tamano es fijo.
		// ArrayList: ligeramente mas lento, consume mas memoria.
		
		// Cuando usar cada uno?
		// Usar arreglos cuando: El tamano es conocido y no cambiara, se requiere mayor rendimiento.
		// Usar arrayList cuando: No se conoce la cantidad exacta de elementos, se requiere mayor flexibilidad y facilidad de uso.
		
		
		
		
		
		
		

		
		
	
		

		

	}
	
	

}
