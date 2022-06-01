public class Q1c {
    public static void main(String[] args) {
        Q1c q = new Q1c();
        Q1c.amethod();

    }

    public static void amethod(){
        int ia[] = new int[4];
        for (int i = 0; i < ia.length; i++) {
            ia[i] = i;
            System.out.println(ia[i]);
        }

    }
    
}
