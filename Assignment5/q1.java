/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author bhanvidewan
 */
public class Solution{
public static void main(String... args) {
        Thread thread = new Thread() {
            public void run() {
                int x = 0;
                int y,z;
                while (x<101) {
                    x = x + 1;
                    System.out.print(x + " ");
                    if (x % 10 == 0)
                    {   System.out.println();
                        System.out.println("10 second message");
                        
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }}
