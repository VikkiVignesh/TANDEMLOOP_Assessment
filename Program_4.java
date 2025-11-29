import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Map<Integer,Integer> map=new HashMap<>();

        System.out.print("Enter the size of divisor array : ");
        int n=sc.nextInt();

        System.out.println();
        System.out.println("Enter the Divisor Elements");
        int nums[]=new int[n];

        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }


        System.out.print("Enter the size of numbers array : ");
        int len=sc.nextInt();

        System.out.println();
        System.out.println("Enter the Array Elements");
        int arr[]=new int[len];

        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            map.put(nums[i], 0);
        }

        for(int i=0;i<len;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]%nums[j]==0)
                {
                    map.put(nums[j],map.getOrDefault(nums[j], 0)+1);
                }
            }
        }

        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            System.out.print(m.getKey() +" : "+m.getValue()+" , ");
        }
        System.out.println();
        
    }
}
