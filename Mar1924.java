import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int Q=sc.nextInt();
	    int []arr=new int[N];
	    for(int i=0;i<N;i++){
	        arr[i]=sc.nextInt();
	    }
	    while(Q-->0){
	        int S=sc.nextInt()-1;
	        int E=sc.nextInt()-1;
	        int res=arr[S];
	        for(int i=S;i<=E;i++){
	            res=Math.min(res, arr[i]);
	        }
	        System.out.println(res);
	    }
	    sc.close();
	}
}
