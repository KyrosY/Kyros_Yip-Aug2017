package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int cols = 12;
	private int rows = 20;
	private EmptyCell[][] cells;
	public Spreadsheet() 
	{
		cells = new EmptyCell[rows][cols];
	}
	@Override
	
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return rows;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return cols;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		String gridText = "   ";
		gridText += "|";
		for (int i = 65; i <= 76; i++) {
			gridText += (char)i + "          |";	
		}
		gridText += "\n";
		for(int i=0; i < cells.length; i++) {
			if(i <10) 
			{
				gridText += i + "  |";
			} else 
			{
				gridText += i + " |";
			}
			for(int j=0; j<cells[i].length; j++) {
				//should only display 10 characters
			gridText += cells[i][j].abbreviatedCellText() + "|";
			}
			gridText += "\n";
		}
		return gridText;
	}

}
