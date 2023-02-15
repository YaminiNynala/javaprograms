package stringClass;

public class LearningSplitMethodAndToCharArrayMethod {
public static void main(String[] args) {
	String s = "Java is needed to solve real world problems";
	String[] stringArray = s.split("s");
	for(String string : stringArray) {
		System.out.println(string);
	}
}
}
