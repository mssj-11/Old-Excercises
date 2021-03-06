import java.util.List;

public class FP_Functional_Exercises {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		//*******************************************************************
		System.out.print("1.-Numeros Impares de la Lista:\n");
		Exersise1(numbers);
		//*******************************************************************
		System.out.print("2.-La lista de cadenas:\n");
		 courses.stream().forEach(System.out::println);
		 System.out.println("");
		//*******************************************************************
		System.out.print("3.-Cursos que contienen --> Spring:\n");
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
		System.out.println("");
		//*******************************************************************
		System.out.print("4.-Cursos con mas de 4 Letras:\n");
		 courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
		 System.out.println("");
		//*******************************************************************
		System.out.print("5.-Cubo de los Impares:\n");
		Exersise5(numbers);
		//*******************************************************************
		System.out.print("6.-Numero de Caracteres por Curso:\n");
		courses.stream().map(course -> course + " --> " + course.length()).forEach(System.out::println);
		System.out.println("");
	}

	private static void Exersise1(List<Integer> numbers) {//metodo para obtener impares de la lista de numeros
		numbers.stream() //Llamando metodo Stream
				.filter(numero -> numero % 2 != 0) //Agregamos la expresion Lamdba
				.forEach(numero->System.out.println(numero));//sentencia por cada uno de los numeros
		System.out.println("");//Salto
	}

	private static void Exersise5(List<Integer> numbers) {//metodo para obtener el cubo de los N.Impares
		numbers.stream() //Llamando metodo Stream
				.filter(numero -> numero % 2 != 0) //Agregamos la expresion Lamdba
				.map (numero -> numero * numero * numero)//almacena pares para que tenemos un solo valor
				.forEach(numero->System.out.println(numero));//sentencia por cada uno de los numeros
		System.out.println("");//Salto
	}

}
