package com.sg.algorithms.palindrome;

 class Palindrome {
      static int reverse(int n, int temp){
          if (n==0)
              return 0;
              temp = (10*temp) + (n%10);
              return reverse(temp,n/10);
     }

     public static void main(String[] args){
          int n=121;
          int temp= reverse(n,0);
          if (n==temp){
              System.out.println("Yes");
          }
          else System.out.println("No");

     }
}
