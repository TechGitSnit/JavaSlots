
public class Q7 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                a[i] = i;
            }

        }
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }

}

