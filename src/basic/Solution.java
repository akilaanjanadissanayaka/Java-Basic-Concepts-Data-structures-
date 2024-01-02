package basic;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static java.lang.Math.min;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;


public class Solution {
    public static int beautifulTriplets(int d, List<Integer> arr) {


        int count=0;

        for(int i=0;i<arr.size()-2;i++){
            for(int j=i+1;j<arr.size()-1;j++){
                if(arr.get(j)-arr.get(i)==d){
                    for (int z=j+1;z<arr.size();z++){
                        if(arr.get(z)-arr.get(j)==d){
                            System.out.println(arr.get(i)+" "+arr.get(j)+" "+arr.get(z));
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
        // Write your code here
        return 0;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> numbers = List.of(8,8,14,10,3,5,14,12);
        List<Integer> rank = new ArrayList<>();

        rank.add(1);
        rank.add(2);
        rank.add(4);
        rank.add(5);
        rank.add(7);
        rank.add(8);
        rank.add(10);

        beautifulTriplets(3,rank);
    }

}
