/**
 * 
 */
package exemplos.Figuras;

/**
 * @author Gustavo
 *
 */
public class Triangulo extends Figura {
	
	/**
	 * 
	 */
	double base;
	
	/**
	 * 
	 */
	double altura;

	/**
	 * 
	 */
	public Triangulo() {
		super();
	}

	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(double base, double altura) {
		super();
		valueCheck(base);
		valueCheck(altura);
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		return base * altura / 2;
	}

}