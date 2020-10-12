package explained2;

/**
 *
 * @author bhanvidewan
 */
class Explained2 {
public static void main(String[] args){
    int i=-1;
    byte b=(byte) i;//b=-1
    char c=(char) b;//c=￶￶￶￶65535
    int n=(int) c;//n=65535
    System.out.println(n);   
}

}
/*A byte has a value between -128 to 127, so when you cast -1 to byte , the result is still -1.
A char has a value between 0 and 65535, so when you cast a negative to char, the result is the same as subtracting that number from 65536, resulting in 65535.
When we convert byte to int it converts 65535 to int which is 65535 only.*/
