import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Set<Integer> s=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
		    int M=sc.nextInt();
		    int N=sc.nextInt();
		int []A=new int[M];
		for(int i=0;i<M;i++){
		    A[i]=sc.nextInt();
		    s.add(A[i]);
		}
		int []B=new int[N];
		for(int i=0;i<N;i++){
		    B[i]=sc.nextInt();
		    s.add(B[i]);
		}
		List<Integer> l=new ArrayList<>(s);
		for(int i:l){
		    System.out.print(i+" ");
		}
		sc.close();
	}
}
