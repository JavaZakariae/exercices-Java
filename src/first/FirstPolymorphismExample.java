package first;

/**
 * first exercise about inheritance, polymorphism
 */
public class FirstPolymorphismExample {

    public static void main( String[] args ) {
        A b = new B();
        C c = new C();
        b.work();
        System.out.println(b.x); /* ( Q2a) */
        System.out.println(b.y); /* ( Q2c) */
        System.out.println();
        System.out.println(c.x); /* ( Q2b) */
        System.out.println(c.y); /* ( Q2d) */
        c.work();
        System.out.println(b.x); /* ( Q2e) */
        System.out.println(c.x); /* ( Q2f) */
        System.out.println(b.y); /* ( Q2g) */
        System.out.println(c.y);
    }
}


interface I {
    int compute(int x);
}
abstract class A implements I {
    public int x = 2;
    public static int y = 10;
    public void setX(int value) {
        this.x = value;
    }
    public int getX() {
        return x;
    }
    public void work() {
        setX(compute(getX()));
        y = compute(y);
    }
}

class B extends A {
    public static int y = 20;
    public int compute(int x) {
        return 2 * x;
    }
}

/* C class */
class C extends B {
    int x = 5;
    public void setX(int x) {
        this.x = x;
        y = x;
    }
    public int compute(int x) {
        try {
            return x * x;
        } finally {
            return x / 2;
        }
    }
}

