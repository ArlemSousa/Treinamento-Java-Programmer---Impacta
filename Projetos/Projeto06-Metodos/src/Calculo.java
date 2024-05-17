public class Calculo {

	public static void main(String[] args) {
		
		int result;
		
		result = soma(23, 15);
		System.out.println(result);
		
		result = soma(45, 29, 33, 19);
		System.out.println(result);
		
		result = soma(9089, 38, 10, 78, 1002, 45);
		System.out.println(result);
	}
	
	static int soma(int v1, int v2) {
		return v1 + v2;
	}

	static int soma(int v1, int v2, int v3, int v4) {
		return v1 + v2 + v3 + v4;
	}

	static int soma(int v1, int v2, int v3, int v4,
			int v5, int v6) {
		return v1 + v2 + v3 + v4 + v5 + v6;
	}
}
