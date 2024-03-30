import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Map<Character, Integer> m=new TreeMap<>();
		for(int i=0;i<str.length();i++){
		    m.put(str.charAt(i), m.getOrDefault(str.charAt(i), 0)+1);
		}
		List<Map.Entry<Character, Integer>> l=new LinkedList<>(m.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<Character, Integer>>(){
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b){
                return (b.getValue()).compareTo(a.getValue());
            }
        });
        for(Map.Entry<Character, Integer> e:l){
            Character k=e.getKey();
            Integer v=e.getValue();
            char c=k.charValue();
            int i=v.intValue();
            while(i-->0){
                System.out.print(c);
            }
        }
		sc.close();
	}
}
