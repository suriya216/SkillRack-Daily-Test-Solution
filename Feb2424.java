import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		String K=sc.next();
		String temp1="";
		String temp2="";
		int count=0;
		while(X<=Y){
		    temp1=String.valueOf(X);
		    for(int i=0;i<=temp1.length()-K.length();i++){
		        temp2=temp1.substring(i, i+K.length());
		        if(temp2.equals(K)){
		            count++;
		            break;
		        }
		    }
		    X++;
		}
		System.out.print(count);
		sc.close();
	}
}
