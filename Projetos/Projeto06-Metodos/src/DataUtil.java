
public class DataUtil {

	public static void main(String[] args) {
		exibeSaudacao(21);
	}
	
	static void exibeSaudacao(int hora) {
		
		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
	}
}
