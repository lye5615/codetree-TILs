import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        int[] line = new int[101];
    
        for(int i = 0; i<n; i++){
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            for(int j = x1[i]; j<=x2[i]; j++){
                line[j]++;
            }
        }

        int max = 0;
        for(int i =0; i<line.length; i++){
            if(line[i]>max){
                max = line[i];
            }
        }
        System.out.println(max);

    }
}