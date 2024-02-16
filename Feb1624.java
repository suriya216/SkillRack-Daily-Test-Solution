import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] str=sc.next().toCharArray();
		int n=str.length;
		int[] arr=new int[126];
		for(int i=0;i<n;i++){
		    char c=str[i];
		    arr[c]++;
		}
		for(int i=0;i<n;i++){
		    char c=str[i];
		    if(arr[c]==1){
		        System.out.print(str[i]);
		    }
		}
		sc.close();
	}
}
