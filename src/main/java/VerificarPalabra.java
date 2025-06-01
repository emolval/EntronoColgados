
public class VerificarPalabra {
	
	public static void main(String[] args) {
		
		System.out.println(verificarPalabra("colgantes"));
		
	}

	public static String verificarPalabra(String palabra) {
        String normalizada = palabra.toLowerCase();
        if (normalizada.equals("colgadas")) {
            return "Bien";
        } else if (normalizada.equals("colgantes")) {
            return "Mal";
        } else {
            return "Escriba las palabras COlgadas o coLGANTES";
        }
    }
}
