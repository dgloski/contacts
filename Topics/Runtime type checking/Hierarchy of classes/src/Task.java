// You can experiment here, it won’t be checked

public class Task {
    static class A {

    }

    static class B extends A {

    }

    public static void main(String[] args) {
        // put your code here
        var a = new B();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a.getClass() == B.class);
       // System.out.println(a.getClass() == A.class);
    }
}
