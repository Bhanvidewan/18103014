import java.util.Scanner;
class Q21{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String1: ");
        String s1=sc.next();
        System.out.println("String2: ");
        String s2=sc.next();
        s2=s2.toLowerCase();
        s1=s1.toLowerCase();
        int l1=s1.length();
        int l2=s2.length();
        if(l1>=l2){
            int i;
            for( i=0;i<l2;i++){
                if((int)s1.charAt(i)>(int)s2.charAt(i)){
                    System.out.println(s1+ " is lexicographically greater than "+ s2+".");
                    break;
                  }
                else if((int)s1.charAt(i)<(int)s2.charAt(i)){
                    System.out.println(s2+ " is lexicographically greater than "+ s1+".");
                    break;
                  }
                  else if((int)s1.charAt(i)==(int)s2.charAt(i)){
                    continue;
                }
              }
            if(i==l2 && l1>l2){
                System.out.println(s1+ " is lexicographically greater than "+ s2+".");
            }
            else if(i==l2 && l1==l2){
                System.out.println(s1+ " is lexicographically equal to "+ s2+".");
            }    
        }
        else if(l1<l2){
            int i;
            for(i=0;i<l1;i++){
		 if((int)s1.charAt(i)>(int)s2.charAt(i)){
		            System.out.println(s1+ " is lexicographically greater than "+ s2);
		            break;
		          }
		        else if((int)s1.charAt(i)<(int)s2.charAt(i)){
		            System.out.println(s2+ " is lexicographically greater than "+ s1);
		            break;
		          }
		        else if((int)s1.charAt(i)==(int)s2.charAt(i)){
		            continue;
		          }
		      }
            if(i==l1 && l1<l2){
                System.out.println(s2+ " is lexicographically greater than "+ s1+".");
            }
            else if(i==l1 && l1==l2){
                System.out.println(s1+ " is lexicographically equal to "+ s2+".");
            }
	}
    }
}
		  
