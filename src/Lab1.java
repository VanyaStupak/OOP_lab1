public class Lab1 {
    public static void main(String[] args) {
        /* С2 = 0
           С3 = 0
           С5 = 4
           С7 = 5 */

        int a = 1;
        int b = 1;
        int n = 2;
        int m = 3;
        final int C = 0;
        double S = 0;

        if (a > n || b > m){
            System.out.println("Error: no such range exists");
            return;
        }

        if ((a <= 0) && (0 <= n)){
            System.out.println("Error: division by zero");
            return;
        }

        for (float i = (float)a; i <= n; i++) {
            for (float j = (float)b; j <= m; j++) {
                    S += ((double) (i - j) / (i + C));
            }
        }
        System.out.println(S);
    }

}

