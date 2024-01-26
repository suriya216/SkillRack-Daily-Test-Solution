import java.util.*;
public class Hello {
    public static int findFact(Integer n){
        int count=1;
        if(n!=1){
            count++;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List <Integer> l = new ArrayList<>(); 
		int N=sc.nextInt();
		for(int i=0;i<N;i++){
		    l.add(sc.nextInt());
		}
		Comparator<Integer> cmp=new Comparator<>(){
		    public int compare(Integer a, Integer b){
		        int aCount=findFact(a);
		        int bCount=findFact(b);
		        return bCount-aCount;
		    }
		};
		Collections.sort(l, cmp);
		for(int i:l){
		    System.out.print(i+" ");
		}
		sc.close();
	}
}
