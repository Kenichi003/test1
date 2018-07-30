package training;
import training.myCalendar;
import java.io.*;

public class lesson2 {
	public static void main(String args[])throws Exception{       
	
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    
	    myCalendar cal = new myCalendar();	
		
		String year = "";
		String month = "";
		int x = 0, y = 0;
		boolean flag1 = true;
		
		while(flag1) {
			
			System.out.println("Enter year: ");    
		    year=br.readLine();
		    
		    x = Integer.valueOf(year);
		    if(!(x>9999||x<1000)) {
		    	//System.out.println("Invalid year!");
		    	flag1 = false;
		    } else {
		    	System.out.println("Invalid year!");
		    }
		    
		}
		
		flag1 = true;
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
	    
	    cal.lesson2(x, y-1);
		
		}

}
