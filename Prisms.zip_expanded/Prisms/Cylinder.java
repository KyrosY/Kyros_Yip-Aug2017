/* Write this concrete (non-abstract) class called Cylinder that extends Prism.  
 * It has a private field (radius) and inherits its height from its superclass, Prism 
 *    (because all prisms have a height).
 * Provide a constructor and the methods required by its abstract superclass.  
 */

public class Cylinder extends Prism
{
	//field
	private double radius;
	
	//constructor
	public Cylinder (double radius, double height)
	{
		super(height);
		this.radius = radius;
	}
	
	//methods
	public double calcAreaOfBase()
	{
		return 3.1415 * radius * radius;
	}
	public double calcPerimeter() 
	{
		return 2 * 3.1415 * radius;
	}
	
}