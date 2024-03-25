import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		int []A=new int[M];
		int []B=new int[N];
		List<Integer> l=new ArrayList<>();
		Map<Integer, Integer> m=new HashMap<>();
		for(int i=0;i<M;i++){
		    A[i]=sc.nextInt();
		    m.put(A[i], m.getOrDefault(A[i], 0)+1);
		}
		for(int i=0;i<N;i++){
		    B[i]=sc.nextInt();
		    int freq=m.containsKey(B[i])?m.get(B[i]):0;
		    for(int j=0;j<freq;j++){
		        System.out.print(B[i]+" ");
		    }
		    if(m.containsKey(B[i])){
		        m.remove(B[i]);
		    }
		}
		for(Map.Entry<Integer,Integer> e:m.entrySet()){
		    int v=e.getKey();
		    int freq=e.getValue();
		    for(int i=0;i<freq;i++){
		        l.add(v);
		    }
		}
		Collections.sort(l, (a,b)->b-a);
		for(int i:l){
		    System.out.print(i+" ");
		}
		sc.close();
	}
}
