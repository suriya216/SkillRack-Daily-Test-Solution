import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int []arr=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int []num=new int[M];
		for(int i=0;i<M;i++){
		    num[i]=sc.nextInt();
		}
		for(int i=0;i<M;i++){
		    for(int j=0;j<N;j++){
		        if(arr[j]==num[i]){
		            System.out.print(arr[j]+" ");
		            arr[j]=-1;
		        }
		    }
		}
		for(int i=0;i<N;i++){
		    if(arr[i]!=-1){
		        System.out.print(arr[i]+" ");
		    }
		}
		sc.close();
	}
}
