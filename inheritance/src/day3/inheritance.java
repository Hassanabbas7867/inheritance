package day3;

public class inheritance {
	
	int a=2;
	int b=3;
	int c;
	
	void sum() {
		c=a+b;
		System.out.println("result: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      inheritance i=new inheritance();
      i.sum();
      A a=new A();
      a.multiplication(3,2.5);
	}

}
class A{
	void multiplication(int a,double b) {
		System.out.println("parent result of multiplication: "+(a*b));
	}
}
	
