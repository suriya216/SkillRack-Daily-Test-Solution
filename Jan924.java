import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String N = sc.next();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int count=0;
		for(int i=0;i<N.length()-K+1;i++){
		    int num = Integer.parseInt(N.substring(i, i+K));
		    String str=String.valueOf(num);
		    if(num % X == 0 && str.length()==K){
		        count++;
		    }
		}
		System.out.print(count);
		sc.close();
	}
}
