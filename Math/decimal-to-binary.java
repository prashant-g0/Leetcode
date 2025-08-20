// Code:
import java.util.*;
public class sum{
    public static int pow(int n, int p){
        if(p==0) return 1;
        if(p==1) return n;

        int expo=1;
        for(int i=0; i<p; i++){
            expo = expo*n;
        }
        return expo;
    }

    public static int decTObin(int decimal){
        int bin=0, pow=0;
        while(decimal > 0){
            int rem = decimal%2;
            bin = bin + (rem*pow(10,pow));
            pow++;
            decimal/=2;
        }
        return bin;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();
        int binary = decTObin(decimal);
        System.out.println("Binary equivalent of "+decimal+" is "+binary);
        sc.close();
    }
}
