import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		Map<Integer, Integer> m=new HashMap<>();
		for(int i=0;i<N;i++){
		    int val=sc.nextInt();
		    m.put(val, m.getOrDefault(val, 0)+1);
		}
		for(Map.Entry<Integer, Integer> e:m.entrySet()){
		    if(e.getValue()==1){
		        System.out.print(e.getKey());
		    }
		}
		sc.close();
	}
}
