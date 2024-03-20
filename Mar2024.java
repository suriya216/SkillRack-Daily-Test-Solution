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
		int K=sc.nextInt();
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        if(j==K-1){
		            int t=arr[i][j];
		            arr[i][j]=arr[j][i];
		            arr[j][i]=t;
		        }
		    }
		}
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		sc.close();
	}
}
