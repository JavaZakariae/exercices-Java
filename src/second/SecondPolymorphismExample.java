package second;

public class SecondPolymorphismExample {
    public static void main( String[] args ) {
        A a= new C2();
        B b= new B();
        C1 c1= new C1();
        C2 c2= (C2) a;
        System.out.println(a.x); /* Q2a */
        System.out.println(c1.x); /* Q2b */
        System.out.println(a.getX()); /* Q2c */
        System.out.println(c1.getX()); /* Q2d */
        b.x+= 10;
        c1.x+= 10;
        System.out.println(b.x); /* Q2e */
        c2.plop(200);
        c1.plop(300);
        System.out.println(a.y); /* Q2f */
        System.out.println(c1.y); /* Q2g */
        System.out.println(c2.y);
    }
}


class A {
    public int x= 10, y=11;
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y= y;
    }
}
class B extends A {
    public static int x= 255;
    public void plop(int _x) {
        x= _x;
        setY(x);
    }
}

class C1 extends B {
    public void setY(int y) {
        this.y= y;
    }
}
class C2 extends B {
    public byte x= (byte) super.x;
    public int y= 20;
    public int getX() {
        return x;
    }
    public void plop(int x) {
        x= x * 2;
        super.plop(x);
    }
    public void setY(int y) {
        super.y= y;
    }
}
