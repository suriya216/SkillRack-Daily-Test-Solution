import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		int num=M+N;
    	List<Integer> l=new ArrayList<>();
		while(num!=0){
		    int rem=num%2;
		    num/=2;
		    l.add(rem);
		}
		int count=0;
		boolean f=true;
		for(int i=l.size()-1;i>=0;i--){
		    if(l.get(i)==1){
		        count++;
		    }
		    if(count==2){
		        System.out.print(l.size()-i);
		        f=false;
		        break;
		    }
		}
		if(f){
		    System.out.print("0");
		}
		sc.close();
	}
}
