import java.util.Scanner;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int flag=0;
        do {
            flag=0;
            for (int i = 0; i < n.length(); i++)
                if (n.charAt(i) < '0' || n.charAt(i) > '9') {
                    flag = 1;
                    break;
                }
            if (flag == 1) {
                System.out.println("Better chose a positive number. Try again?");
                n = sc.nextLine();
            }
        }
        while(flag!=0);
        long nk=Long.valueOf(n);
        if(nk>Integer.MAX_VALUE) {
            System.out.println(nk + " is beyond integer limits." +
                    " Program entered into self destruct mode.");
        }
        else {
            while (nk < 0) {
                System.out.println("Negative numbers are so not allowed. Better chose a positive number. Try again?");
                nk = sc.nextInt();
            }
            if (nk == 1)
                System.out.println(nk);
            while (nk != 1) {
                if (nk > Integer.MAX_VALUE) {
                    System.out.println(nk + " is beyond integer limits." +
                            " Program entered into self destruct mode.");
                    break;
                }
                if (nk % 2 == 0)
                    nk /= 2;
                else {
                    if (nk * 3 + 1 > Integer.MAX_VALUE) {
                        System.out.println(nk + "*3+1 is beyond integer limits." +
                                " Program entered into self destruct mode.");
                        break;
                    } else
                        nk = nk * 3 + 1;
                }
                System.out.println(nk);
            }
        }
    }
}
