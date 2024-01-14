import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String []sArr=new String[str.length()];
		for(int i=0;i<str.length();i++){
		    sArr[i]=String.valueOf(str.charAt(i));
		}
		List <Integer> l=new ArrayList<>();
		List <String> sl=Arrays.asList(sArr);
		Collections.sort(sl);
		int count=1;
		for(int i=0;i<sl.size()-1;i++){
		    if(!sl.get(i).equals(sl.get(i+1))){
		        l.add(count);
		        count=1;
		    }else{
		        count++;
		    }
		}
		l.add(count);
		Collections.sort(l);
		Boolean f=true;
		int a=1, b=1;
		for(int i=0;i<l.size();i++){
		    if(a!=l.get(i)){
		        f=false;
		        break;
		    }
		    count=a;
		    a=b;
		    b=count+b;
		}
		System.out.print(f?"YES":"NO");
		sc.close();
	}
}
