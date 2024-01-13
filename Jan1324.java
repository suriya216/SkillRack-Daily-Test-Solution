import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		String [][]arr=new String[R][C];
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        arr[i][j]=sc.next();
		    }
		}
		int dir=0;
		for(int i=0;i<R;i++){
		    if(dir==0){
		        for(int j=0;j<C;j++){
		            System.out.print(arr[i][j]);
		        }
		        dir=1;
		    }else if(dir==1){
		        for(int j=C-1;j>=0;j--){
		            System.out.print(arr[i][j]);
		        }
		        dir=0;
		    }
		}
		sc.close();
	}
}
