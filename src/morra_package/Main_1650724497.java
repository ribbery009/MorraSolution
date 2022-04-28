package morra_package;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Main_1650724497
{   
	
    static void findSaddlePoint(Double[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) 
        {
            double rowMin = matrix[i][0];
             
            int colIndex = 0;
             
            boolean saddlePoint = true;
             
            //legkisebb elem a sorban
             
            for (int j = 1; j < matrix[i].length; j++)
            {
                if(matrix[i][j] < rowMin)
                {
                	
                	
                	 

                    rowMin = matrix[i][j];
                     
                    colIndex = j;
                }
            }
             
            //legnagyobb elem e az oszlopban
            for (int j = 0; j < matrix.length; j++)
            {
                if(matrix[j][colIndex] > rowMin)
                {
                    saddlePoint = false;
                     
                    break;
                }
            }
             
            if(saddlePoint)
            {
                System.out.println("Nyeregpont : "+rowMin);
            }
        }
    }
     
    public static void main(String[] args) throws IOException 
    {
    	Double[][] value = null;
    	File file = new File("file.txt");
    	TestCases a = new TestCases();
    	
    	
    	 try {
    		 Scanner sizeScanner = new Scanner(file);
    		    String[] temp = sizeScanner.nextLine().split(" ");
    		    sizeScanner.close();
    		    int nMatrix = temp.length;

    		    Scanner scanner = new Scanner(file);
    		    value = new Double[nMatrix][nMatrix];
    		    a.arrayTestMethod(value, nMatrix);
    	        while (scanner.hasNextLine()) {
    	            for (int i = 0; i < nMatrix; i++) {
    	                for (int j = 0; j < nMatrix; j++) {
    	                   try{//    System.out.println("number is ");
    	                    value[i][j] = scanner.nextDouble();
    	                      System.out.println("number is "+ value[i][j]);
    	                    }
    	                   catch (java.util.NoSuchElementException e) {
    	                       // e.printStackTrace();
    	                    }
    	                }
    	            }         //matrix
    	            System.out.println("A matrix : ");
    	            for (int i = 0; i < nMatrix; i++) {
    	                for (int j = 0; j < nMatrix; j++) {
    	                    System.out.println(value[i][j]);
    	                }
    	            }
    	        }
    	    } catch (Exception e) {
    	        e.printStackTrace();
    	    }
    
    	
        findSaddlePoint(value);
         
   
    }
}