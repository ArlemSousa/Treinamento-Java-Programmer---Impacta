
public class Cap6_Lab1 {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.nome = "Jo�o";
		func.sobrenome = "das Colves";
		func.cargo = "Programador";
		func.salario = 4200.15;
		
		System.out.println(
			func.nome + " " + func.sobrenome + " - " +
			func.cargo + " - " + func.salario);
	}
}
