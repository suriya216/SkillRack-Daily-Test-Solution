import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String res="-1";
		boolean f=false;
		int l=0, r=str.length()-1;
		while(l<=r){
		    char temp1=str.charAt(l);
		    char temp2=str.charAt(r);
		    if(temp1==temp2){
		        l++;
		        r--;
		    }else{
		        f=true;
		        System.out.println(str.substring(l, r+1));
		        l++;
		        r--;
		        break;
		    }
		}
		if(!f){
		    System.out.print(res);
		}
		sc.close();
	}
}
