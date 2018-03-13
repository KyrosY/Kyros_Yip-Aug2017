package textExcel;

public class TextCell implements Cell
{
	private String uInput;
	// text for spreadsheet cell display, must be exactly length 10
	public TextCell (String cell)
	{
		uInput = cell;
	}
	public String abbreviatedCellText() 
	{
		uInput += "           ";
		return uInput.substring(0,10);
	}
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() 
	{
		return "\"" + uInput + "\"";
	}
}
