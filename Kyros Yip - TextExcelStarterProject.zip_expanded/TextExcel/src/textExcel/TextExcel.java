package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{
	
	
	public static void main(String[] args)
	{
		TestsALL.Helper th = new TestsALL.Helper();
		Spreadsheet s = new Spreadsheet();
		System.out.println(th.getText());
		System.out.println(s.getGridText());
	}
		/*
		Scanner userInput = new Scanner (System.in);
		boolean go;
		System.out.println("Welcome! Enter your command.");
	    // Add your command loop here
		while(go = true) {
		//	System.out.println(processCommand(userInput.next()));
			if(userInput.next().equals("quit"))
			{
				go = false;
				//System.out.println("Thank you!");
			}
		}
		userInput.close();
	}
*/
}
