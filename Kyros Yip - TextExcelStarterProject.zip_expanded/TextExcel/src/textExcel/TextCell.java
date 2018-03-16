package textExcel;

public class TextCell implements Cell
{
	private String text;
	public TextCell (String input)
	{
		text = input;
	}
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() 
	{
		if (text.length() > 10)
		{
			return text.substring(0, 11);
		} else if(text.length() == 10) {
			return text;
		} else {
			for (int i = text.length(); i < 10; i++)
			{
				text += " ";
			}
			return text;
		}
	}
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() 
	{
		return "\"" + text + "\"";
	}
}
