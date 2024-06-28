import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		int [][]arr=new int[M][N];
		for(int i=0;i<M;i++){
		    for(int j=0;j<N;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int top=0, bottom=M-1, left=0, right=N-1;
		int dir=0;
		while(top<=bottom && left<=right){
		    if(dir==0){
		        for(int i=left;i<=right;i++){
		            if(i==right){
		                System.out.println(arr[top][i]);
		            }else{
		                System.out.print(arr[top][i]+" ");
		            }
		        }
		        top++;
		        dir=1;
		    }
		    if(dir==1){
		        for(int i=top;i<=bottom;i++){
		            if(i==bottom){
		                System.out.println(arr[i][left]);
		            }else{
		                System.out.print(arr[i][left]+" ");
		            }
		        }
		        left++;
		        dir=0;
		    }
		}
		sc.close();
	}
}
