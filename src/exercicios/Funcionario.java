package exercicios;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario (String n, double s) {
		setNome(n);
		setSalario(s);
	}
	
	public void setNome (String n) {
		if (n == null || n.equals("")) {
			nome = "Sem nome";
		}
		else {
			nome = n;
		}
	}
	public void setSalario (double s) {
		if (s < 0) {
			salario = 0;
		}
		else {
			salario = s;		}
	}
	
	public String getNome () {
		return nome;
	}
	
	public double getSalario () {
		return salario;
	}
	
	public void aumentarsalario (double perc) {
		salario = salario + (salario * (perc / 100));
	}
	
	public void exibir () {
		System.out.println("Funcionario: " + nome + " | Salario: R$ " + salario);
	}

}
