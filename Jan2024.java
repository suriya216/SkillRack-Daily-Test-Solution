import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int X=sc.nextInt();
	    sc.nextLine();
	    List<Integer> l1=new ArrayList<>();
	    List<Integer> l2=new ArrayList<>();
	    Set<Integer> set=new TreeSet<>();
	    while(sc.hasNext()){
	        String []s=sc.nextLine().split(" ");
	        l1.add(Integer.parseInt(s[0]));
	        l2.add(Integer.parseInt(s[1]));
	        set.add(Integer.parseInt(s[0]));
	    }
	    List<Integer> l3=new ArrayList<>(set);
	    List<Integer> l4=new ArrayList<>();
	    int sum, index=0;
	    for(int i=0;i<l3.size();i++){
	        sum=0;
	        if(l3.get(i)==X){
	            index=i;
	        }
	        for(int j=0;j<l1.size();j++){
	            if(l3.get(i)==l1.get(j)){
	                sum+=l2.get(j);
	            }
	        }
	        l4.add(sum);
	    }
	    int max=0, maxIndex=0;
	    for(int i=0;i<l4.size();i++){
	        if(l4.get(i)>max){
	            max=l4.get(i);
	            maxIndex=l3.get(i);
	        }
	    }
	    int val=l4.get(index);
	    int num=(max-val)+1;
	    if(X==maxIndex){
	        int c=0;
	        for(int i=0;i<l4.size();i++){
	            if(max==l4.get(i)){
	                c++;
	            }
	        }
	        if(c==1){
	            System.out.print(0);
	        }else{
	            System.out.print(1);
	        }
	    }else{
	        System.out.print(num);
	    }
	    sc.close();
	}
}
