
public class Calculo2 {

	public static void main(String[] args) {
		
		System.out.println(Integer.toBinaryString(-1));
		
		int result;
		
		result = soma(23, 15);
		System.out.println(result);
		
		result = soma(45, 29, 33, 19);
		System.out.println(result);
		
		result = soma(9089, 38, 10, 78, 1002, 45);
		System.out.println(result);
	}

	static int soma(int... valor) {
		
		int total = 0;
		
		for (int v : valor) {
			total += v;
		}
		
		return total;
	}
}
