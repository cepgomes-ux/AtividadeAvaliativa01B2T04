package exercicios;

public class Pessoa {
	
	private String nome;
	private double peso;
	private double altura;
	
	public Pessoa (String nome, double altura, double peso) {
		setNome(nome);
		setAltura(altura);
		setPeso(peso);
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	
	public double setPeso () {
		return peso;
	}
	
	public void setPeso (double peso) {
		if (peso > 0) {
			this.peso = peso;
		}
	}
	
	public double getAltura () {
		return altura;
	}
	
	public void setAltura (double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}
	
	public void calcularIMC () {
		double imc = peso / (altura * altura) ;
		System.out.println("O seu IMC é igual: " + imc);
	}
	
	public void classificacaoIMC () {
		double imc = peso / (altura * altura); 
		if (imc < 18.5) {
			System.out.println("Voce esta magro!");
		}
			else if (imc > 18.5 && imc < 24.9) {
				System.out.println("Voce esta normal!");
			}
				else {
					System.out.println("Voce esta obeso!");
				}
	}
	

}
