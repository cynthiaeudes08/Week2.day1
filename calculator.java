package Assingment3;

public class calculator {
	public int add2No (int a,int b) {
		int total=a+b;
		return total;
	}
	public void Sub2No(int total,int f) {
		int d = total-f;
		System.out.println("Subtraction of two numbers:  "+d);
	}
	public double mul2No(double i,double j) {
		double c = i*j;
		return c;
	}
	public void div2No(double c,float y) {
		double x= y/c;
		System.out.println("Division of two numbers:  "+x);
	}
	public static void main(String[] args) {
		calculator calci= new calculator();
		int total= calci.add2No(30,50);
		System.out.println("Addition of two numbers:  "+total);
		calci.Sub2No(total, 40);
		double c= calci.mul2No(20, 80);
		System.out.println("Multiplication of two numbers:  "+c);
		calci.div2No(c, 8F);
		
		
		
		
		
		
		
	}
	
	

}
