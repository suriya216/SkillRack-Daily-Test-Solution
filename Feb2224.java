import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long res=0;
		while(N!=0){
		    if(N>=1000){
		        long c=N/1000;
		        res+=c;
		        N-=c*1000;
		    }else if(N>=500){
		        long c=N/500;
		        res+=c;
		        N-=c*500;
		    }else if(N>=100){
		        long c=N/100;
		        res+=c;
		        N-=c*100;
		    }else if(N>=50){
		        long c=N/50;
		        res+=c;
		        N-=c*50;
		    }else if(N>=20){
		        long c=N/20;
		        res+=c;
		        N-=c*20;
		    }else if(N>=10){
		        long c=N/10;
		        res+=c;
		        N-=c*10;
		    }else if(N>=5){
		        long c=N/5;
		        res+=c;
		        N-=c*5;
		    }else if(N>=1){
		        long c=N/1;
		        res+=c;
		        N-=c*1;
		    }
		}
		System.out.print(res);
		sc.close();
	}
}
