
public class Laboratorio1 {

	public static void main(String[] args) {
		
		int numero = 3;
		int divisoes = 0;
		
		for (int i = 1; i <= numero; i++) {
			
			if (numero % i == 0) {
				divisoes++;
			}
		}
		
		if (divisoes <= 2) {
			System.out.println("Numero primo");
		} else {
			System.out.println("Numero nao-primo");
		}
	}
}
