import java.util.Scanner;
public class M2Q17{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long sum = 0;
        int k = 0;
        while(n>0){
            k = k+1;
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println(k);
        System.out.println(sum);
    }
}