package third;

public class ThirdPolymorphismExample {
    public static void main( String[] args ) {
        A x= new A() ;
        A y= new B() ;
        A z= new C() ;
        System.out.println(z.x);
        System.out.println(((C)z).x);
        System.out.println(y.getX());
        System.out.println(z.getX());
        ((B)y).setY(200) ;
        ((B)z).setY(300) ;
        System.out.println(y.y);
        System.out.println(((B)y).y);
        System.out.println(z.y);
        System.out.println(((C)z).y);
    }
}
class A {
    public static int x= 5 ;
    public int y= 20 ;
    public int getX ( ) {
    return x ;
    }
}
class B extends A {
    public int y= 25 ;
    public B() {
        super () ;
    }
    public int getX ( int x ) {
    return x + 50 ;
    }
    public void setY (int y) {
    this.y+= y + 1.75;
    }
}
class C extends B {
    public static int x= 10 ;
    public int getX ( ) {
        return x + ( (A) this).x ;
    }
    public void setY (int y) {
    try {
        ((A) this).y= y ;
    } finally {
        ((C) this). y= y ;
    }
    }
}
