import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		String [][]arr=new String[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.next();
		    }
		}
		int top=0, bottom=r-1, left=0, right=c-1;
		int dir=0;
		while(top<=bottom && left<=right){
		    if(dir==0){
		        for(int i=bottom;i>=top;i--){
		            System.out.print(arr[i][top]+" ");
		        }
		        dir=1;
		        left++;
		    }
		    if(dir==1){
		        for(int i=left;i<=right;i++){
		            System.out.print(arr[top][i]+" ");
		        }
		        dir=2;
		        top++;
		    }
		    if(dir==2){
		        for(int i=top;i<=bottom;i++){
		            System.out.print(arr[i][right]+" ");
		        }
		        dir=0;
		        right--;
		    }
		    System.out.println();
		}
		sc.close();
	}
}
