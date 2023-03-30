import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
	                .map(palabra -> palabra.substring(1) + palabra.charAt(0) + palabraAgregada)
	                .collect(Collectors.toList());
			
			for (String palabra : palabras) {
				palabraFinal+=palabra+" "; 
			}
		}else {
			return palabraAgregada;
		}

		
		return palabraFinal;
	}
}
