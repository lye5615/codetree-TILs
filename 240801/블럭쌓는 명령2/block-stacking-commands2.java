import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] block = new int[n+1];
        int[] ka = new int [k+1];
        int[] kb = new int [k+1];
        for(int i=1; i<=k; i++){
            ka[i] = sc.nextInt();
            kb[i] = sc.nextInt();
        }
        
        for(int i=1; i<k+1; i++){
            for(int j=ka[i]; j<=kb[i]; j++){
                block[i]++;
            }
        }
        int max = 0;
        for(int i = 1; i<=n; i++){
            if(block[i]>max){
                max=block[i];
            }
        }
        System.out.println(max);
    }
}