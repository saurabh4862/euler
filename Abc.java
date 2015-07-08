import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;

public class Abc{
	public static Integer[] readFileReturnIntegers(String[] args) {
     		Integer[] array = new Integer[1000];
     		int i = 0;
    		//connect to the file
     		File file = new File("P059_cipher.txt");
     		Scanner inputFile = null;
     		try {
        		inputFile = new Scanner(file);
     			} 
     		//If file not found-error message
        	catch (FileNotFoundException Exception) {
           		System.out.println("File not found!");
        	}
    		//if connected, read file
     		if(inputFile != null){         
        		System.out.print("number of integers in file \"" 
              		+ file + "\" = \n");
        	//loop through file for integers and store in array     
        	while (inputFile.hasNext()) {
           		array[i] = inputFile.nextInt();
           		i++;
        	}
        	inputFile.close();
     		}
     		return array;
  }
}
