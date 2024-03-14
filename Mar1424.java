import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		String pattern="";
		pattern+="+";
		String res="";
		res+="|";
		for(int i=0;i<str.length;i++){
		    for(int j=0;j<str[i].length();j++){
		        pattern+="-";
		    }
		    pattern+='+';
		    res+=str[i];
		    res+="|";
		}
		System.out.println(pattern);
		System.out.println(res);
		System.out.print(pattern);
		sc.close();
	}
}
