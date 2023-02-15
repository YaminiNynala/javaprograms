package stringClass;

public class J1A7V6AtoJAVA
{
public static void main(String[] args) {
	String s = "J1A7V6A5";
	System.out.println("Given String : "+s);
	System.out.print("Converted String : ");
	for(int i = 0; i<=s.length()-1; i++)
	{
		if(i%2 == 0)
		{
			System.out.print(s.charAt(i));
		}
	}
}
}
