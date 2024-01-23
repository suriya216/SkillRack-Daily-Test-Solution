import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int N=sc.nextInt();
		int len=str.length();
		sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++){
		    String []query=sc.nextLine().split(" ");
		    String dir=query[0];
		    int pos=Integer.parseInt(query[1]);
		    pos%=len;
		    if(query[0].equals("L")){
		        str=str.substring(pos,str.length())+str.substring(0,pos);
		    }else{
		        str=str.substring(str.length()-pos,str.length())+str.substring(0,str.length()-pos);
		    }
		    sb.append(str.charAt(0));
		}
		System.out.print(sb);
		sc.close();
	}
}
