
public class TriangleChallenge {

	public static void main(String[] args) {
		System.out.println(checkTriangle(3,4,5));
		System.out.println(checkTriangle(3,3,5));
		System.out.println(checkTriangle(1,2,3));
		System.out.println(checkTriangle(-1,2,3));
	}
	
	public static String checkTriangle(int a, int b, int c) {
		if(a<=0 ||b<=0 || c<=0)
			return "Invalid";
		if((a+b) <= c || (b+c)<= a || (c+a)<= b)
			return "Invalid";
		if(a==b && b==c)
			return "Equilateral";
		else if(a==b || b==c || c ==a)
			return "Isosceles";
		else 
			return "Scalene";
	}
}
