package com.design.algorithm;

public class CustomStack {
     int[] data;
     int top;
     int limit;

     public CustomStack(int limit){
          this.top = -1;
          this.limit = limit;
          this.data = new int[limit];
     }

     public void push(int value) {
          if(++top < limit)
               data[top] = value;
          else
               System.out.println("stack full");
     }

     public int pop()  {
          if(--top > -1)
               return data[top];
          else
               System.out.println("stack empty");

          return 0;
     }
}



