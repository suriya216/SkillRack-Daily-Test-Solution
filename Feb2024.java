import java.util.*;
public class Hello {
    public static boolean isPrime(int a){
        boolean f=false;
        for(int i=2;i<a;i++){
            if(a%i!=0){
                f=true;
            }else{
                f=false;
                break;
            }
        }
        return f;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=N;i++){
		    if(N%i==0){
		        if(i==2){
		            System.out.print(i+" ");
		        }
		        else if(isPrime(i)){
		            System.out.print(i+" ");
		        }
		    }
		}
		sc.close();
	}
}
