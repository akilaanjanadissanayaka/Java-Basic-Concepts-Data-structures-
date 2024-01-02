package bestOnes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Circuler_array_list {
    //    6,2
    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=1;i<=p.size();i++){
            int firstIndex=0;
            for (int j=0;j<p.size();j++){
                if(i==p.get(j)){
                    firstIndex=j+1;
                    break;
                }
            }
            int secondIndex=0;
            for (int j=0;j<p.size();j++){
                if(firstIndex==p.get(j)){
                    secondIndex=j+1;
                    break;
                }
            }
            a.add(secondIndex);
        }
        return a;
    }
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> a= new ArrayList<>();
        a.add(5);
        a.add(2);
        a.add(1);
        a.add(3);
        a.add(4);




        System.out.println(permutationEquation(a));
    }
}
