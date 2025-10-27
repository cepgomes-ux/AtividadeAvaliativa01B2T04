package exercicios;

public class Main {
	
	public static void main (String[] Args) {
		AluguelBicicleta();
		ContaBancaria();
		ContaLuz();
		EstoqueProduto();
		Filme();
		Funcionario();
		Musica();
		Pessoa();
		Retangulo();
		Temperatura();
	}

	public static void AluguelBicicleta() {
		AluguelBicicleta aluguelBicicleta  = new AluguelBicicleta (5, 10);
		
		System.out.println("Total de horas: " + aluguelBicicleta.getHoras()
		+ "\nValor da hora: " + aluguelBicicleta.getValorHora()
		+ "\nValor total: " + aluguelBicicleta.calcularvalor());
		
	}

	public static void ContaBancaria() {
		ContaBancaria conta1 = new ContaBancaria("Carlos", 100);
			
		System.out.println("Titular: " + conta1.getTitular());
		System.out.println("Saldo Inicia: R$" + conta1.getSaldo());
			
		conta1.depositar(200);
		conta1.sacar(50);
			
		System.out.println("Saldo final: " + conta1.getSaldo());

	}
	
	public static void ContaLuz() {
		ContaLuz contaLuz = new ContaLuz(200.98, 0.786);

		
	System.out.println("Consumo do Kwh: " + contaLuz.getConsumoKwh() + "\nValor do Kwh: " + contaLuz.getValorKwh()
	+ "\nValor total da fatura: " + contaLuz.calcularValorTotal());
		  
	}
	
	public static void EstoqueProduto() {
		
		EstoqueProduto produtoestocado = new EstoqueProduto ("Banana", 10);
		
		produtoestocado.adicionarEstoque(100);
		produtoestocado.removeEstoque(10);
		
		
	}
	
	public static void Filme() {
		Filme f1 = new Filme ("Velozes e furiosos", 4.8);
		Filme f2 = new Filme ("Show de Truman", 5.0);
		
		f1.exibir();
		f2.exibir();
		
	}
	
	public static void Funcionario() {
		Funcionario f = new Funcionario("Carlos", 1000);
		
		System.out.println("Antes do aumento: "); f.exibir();
		
		f.aumentarsalario(50);
		
		System.out.println("Depois do Aumento: "); f.exibir();
		
	}
	
	public static void Musica() {
		Musica musica = new Musica ("FlashBacks", 183);
		Musica musica2 = new Musica ("Delorian", 183);
		
		musica.formatarDuracao();
		musica2.formatarDuracao();
	}
	
	public static void Pessoa() {
		Pessoa pessoa = new Pessoa ("Carlos", 1.89, 91.0);
		
		pessoa.calcularIMC();
		pessoa.classificacaoIMC();

	}
	
	public static void Retangulo() {
		Retangulo r = new Retangulo (20, 6);
		
		System.out.println("Largura: " + r.getLargura()
		+ "\nAltura: " + r.getAltura()
		+ "\nTotal: " + r.calcularTotal());
	}
	
	public static void Temperatura() {
		Temperatura t = new Temperatura (-20);
		
		System.out.println("Temperatura em Celsius: " + t.getCelsius()
		+ "\nTemperatura em Fahrenheit: " + t.paraFahrenheit()
		+ "\nTemperatura em Kelvin: " + t.paraKelvin());
	}
	
		
}

