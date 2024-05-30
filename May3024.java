import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int Z=sc.nextInt();
		int chpage=Y*Z;
		int pages=X/chpage;
		int rem=X%chpage;
		if(rem>0){
		    pages++;
		}
		int lines=(X/Z)+(rem%Z==0?0:1);
		System.out.println(pages);
		System.out.println(lines);
		sc.close();
	}
}
