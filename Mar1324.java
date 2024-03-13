import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []str=sc.next().split("");
		int t=Integer.parseInt(str[0]);
		String res="";
		for(int i=0;i<str.length;i++){
		    for(int j=0;j<t;j++){
		        res+=str[i];
		    }
		}
		for(int i=0;i<t;i++){
		    System.out.println(res);
		}
		sc.close();
	}
}
