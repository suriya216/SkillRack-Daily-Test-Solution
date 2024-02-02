import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String []str=new String[N];
		for(int i=0;i<N;i++){
		    str[i]=sc.nextLine();
		}
		String abb=sc.next();
		int l=abb.length();
		int M=str.length;
		String res="";
		for(int i=0;i<M;i++){
		    res="";
		    String temp=str[i];
		    String[] tarr=temp.split(" ");
		    int A=tarr.length;
    		for(int j=0;j<A;j++){
    		    res+=tarr[j].charAt(0);
    		}
    		if(res.equalsIgnoreCase(abb)){
    		    System.out.print(temp);
    		    break;
    		}
		}
		sc.close();
	}
}
