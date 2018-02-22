
public class Sphere extends ThreeDShape
{
	private double radius;
	
	public Sphere (double radius) {
		this.radius = radius;
	}
	public double calcVolume()
	{
		return ((4 * Math.PI * radius * radius * radius) / 3);
	}

	public double calcSA()
	{
		return 4 * Math.PI *radius * radius;
	}	
}
