package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return 20;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return 12;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
    	int colNumber = Character.toUpperCase(cellName.charAt(0))- 'A';
    	int rowNumber = Integer.parseInt(cellName.substring(1, cellName.length()-1)) - 1;
    }

}
