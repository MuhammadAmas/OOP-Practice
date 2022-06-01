class Base{}
class Q1d extends Base{
    static boolean b1 = false;
    static int i =-1;
    static double d = 10.1;

    public static void main(String[] argv) {
        System.out.println("Hello");
        Q1d m= new Q1d();
        Base b = new Base ();
        b=m ;
    }
}

