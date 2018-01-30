import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Campo fecha = new CampoFecha();
		Campo nombre = new CampoNombre();
		Campo cel = new CampoPhone();
		Campo email = new CampoEmail();
		Campo ciudad = new CampoCiudad();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Escribe una fecha (formato yyyy-mm-dd): ");
		String input = sc.nextLine();
		fecha.validar(input);
		
		System.out.println();
		
		System.out.print("Escriba un nombre valido (sin numeros): ");
		input = sc.nextLine();
		nombre.validar(input);
		
		System.out.println();
		
		System.out.print("Escriba un numero valido:");
		input = sc.nextLine();
		cel.validar(input);
		
		System.out.println();
		
		System.out.print("Escriba un email valido: ");
		input = sc.nextLine();
		email.validar(input);
		
		System.out.println();
		
		System.out.print("Escriba su ciudad: ");
		input = sc.nextLine();
		ciudad.validar(input);
	}

	
}
