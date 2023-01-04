package Strings;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "yamini and ramya";
		String[] words=s.split(" ");//split() method will split the words wherever the space is there
		String revStr="";
		for (String w:words)
		{
			String revWord="";
			for (int i=w.length()-1;i>=0;i--)
			{
				revWord=revWord+w.charAt(i);
			}
			revStr=revStr+revWord+" ";
		}
		System.out.println(revStr);
	}
}
