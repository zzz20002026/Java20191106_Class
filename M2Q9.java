import java.util.Scanner;
public class M2Q9{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        int sum = 1;
        for(int i=1;i<=v1 && i<=v2;i++){
            if(v1%i==0 && v2%i==0){
                sum = i;
            }
        }
        System.out.println(sum);
        System.out.println(v1*v2/sum);
    }
}