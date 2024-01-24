import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		char []str=sc.next().toCharArray();
		int len=str.length;
		int count=0;
		while(N-->0){
		    count=0;
		    for(int i=0;i<len;i++){
		        if(count==N && str[i]!='*'){
		            count=0;
		            str[i]='*';
		            System.out.print(str[i]);
		        }else if(str[i]!='*'){
		            count++;
		            System.out.print(str[i]);
		        }else{
		            System.out.print(str[i]);
		        }
		    }
		    System.out.println();
		}
		sc.close();
	}
}
