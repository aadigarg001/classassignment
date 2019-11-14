import java.util.*;
public class sub_arrays {
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int arr[]=new int[n];
				for(int i=0;i<n;i++)
				{
					arr[i]=sc.nextInt();
				}
				int k=sc.nextInt();
				int o=(n-(k-1))*((n+1)-(k-1))/2;
				System.out.println(o);
				}
}
