import java.util.*;
public class Q2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Paragraph: ");
		String para=sc.nextLine();
		System.out.println("Size of vector: ");
		int size=sc.nextInt();
		HashSet<String> v=new HashSet<String>();
		System.out.println("Enter "+size+" words:");
		for(int i=0;i<size;i++)
		{
			String s=sc.next();
			v.add(s);
		}
		sc.close();
		int n=para.length();
		int c=0;
		System.out.println("Paragraph after formatting:");
		String newp="";
		while(c<n)
		{
			String s="";
			while(c<n && para.charAt(c)!=' ')
			{
				s+=para.charAt(c);
				c++;
			}
			if(v.contains(s))
			{
				newp+=s.charAt(0);
				for(int i=1;i<s.length();i++)
				{
					newp+='*';
				}
			}
			else
			{
				newp+=s;
			}
			if(c<n && para.charAt(c)==' ')
			{
				newp+=" ";
			}
			c++;
		}
		System.out.println(newp);
	}
}
