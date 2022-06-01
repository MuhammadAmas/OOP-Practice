public class Q1d {
    int maxElements;
    public Q1d(){
        maxElements = 100;
        System.out.println(maxElements);
    }
    public Q1d(int i ){
        maxElements = i;
        System.out.println(maxElements);
    }
    public static void main(String[] args){
        Q1d a = new Q1d();
        Q1d b = new Q1d(999);
    }

}
