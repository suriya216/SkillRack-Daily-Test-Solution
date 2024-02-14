import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    long N=sc.nextLong();
	    String d=String.valueOf(N);
	    int l=d.length();
	    long res=0;
	    while(N!=0){
	        long t=N%10;
	        res+=Math.pow(t,l);
	        N/=10;
	    }
	    System.out.print(res);
	    sc.close();
	}
}
