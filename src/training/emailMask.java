package training;
import java.io.*;
import java.util.Arrays;

public class emailMask {
	
	public String emailMask(String email) {
	
		int atPoint = email.indexOf("@");
		
		String part1 = email.substring(0, atPoint-1);
		
		String part2 = email.substring(atPoint-1, email.length());
		
		String[] emailArr = part1.split("");
		
		for(int i=1; i<emailArr.length; i++) {
			
			if(!(emailArr[i].contains("."))) {
				
				emailArr[i] = "*";
				
			}
			
			email = Arrays.toString(emailArr).replace(", ", "").substring(1, emailArr.length+1);
			
			email = email+part2;
			
		}
		
		return email;
	}
	
	public static void main(String[] args)throws Exception{
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		String email = "";
		
		int atPoint;

		System.out.println("Enter email:");
		
		email=br.readLine();
		
		atPoint = email.indexOf("@");
		
		String part1 = email.substring(0, atPoint-1);
		
		String part2 = email.substring(atPoint-1, email.length());
		
		String[] emailArr = part1.split("");
		
		for(int i=1; i<emailArr.length; i++) {

			if(!(emailArr[i].contains("."))) {
				
				emailArr[i] = "*";
			}
			
			email = Arrays.toString(emailArr).replace(", ", "").substring(1, emailArr.length+1);
			
			email = email+part2;
						
		}
				
		System.out.println("your masked email is: " + email);		
		
		br.close();    
	    r.close();
		
		
	}

}
