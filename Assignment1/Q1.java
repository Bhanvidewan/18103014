import java.util.Scanner;
class Q1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Text: ");
		String t=sc.next();
		System.out.println("Substring: ");
		String s=sc.next();
		s=s.toLowerCase();
		t=t.toLowerCase();
		int sl=s.length();
		int tl=t.length();
		int a1[]=new int[26];
		int a2[]=new int[26];
		int a3[]=new int[sl];
		int ans=0;
		int x,y,z;
		sc.close();
		System.out.print("Answer: ");
		if(tl<sl)
		{
			System.out.print(0);
			return;
		}
		for(int i=0;i<26;i++)
		{
			a1[i]=0;
			a2[i]=0;
		}
		for(int i=0;i<tl;i++)
		{
			a1[(int)t.charAt(i)-97]++;
		}
		for(int i=0;i<sl;i++)
		{
			a3[i]=0;
			a2[(int)s.charAt(i)-97]++;
		}
		for(int i=0;i<26;i++)
		{
		    if(a2[i]!=0)
		    {
		        x=a1[i]%a2[i];
		        y=a1[i]/a2[i];
		        if(x==0){
		            for(int j=0;j<sl;j++)
		            {
		                if(s.charAt(j)==(char)(97+i))
		                {
		                    a3[j]=y;
		                  }
		              }
		          }
		    }
		}     
		z=a3[0];
		for(int i=0;i<sl;i++)
		{
		    if(a3[i]<z)
		    {
		        z=a3[i];
		      }
		} 
		System.out.print(z);            
	}
}
