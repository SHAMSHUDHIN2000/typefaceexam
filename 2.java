import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String str2 = sc.nextLine();
		int count2=0;
		char ch = str2.charAt(str2.length()-1);
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)==ch){
		        count2++;
		    }
		}
		System.out.println(count2);
	}
}
