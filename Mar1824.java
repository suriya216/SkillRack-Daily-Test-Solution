import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		List<String> l=new ArrayList<>();
		int temp=N;
		String []str=new String[N];
		int k=0;
		while(temp-->0){
		    String t=sc.next();
		    str[k]=t;
		    k++;
		    if(!l.contains(t)){
		        l.add(t);
		    }
		}
		Collections.sort(l);
		System.out.println(l.size());
		for(int i=0;i<l.size();i++){
		    System.out.print(l.get(i)+" ");
		    for(int j=0;j<N;j++){
		        if(l.get(i).equals(str[j])){
		            System.out.print(j+1+" ");
		        }
		    }
		    System.out.println();
		}
	    sc.close();
	}
}
