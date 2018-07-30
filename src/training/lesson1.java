package training;
import training.myCalendar;
import java.io.*;

public class lesson1 {
	
	public static void main(String[] args)throws Exception {
		
		myCalendar cal = new myCalendar();	
		
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    
	    String month = "";
	    int y=0;
		
		boolean flag1 = true;
		while(flag1) {
			
			System.out.println("Enter month(1-12): ");    
		    month=br.readLine();
		    
		    y = Integer.valueOf(month);
		    if(!(y>12||y<1)) {
		    	//System.out.println("Invalid month!");
		    	flag1 = false;
		    } else {
		    	System.out.println("Invalid month!");
		    }
		    
		}
		
		br.close();    
	    r.close();
	    
	    
		cal.lesson1(y-1);
		
	}
}