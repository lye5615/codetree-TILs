import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[][] r = new int[201][201];

        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            x[i] += 100;
            y[i] += 100;
        }

        for(int i =0; i<n; i++){
            for(int j =x[i]; j<(x[i]+8); j++){
                for(int k =y[i]; k<(y[i]+8); k++){
                    r[j][k]++;
                }
            }
        }
        int count =0;
        for(int i=0; i<=200; i++){
            for(int j=0; j<=200; j++){
                if(r[i][j]>0)
                count++;
            }
        }
        System.out.print(count);
    }
}