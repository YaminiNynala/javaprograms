package SystemClass;

public class Faculty {
	public int i=10;
	public String s = "Java";
	public static final Marker marker = new Marker();//composition
	public static final Mic mic = new Mic();
	public static void main(String [] ags)
	{
		marker.write();
		mic.purpose();
	}
}
/* Why we have to do composition / 
 * 
 * what are the benefits of composition?
 * if any one does the composition in between two classes,
 * 1) no need to import
 * 2) no need to create the object
 */