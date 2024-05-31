import java.util.*;
public class Hello {
    public static int sumOfDigit(int X){
        int sum=0;
        while(X!=0){
            sum+=X%10;
            X/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int sum=sumOfDigit(X);
		int res=0;
		boolean f=false;
		for(int i=X-1;i>=sum;i--){
		    if(sum<sumOfDigit(i)){
		        res=i;
		        f=true;
		        break;
		    }
		}
		if(f){
		    System.out.print(res);
		}else{
		    System.out.print(X);
		}
		sc.close();
	}
}
