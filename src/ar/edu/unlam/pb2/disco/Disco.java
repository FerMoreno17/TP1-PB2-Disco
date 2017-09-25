package ar.edu.unlam.pb2.disco;

public class Disco {
	private double radioInterior;
	private double radioExterior;
	private double perimetroInterior;
	private double perimetroExterior;
	private double superficie;

	public Disco(double radioInterior, double radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}

	public double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(double radioExterior) {
		this.radioExterior = radioExterior;
	}

	public double getPerimetroInterior() {
		perimetroInterior = 2 * 3.141592 * radioInterior;
		return perimetroInterior;
	}

	public double getPerimetroExterior() {
		perimetroExterior = 2 * 3.141592 * radioExterior;
		return perimetroExterior;
	}

	public double getSuperficie() {
		Double radioTotal = radioInterior + radioExterior;
		superficie = 3.141592 * radioTotal * radioTotal;
		return superficie;
	}
}
