package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int colNumber;
	private int rowNumber;
    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return rowNumber;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return colNumber;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
    	colNumber = Character.toUpperCase(cellName.charAt(0))- 'A';
    	rowNumber = Integer.parseInt(cellName.substring(1, cellName.length())) - 1;
    }

}
