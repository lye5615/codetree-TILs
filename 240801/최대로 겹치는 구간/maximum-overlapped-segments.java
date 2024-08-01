import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x1 = new int[n+1];
        int[] x2 = new int[n+1];

        int[] line = new int[201];

        for(int i=1; i<=n; i++){
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        for(int i=1; i<=n; i++){
            x1[i] += 100;
            x2[i] += 100;
        }

        for(int i=1;i<=n;i++){
            for(int j = x1[i]; j<x2[i]; j++){
                line[j]++;
            }
        }

        int r = 0;
        for(int i=1;i<=200;i++){
            if(line[i]>=2){
                ++r;
            }
        }
        System.out.println(r-1);
    }
}