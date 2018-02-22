public class ThreeDShape 
{
	private double volume;
	private double surfaceArea;

	public ThreeDShape()
	{
		this.volume = calcVolume();
		this.surfaceArea = calcSA();
	}

// Can you write this code for this class or does it need to be overridden by every subclass?
	public double calcVolume()
	{
		return 0;
	}

// Can you write this code for this class or does it need to be overridden by every subclass?
	public double calcSA()
	{
		return 0;
	}	
}