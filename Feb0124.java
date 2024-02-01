import java.util.*;
public class Hello {
    public static boolean subMatrix(int i, int j, int K, int[][] arr){
        int X=0, Y=0, C=0;
        int []mat=new int[K*K];
        for(X=i;X<i+K;X++){
            for(Y=j;Y<j+K;Y++){
                mat[C++]=arr[X][Y];
            }
        }
        int val=mat[0], count=0;
        for(X=0;X<mat.length;X++){
            if(val==mat[X]){
                count++;
            }
        }
        if(count==K*K){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		int [][]arr=new int[R][C];
		boolean f=false; 
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int K=sc.nextInt();
		for(int i=0;i<=R-K;i++){
		    for(int j=0;j<=C-K;j++){
		        if(subMatrix(i, j, K, arr)){
		            f=true;
		            break;
		        }
		    }
		    if(f){
		        break;
		    }
		}
		if(f)   System.out.print("yes");
		else    System.out.print("no");
		sc.close();
	}
}
