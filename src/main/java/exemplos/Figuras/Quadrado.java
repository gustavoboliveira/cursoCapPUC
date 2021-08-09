/**
 *  This Java source file was generated by the Gradle 'init' task.
 */
package exemplos.Figuras;

/**
 * @author Gustavo
 *
 */
public class Quadrado extends Figura{
    
	/**
	 * 
	 */
	private double lado;
	
	/**
	 * @param raio
	 */
	public Quadrado(double lado) {
		super();
		valueCheck(lado);
		this.lado = lado;
	}
		
	/**
	 * @return the area
	 */
	@Override
	public double getArea() {
		return lado * lado;
	}
	
}