import java.util.*;
public class Hello {

    public static ArrayList<Long> Series(int n) {
        ArrayList<Long> l=new ArrayList<>();
        long mul=1, add=1;
		while(n-->0){
		    mul*=add;
		    add++;
		    mul*=add;
		    add++;
		    mul*=add;
		    add++;
		    l.add(mul);
		    mul=1;
		}
		return l;
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    ArrayList<Long> l=Series(N);
	    for(long i:l){
	        System.out.print(i+" ");
	    }
	    sc.close();
	}
}
