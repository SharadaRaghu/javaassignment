package ntt;


public class area{
	 void calcarea(double radius)
	 {
		 double area = 3.14 * radius * radius;
		 System.out.println("area of the circle: " + area );
}
	 public static void main(String[] args){
		 {
			 area obj = new area();
			 obj.calcarea(12);
		 }
	 }
	}
