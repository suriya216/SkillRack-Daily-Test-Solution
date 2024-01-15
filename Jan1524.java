import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		int [][]arr=new int[R][C];
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int X1=sc.nextInt();
		int Y1=sc.nextInt();
		int X2=sc.nextInt();
		int Y2=sc.nextInt();
		if(X1<R && Y1<C && X2<R && Y2<C){
		    int sum=0;
		    for(;X1<=X2;X1++){
		        for(int j=Y1;j<=Y2;j++){
		            System.out.print(arr[X1][j]+" ");
		            sum+=arr[X1][j];
		        }
		        System.out.println();
		    }
		    System.out.print(sum);
		}else{
		    System.out.print("-1");
		}
		sc.close();
	}
}
