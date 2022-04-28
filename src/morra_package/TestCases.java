package morra_package;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCases {

	 @Test
	    void arrayTestMethod(Double[][] value,int nMatrix) {
		 for (int i = 0; i < nMatrix; i++) {
             for (int j = 0; j < nMatrix; j++) {
            	 if (value[i][j] % 1 == 0) {
            		 assertTrue(false); 
            	 }
             }
         }        
	        assertTrue(true);
	    }
	 
	 void moreThanzero(double result) {
		 if(result>0)
	        assertTrue(true);
	    }
	 
}
