package exercicios;

public class Filme {
	
	private String titulo;
	private double avaliacao;
	
	public Filme(String t, double a) {
		setTitulo(t);
		setAvaliacao(a);
	}
	
	public void setTitulo(String t) {
		if (t == null || t.equals("")) {
			titulo = "Sem titulo";
		}
		else {
			titulo = t;
		}
	}
	
	public void setAvaliacao (double a) {
		if (a < 0 || a > 5) {
			avaliacao = 0;
		}
		else {
			 avaliacao = a;
		}
	}
	
	public String getTitulo () {
		return titulo;
	}
	
	public double getAvaliacao () {
		return avaliacao;
	}
	
	public void exibir() {
		System.out.println("Filme: " + titulo + " | Avaliação: " + avaliacao);
	}

}
