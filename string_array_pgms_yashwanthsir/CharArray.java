package arrayObject;

public class CharArray
{
public static void main(String[] args) {
	char[] charArray = new char[7];
	charArray[0] = 'A';
	charArray[1] = 'B';
	charArray[2] = 'C';
	charArray[3] = 'D';
	charArray[4] = 'E';
	charArray[5] = 'F';
	charArray[6] = 'G';
	for(int i = 0; i<=charArray.length-1; i++)
	{
		System.out.print(charArray[i]+" ");
	}
	System.out.println();
	System.out.println("The Length Of The given Array is : "+charArray.length);
}
}
