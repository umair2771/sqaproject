package lab1q2;
import java.util.Scanner;


public class lab1q2 {

	public static void main(String[] args) {
		
		
	Scanner myobj = new Scanner(System.in);
		
		System.out.println("Enter String ");
        String inputstr=myobj.nextLine();
        String outputstr="";
        //char str[] = inputstr.toCharArray();
        
        int len=inputstr.length();
       
        
        for(int i=0;i<len;i++)
        {
        	int j;
        	
        	for( j=0;j<len;j++)
        	{
        		
        		if(inputstr.charAt(i) != inputstr.charAt(j) )
        		{
        			outputstr=outputstr + inputstr.charAt(i);
        			
        		}
        		
        		else
        		{
        			break;
        		}
        		
        	}
        	
        	
        	
        
      
     
        	
        	
        	
        }
        System.out.println("Final String " + outputstr);
        
        
		
		
		
		

		
   
		
		
	}

}
