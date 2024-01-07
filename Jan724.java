import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		List <Integer> s = new ArrayList<>();
		while(N!=0){
		    if((N % 10) % 2 != 0){
		        s.add(N%10);
		    }
		    N/=10;
		}
		Collections.sort(s);
		if(s.isEmpty()){
		    System.out.print(-1);
		}else{
		    for(int i:s){
		        System.out.print(i);
		    }
		}
		sc.close();
	}
}
