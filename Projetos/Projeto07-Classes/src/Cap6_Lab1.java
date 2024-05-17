
public class Cap6_Lab1 {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("João");
		func.setSobrenome("das Colves");
		func.setCargo("Programador");
		func.setSalario(4200.15);
		
		System.out.println(func.getNome() + " " + func.getSobrenome() + " - " +
			func.getCargo() + " - " + func.getSalario());
	}
}
