import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String []str=sc.nextLine().split(" ");
		int len=str.length;
		for(int i=0;i<len;i++){
		    Set<Character> s=new TreeSet<>();
		    for(int j=0;j<str[i].length();j++){
		        s.add(str[i].charAt(j));
		    }
		    List<Character> l=new ArrayList<>(s);
		    String temp="";
		    for(char ch:l){
		        temp+=ch;
		    }
		    set.add(temp);
		}
		System.out.print(set.size());
		sc.close();
	}
}
