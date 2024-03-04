import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int min=10;
        for(int i=0;i<str.length();i++){
            int temp=str.charAt(i)-'0';
            if(temp<min && temp!=0){
                min=temp;
            }
        }
        String res="";
        res+=String.valueOf(min);
		List<Integer> lis=new ArrayList<>();
		boolean f=true;
		for(int i=0;i<str.length();i++){
		    int temp=str.charAt(i)-'0';
		    if(temp==min && f){
		        f=false;
		        continue;
		    }else{
		        lis.add(temp);
		    }
		}
		Collections.sort(lis);
		List<Integer> l=new ArrayList<>(lis);
		for(int i:l){
		    String s=String.valueOf(i);
		    res+=s;
		}
		System.out.print(res);
		sc.close();
	}
}
