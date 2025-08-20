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

    public static int binTOdec(int binary){
        int dec=0, pow=0;
        while(binary > 0){
            int lastDigit = binary%10;
            dec = dec + (lastDigit*pow(2,pow));
            pow++;
            binary /= 10;
        }
        return dec;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int binary = sc.nextInt();
        int decimal = binTOdec(binary);
        System.out.println("Decimal equivalent of "+binary+" is "+decimal);
        sc.close();
    }
}
