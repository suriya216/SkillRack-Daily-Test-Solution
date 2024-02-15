import java.util.*;
public class Hello {
    public static List<String> check(List<String> l, int idx){
        boolean flag=true;
        for(int i=idx;i<l.size()-1;i++){
            if((l.get(i)).equals(l.get(i+1))){
                l.remove(i+1);
                l.remove(i);
                return check(l, 0);
            }
        }
        return l;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> l=new ArrayList<>();
		int N=sc.nextInt();
		String []str=new String[N];
		for(int i=0;i<N;i++){
		    str[i]=sc.next();
		    l.add(str[i]);
		}
		l=check(l, 0);
		System.out.print(l.size());
		sc.close();
	}
}
