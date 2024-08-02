import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x1 = new int[3];
        int[] y1 = new int[3];
        int[] x2 = new int[3];
        int[] y2 = new int[3];
        int[][] r = new int[2001][2001];

        for(int i = 0; i<3; i++){
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            x1[i] +=1000;
            y1[i] +=1000;
            x2[i] +=1000; 
            y2[i] +=1000;
        }

        for(int i = 0; i<=2; i++){
            for(int j=x1[i]; j<x2[i]; j++){
                for(int k=y1[i]; k<y2[i]; k++){
                    r[j][k]++;
                    if(i==2){
                        r[j][k] +=2;
                    }
                }
            }
        } //a,b,n

        int count = 0;
        for(int i=0; i<=2000; i++){
            for(int j=0; j<=2000; j++){
                if(r[i][j]==1){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}