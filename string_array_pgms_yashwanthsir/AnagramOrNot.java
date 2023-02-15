package stringClass;

import java.util.Scanner;

public class AnagramOrNot {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter first string :");
	String s1=scan.next();
	System.out.println("enter second string :");
	String s2=scan.next();
	boolean venky=true;
	if(s1.length()==s2.length())
	{
		for(int madhu=0;madhu<s1.length();madhu++)
		{
			if(s1.indexOf(s2.charAt(madhu))!=-1)
			{
				venky=true;
			}
			else {
				venky=false;
				break;
			}
		}
		if(venky)
		{
			System.out.println(s1+" & "+s2+" are anagrams");
		}
		else {
			System.out.println(s1+" & "+s2+" are not anagrams");
		}
	}
	else {
		System.out.println("not Anagram");
	}
}
}
