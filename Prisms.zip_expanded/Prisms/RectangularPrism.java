/* Write this concrete (non-abstract) class called RectangularPrism.  
 * It has 2 private fields (length and width).
 * It inherits its height from its superclass, Prism (because all prisms have a height).
 * Provide a constructor and the methods required by its abstract superclass.  
 */

public class RectangularPrism extends Prism
{
	//fields
	private double length;
	private double width;
	
	//constructor
	public RectangularPrism (double height, double length, double width)
	{
		super(height);
		this.length = length;
		this.width = width;
	}
	
	//methods
	public double calcAreaOfBase()
	{
		return length * width;
	}
	public double calcPerimeter() 
	{
		return (2 * length) + (2 * width);
	}
}

