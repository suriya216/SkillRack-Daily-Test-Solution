import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    String []str=sc.nextLine().toLowerCase().split(" ");
    boolean f=true;
    for(int i=0;i<str.length-1;i++){
      if(str[i].charAt(0)!=str[i+1].charAt(str[i].length()-1)){
        f=false;
      }
    }
    if(f){
      System.out.print("yes");
    }else{
      System.out.print("no");
    }
    sc.close();
    }
}
	
