package exercicios;

public class Musica {
	
	private String titulo;
	private int duracaoSegundos;
	
	public Musica (String titulo, int durcacaoSegundos) {
		setTitulo(titulo);
		setDuracaoSegundos(durcacaoSegundos);
	}
	
	public String getTitulo () {
		return titulo;
	}

	public void setTitulo (String titulo) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}
	
	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}

	public void setDuracaoSegundos(int duracaoSegundos) {
		if (duracaoSegundos > 0) {
			this.duracaoSegundos = duracaoSegundos;
		}
	}
	
	public void formatarDuracao () {
		System.out.println("O titulo da musica é: " + titulo +
				"\ne a duracação da música é: " + duracaoSegundos + 
				":" + duracaoSegundos % 60);
	}
}
