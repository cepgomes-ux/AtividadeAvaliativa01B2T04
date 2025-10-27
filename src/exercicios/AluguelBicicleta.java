package exercicios;

public class AluguelBicicleta {
	
	private int horas;
	private double valorhora;
	
	public AluguelBicicleta (int h, double v) {
		setHora(h);
		setValorHora(v);
	}

	public void setHora(int h) {
		if (h >= 1) {
			this.horas = h;
		}
	}
	
	private void setValorHora(double v) { 
		if (v > 0) {
			this.valorhora = v;
		}	
	}
	
	public int getHoras () {
		return horas;
	}
	
	public double getValorHora () {
		return valorhora;
	}
	public double calcularvalor () {
		return horas * valorhora;
		
	}

}
