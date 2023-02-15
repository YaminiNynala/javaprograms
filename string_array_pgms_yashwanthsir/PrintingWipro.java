//W::i::p::r::o to Wipro
package stringClass;

public class PrintingWipro
{
	public static void main(String[] args) 
	{
		String s = "W::I::P::R::O";
		for(int i = 0; i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if(i%3 == 0)
			{
				System.out.print(ch);
			}
		}
	}
}
