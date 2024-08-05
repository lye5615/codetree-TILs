import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        int[][] r = new int[201][201];

        for(int i = 0; i<n; i++){
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            x1[i] +=100;
            y1[i] +=100;
            x2[i] +=100; 
            y2[i] +=100;
        }

        for(int i = 0; i<n; i++){
            for(int j=x1[i]; j<x2[i]; j++){
                for(int k=y1[i]; k<y2[i]; k++){
                    r[j][k]++;
                    if(i>0 && i%2!=0){
                        r[j][k] =11;
                    }
                }
            }
        } //a,b,n

        int count = 0;
        for(int i=0; i<=200; i++){
            for(int j=0; j<=200; j++){
                if(r[i][j]==11){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}