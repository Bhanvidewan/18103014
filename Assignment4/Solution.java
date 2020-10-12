package solution;

/**
 *
 * @author bhanvidewan
 */
import java.util.Arrays;
import java.util.Scanner;
class Solution {
public static void main(String[] args)
{
int n, m;
Scanner in = new Scanner(System.in);
n = in.nextInt();
m = in.nextInt();
in.nextLine();
String[] crops = new String[n];
for (int i=0;i<n;i++){
crops[i]=in.nextLine().trim();
}

System.out.println(replant(crops,n,m));
}
public static int replant(String[] orig,int n,int m){
// Write your code here
// Return the number of replanted crops
String[] crops=new String[n];
if(n>=0){
    System.arraycopy(orig,0,crops,0,n);
}
int c=0;
int c1=0;
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if (needchange(crops,i,j,n,m)){
            crops[i]=crops[i].substring(0,j)+getnewcrop(crops,i,j,n,m)+crops[i].substring(j+1);
            c++;
        }
    }
}
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(needchange(orig,i,j,n,m)||triangle(orig,i,j,n,m)){
            orig[i]=orig[i].substring(0,j)+getnewcrop(orig,i,j,n,m)+orig[i].substring(j+1);
            c1++;
        }
    }
}
System.out.println(Arrays.toString(crops));
return (Math.min(c,c1));
}
private static boolean triangle(String[] crops,int i,int j,int n,int m) {
            char a=crops[i].charAt(j);
            char r;
            r = (j+1<m)?crops[i].charAt(j+1):'.';
            char d;
            d=(i+1<n)?crops[i+1].charAt(j):'.';
            return(a==d && a==r);
}
private static char getnewcrop(String[] crops,int i,int j,int n,int m){
    char r;
    r = (j+1<m)?crops[i].charAt(j+1):'.';
    char d;
    d=(i+1<n)?crops[i+1].charAt(j):'.';
    char u;
    u=(i-1>=0)?crops[i-1].charAt(j):'.';
    char l;
    l=(j-1>=0)?crops[i].charAt(j-1):'.';
    for (char ch = 'a'; ch <= 'z'; ch++) {
        if(ch!=r && ch!=l && ch!=u && ch!=d)
            return ch;
    }
    return 'A';
}

private static boolean needchange(String[] crops,int i,int j,int n,int m){
    boolean result=false;
    char a=crops[i].charAt(j);
    char u;
    u=(i-1>=0)?crops[i-1].charAt(j):'.';
    char l;
    l=(j-1>=0)?crops[i].charAt(j-1):'.';
    if(a==l || a==u){
        result=true;
    }
    return result;
}
}
