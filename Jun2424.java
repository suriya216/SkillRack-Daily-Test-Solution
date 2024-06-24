import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int []arr=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int l=N;
		for(int i=0;i<N;i++){
		    int t=arr[i];
		    while(t-->0){
		        if(l==0){
		            System.out.println();
		            l=N;
		        }
		        System.out.print(arr[i]+" ");
		        l--;
		    }
		}
		sc.close();
	}
}
