import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number to pritn teh series : ");
        int a=sc.nextInt();

        int cnt=0;
        int n=1;
        while(cnt!=a)
        {
            if(n%2!=0)
            {
                System.out.print(n+" ");
                cnt++;
            }
            n++;
        }
    }
}
