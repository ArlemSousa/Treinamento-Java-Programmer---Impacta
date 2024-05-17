
public class ExemploContinue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			int nota = obterNota(i);
			
			if (nota < 6) {
				continue;
			}
			
			System.out.println("Parabens");
			System.out.println("Voce passou de ano");
			System.out.println("Voce e um bom aluno");
			
			System.exit(0);
		}
	}
	
	static int obterNota(int i) {
		return 10;
	}
}
