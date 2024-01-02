package bestOnes;

import java.io.IOException;

public class Prissoner_candle {
    public static void saveThePrisoner(int n, int m, int s) {
        // Write your code here
        int candyId=0;
        int start=s-1;
        for(int i=0;i<m;i++){
            candyId=start%n;
            start++;
            System.out.println(candyId+1);
        }
    }
    public static void main(String[] args) throws IOException {
        saveThePrisoner(4,6,3);
    }
}
