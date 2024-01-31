import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int t=N;
		int sum=0, f=0;
		long mul=1;
		for(int i=0;i<N;i++){
		    sum=0;
		    mul=1;
		    for(int j=1;j<=t;j++){
		        if(i%2==0){
		            if(j==t){
		                System.out.print(j);
		            }else{
		                System.out.print(j+"+");
		            }
		            sum+=j;
		            f=0;
		        }
		        if(i%2==1){
		            if(j==t){
		                System.out.print(j);
		            }else{
		                System.out.print(j+"*");
		            }
		            mul*=j;
		            f=1;
		        }
		    }
		    if(f==0){
		        System.out.println("="+sum);
		    }
		    if(f==1){
		        System.out.println("="+mul);
		    }
		    t--;
		}
		sc.close();
	}
}
