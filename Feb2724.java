import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] str=sc.next().toCharArray();
		int K=sc.nextInt();
		int i=0;
		while(K!=0){
		    if(str[i]!='0'){
		        str[i]='0';
		        K--;
		    }
		    i++;
		}
		System.out.print(Integer.parseInt(new String(str)));
  }
}
