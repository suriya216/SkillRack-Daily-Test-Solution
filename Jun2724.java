import java.util.*;
public class Hello {
    public static boolean isVowel(char ch){
        char t=Character.toLowerCase(ch);
        if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char []arr=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){
		    if(!Character.isAlphabetic(arr[i])){
		        System.out.print("Invalid");
		        System.exit(0);
		    }
		    if(isVowel(arr[i])){
		        arr[i]='1';
		        count++;
		    }
		}
		String res=String.copyValueOf(arr);
		System.out.print(res+" "+count);
		
		sc.close();
	}
}
