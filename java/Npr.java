import java.util.*;
public class Practice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int r = in.nextInt();
        int nFact = fact(n);
        int rFact = fact(n-r);

        /*for(int i=1; i<=n; i++){
            nFact *= i;
        }

        for(int j=1; j<=n-r; j++){
            rFact *= j;
        }*/

        int nPr = nFact / rFact;

        System.out.println(nPr);



    } public static int fact(int n){
        int re = 1;

        for(int i=1; i<=n; i++){

            re *= i;

        }

        return re;


    }

}