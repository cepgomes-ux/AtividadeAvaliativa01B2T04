package exercicios;

public class Temperatura {
	
	private double celsius;
	
	public Temperatura() {}
	
	public Temperatura(double c) {
		setCelsius(c);
	}

	public void setCelsius(double c) {
		if (c > -273.15) {
			this.celsius = c;
		}
	}
	
	public double getCelsius () {
		return celsius;
	}
	
	public double paraFahrenheit () {
		return (celsius * 9 / 5) + 32;
	}
	
	public double paraKelvin () {
		return celsius + 273.15;
	}
}
