/**
 *  This Java source file was generated by the Gradle 'init' task.
 */
package exemplos.Figuras;

/**
 * @author Gustavo
 *
 */
public class Retangulo extends Figura{
    
	/**
	 * 
	 */
	private double base;
	/**
	 * 
	 */
	private double altura;
	
	/**
	 * @param raio
	 */
	public Retangulo(double base, double altura) {
		super();
		valueCheck(base);
		valueCheck(altura);
		this.base = base;
		this.altura = altura;
	}
		
	/**
	 * @return the area
	 */
	@Override
	public double getArea() {
		return altura * base;
	}
	
}