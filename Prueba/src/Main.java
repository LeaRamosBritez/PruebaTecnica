import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/*
 Consigna:
-. La regla general es que las palabras se deben transformar poniendo la primera letra al final y luego un "ay".
-. Parte 1:
- Cuando se ingresa "hello", se debe traducir a "ellohay"


parte 2.
Consigna:
-. Cuando se ingresa "hello world", se debe traducir a "ellohay orldway"

Te paso la parte 3.
Consigna:

-. Cuando se ingresa "hello world", se traduce la primer letra a "Ellohay Orldway"
*/

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresar texto: ");		
		String texto=input.nextLine();

		String textoFinal = Main.modificarTexto(texto);
		
		System.out.println("Texto modificado: " + textoFinal);
	}
	
	public static String modificarTexto(String texto) {
		String palabraAgregada = "ay";
		String palabraFinal = "";
		
		if(!texto.equals("")) {
			List<String> palabras = Arrays.stream(texto.split("\\W+"))
	                .filter(palabra -> !palabra.isEmpty())
	                .map(palabra -> palabra.substring(1,2).toUpperCase() + palabra.substring(2) + palabra.toLowerCase().charAt(0) + palabraAgregada)
	                .collect(Collectors.toList());
			
			for (String palabra : palabras) {
				palabraFinal+=palabra+" "; 
			}			
			return palabraFinal;
		}else {
			return palabraAgregada;
		}
	}
}
