import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] N=sc.next().split("");
		int p=N.length;
		double sum=0;
		for(int i=0;i<p;i++){
		    double temp=Double.parseDouble(N[i]);
		    sum+=Math.pow(temp, p);
		}
		System.out.print((int)sum);
		sc.close();
	}
}
