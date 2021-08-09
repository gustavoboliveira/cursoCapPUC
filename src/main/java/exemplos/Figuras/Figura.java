package exemplos.Figuras;

public abstract class Figura {

	public Figura() {
		super();
	}

	public abstract double getArea();
	
	public void valueCheck(double value) {
		if(value <= 0.0) {
			throw new IllegalArgumentException();
		}
	}

}