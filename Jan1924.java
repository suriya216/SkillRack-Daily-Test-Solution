import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int [][]Mat=new int[N][N];
	    for(int i=0;i<N;i++){
	        for(int j=0;j<N;j++){
	            Mat[i][j]=sc.nextInt();
	        }
	    }
	    int iSum=0, jSum=0;
	    int X=sc.nextInt();
	    for(int i=0;i<N;i++){
	        for(int j=0;j<N;j++){
	            if(i+1==X){
	                iSum+=Mat[i][j];
	            }
	            if(j+1==X){
	                jSum+=Mat[i][j];
	            }
	        }
	    }
	    System.out.print(iSum+" "+jSum);
	    sc.close();
	}
}
