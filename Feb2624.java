import java.util.*;
public class Hello {

    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int res=0;
		boolean flag=true;
		for(int i=1;i<=N;i++){
		    if(i==1){
		        continue;
		    }
		    flag=true;
		    for(int j=2;j<=i/2;++j){
		        if(i%j==0){
		            flag=false;
		            break;
		        }
		    }
		    if(flag){
		        l.add(i);
		    }
		}
		for(int i:l){
		    String str=String.valueOf(i);
		    int len=str.length();
		    boolean add=false;
		    for(int j=0;j<len;j++){
		        if(str.charAt(j)=='7'){
		            add=true;
		        }else{
		            add=false;
		        }
		    }
		    if(add){
		        res+=i;
		    }
		}
		System.out.print(res);
		sc.close();
	}
}
