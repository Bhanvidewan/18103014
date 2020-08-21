import java.util.*;
public class Q4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("String 1:");
		String s1=sc.next();
		System.out.println("String 2:");
		String s2=sc.next();
		sc.close();
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings are not Anagram!");
			return;
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int[] a=new int[26];
		for(int i=0;i<s1.length();i++)
		{
			a[(int)s1.charAt(i)-97]++;
			a[(int)s2.charAt(i)-97]--;
		}
		for(int i=0;i<26;i++)
		{
			if(a[i]!=0)
			{
				System.out.println("Strings are not Anagram!");
				return;
			}
		}
		System.out.println("Strings are Anagram!");
	}
}
