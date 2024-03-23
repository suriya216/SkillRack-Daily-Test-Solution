import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		int i,j;
		List<Integer> index=new ArrayList<>();
		List<String> list=new ArrayList<>();
		for(i=0;i<n;i++){
		    s[i]=sc.next();
		    if(s[i].charAt(0)==s[i].charAt(s[i].length()-1)){
		        index.add(i);
		        list.add(s[i]);
		    }
		}
		Collections.sort(list);
		j=0;
		for(i=0;i<n;i++){
		    if(j<index.size() && index.get(j)==i){
		        System.out.println(list.get(j));
		        j++;
		    }else{
		        System.out.println(s[i]);
		    }
		}
	}
}
