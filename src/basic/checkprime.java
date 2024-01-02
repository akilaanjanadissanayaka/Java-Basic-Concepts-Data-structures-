package basic;
import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.in;
class Prime{
    public void checkPrime(int...numbers){
        int count = numbers.length;
        for(int i=0;i<count;i++){
            for (int j=0;j<i+1;j++) {
                if (isPrime(numbers[j])) {
                    System.out.print(numbers[j] + " ");
                }
            }
            System.out.println();
        }
    }
    private static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
public class checkprime {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
