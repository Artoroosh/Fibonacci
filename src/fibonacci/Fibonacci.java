/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import javax.swing.JOptionPane;
/**
 *
 * @author conas1290
 */
public class Fibonacci {

    public static void main(String[] args) {
      int fibonacciNum,inputNum,fib;
      inputNum  = Integer.parseInt(JOptionPane.showInputDialog("The first nine Fibonacci numbers are listed as follows: 1, 1, 2, 3, 5, 8, 13, 21, 34... "));
      fibonacciNum = fib(inputNum);
     System.out.println(fibonacciNum);
    } 
public static int fib(int n){
 if(n == 0){
    return 0;
  }
 if(n <= 2){
    return 1;
  } 
  else{
 return fib(n-1) + fib(n-2);   
  }
 }
}
