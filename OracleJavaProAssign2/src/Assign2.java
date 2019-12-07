class A
 {
	 int a;
	 public
	 void set_a(int a)
	 {
		 this.a=a;
	 }
	 void display_a()
	 {
		 System.out.println("a="+a);
	 } 
 }
class B extends A
 {
	 int b;
	 public
	 void set_b(int b)
	 {
		 this.b=b;
	 }
	 void display_b()
	 {
		 System.out.println("b="+b);
	 }
 }
public class Assign2 {

	public static void main(String[] args) {
		B b=new B();
		b.set_b(03);
		b.set_a(15);
		b.display_a();
		b.display_b();
	}
}
