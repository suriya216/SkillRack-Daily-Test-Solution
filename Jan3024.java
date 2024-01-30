import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int [][]arr=new int[N][N];
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		       arr[i][j]=sc.nextInt();
		    }
		}
		int sum=0, max=Integer.MIN_VALUE;
		int l=0, r=N-1;
		while(l<=r){
		    sum=0;
    		for(int i=l;i<=r;i++){
    		    sum+=arr[l][i];
    		}
    		for(int i=l+1;i<=r;i++){
    		    sum+=arr[i][r];
    		}
    		for(int i=r-1;i>=l;i--){
    		    sum+=arr[r][i];
    		}
    		for(int i=r-1;i>l;i--){
    		    sum+=arr[i][l];
    		}
    		l++;
    		r--;
    		max=Math.max(max, sum);
		}
		System.out.print(max);
		sc.close();
	}
}
