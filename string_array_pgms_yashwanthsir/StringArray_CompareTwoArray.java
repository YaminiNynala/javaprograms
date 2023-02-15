package arrayObject;

import java.util.Arrays;

public class StringArray_CompareTwoArray
{
public static void main(String[] args) {
	String[] firstStudent = {"Vijay","Banglore","Mechanical","Boy"};
	String[] secondStudent = {"AbhiShek","Telangana","Civil","Boy"};
	if(Arrays.equals(firstStudent, secondStudent))
	{
		System.out.println("The given Two Arrays are same...");
	}
	else
	{
		System.out.println("The given Two Arrays are not same");
	}
}
}