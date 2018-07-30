package training;

import java.util.Arrays;

public class reyFunc {
	
	public static void main(String[] args) {
		
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();		
		System.out.println("the missing character is: " + getMissingChar(alphabet));	
		
		String str1 = "asd";
		String str2 = "aaa";
		
		char[] asd = str1.toCharArray();
		//added a comment on reyFunc -Isaac
		
	}
	
	public static char getMissingChar(char[] ch) {		
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i = 0; i < ch.length; i++) {	
			if(ch[i] != i + 'a') {
				return alphabet[i];}	
		}		
		return 'a';				
	}
}

