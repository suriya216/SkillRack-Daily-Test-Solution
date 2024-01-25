import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		char [][]arr=new char[N][N];
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        arr[i][j]='*';
		        char ch=(char)(M+'0');
		        int mid=(0+N-1)/2;
		        if(M==0||M==1||M==3||M==7||M==8||M==9||M==4){
		            arr[j][N-1]=ch;
		        }
		        if(M==0||M==2||M==3||M==5||M==6||M==7||M==8||M==9){
		            arr[0][j]=ch;
		        }
		        if(M==2||M==3||M==4||M==5||M==6||M==8||M==9){
		            arr[mid][j]=ch;
		        }
		        if(M==0||M==8||M==6){
		            arr[j][0]=ch;
		        }
		        if(M==0||M==9||M==8||M==2||M==3||M==5||M==6){
		            arr[N-1][j]=ch;
		        }
		        if(M==2 && j<=mid){
		            arr[j][N-1]=ch;
		        }
		        if(M==2 && j>mid){
		            arr[j][0]=ch;
		        }
		        if(M==4 && j<=mid){
		            arr[j][0]=ch;
		        }
		        if(M==5 && j<=mid){
		            arr[j][0]=ch;
		        }
		        if(M==5 && j>mid){
		            arr[j][N-1]=ch;
		        }
		        if(M==6 && j>mid){
		            arr[j][N-1]=ch;
		        }
		        if(M==9 && j<=mid){
		            arr[j][0]=ch;
		        }
		    }
		}
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        System.out.print(arr[i][j]);
		    }
		    System.out.println();
		}
		sc.close();
	}
}
