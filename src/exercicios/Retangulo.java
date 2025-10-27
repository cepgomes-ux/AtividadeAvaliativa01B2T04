package exercicios;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	public Retangulo () {}
	
	public Retangulo (double l, double a) {
		setLargura(l);
		setAltura(a);
	}
	
	public void setLargura(double l) {
		if (l > 0) {
			this.largura = l;
		}
	}

	public void setAltura(double a) {
		if (a > 0) {
			this.altura = a;
		}
	}
	
	public double getLargura () {
		return largura;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public double calcularTotal () {
		return largura * altura; 
	}


}
