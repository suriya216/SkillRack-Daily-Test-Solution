import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int V=N+1, T=1;
		for(int i=0;i<N+1;i++){
		    System.out.print(N);
		}
		System.out.println();
		for(int i=1;i<N+1;i++){
		    for(int j=0;j<N;j++){
		        if(j==N-1){
		            System.out.print(T++);
		        }
		        System.out.print(V);
		    }
		    V++;
		    System.out.println();
		}
		for(int i=0;i<N+1;i++){
		    System.out.print(N);
		}
		sc.close();
	}
}
