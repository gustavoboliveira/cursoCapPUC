/**
 * 
 */
package exemplos.Figuras;

/**
 * @author Gustavo
 *
 */
public class Trapezio extends Figura{
	
	/**
	 * 
	 */
	private double base1;
	
	/**
	 * 
	 */
	private double base2;
	
	/**
	 * 
	 */
	private double altura;

	/**
	 * @param base1
	 * @param base2
	 * @param altura
	 */
	public Trapezio(double base1, double base2, double altura) {
		super();
		valueCheck(base1);
		valueCheck(base2);
		valueCheck(altura);
		this.base1 = base1;
		this.base2 = base2;
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return ((base1 + base2)*altura) / 2.0;
	}
	
	

}
