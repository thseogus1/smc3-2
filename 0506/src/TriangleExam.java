
public class TriangleExam {
	public static void main(String[] args) {
		Triangle t = new Triangle(10.2,17.3);
		
		System.out.println(t.nurb());
		
		t.bun(7.5,9.2);
		System.out.println(t.nurb());
		
	}
}
class Triangle{
	double a;
	double b;
	
	public Triangle(double a, double b){
		this.a=a;
		this.b=b;		
	}
	public double nurb(){
		return (a*b)/2;
	}
	public void bun(double a, double b){
		this.a=a;
		this.b=b;
	}
	
}