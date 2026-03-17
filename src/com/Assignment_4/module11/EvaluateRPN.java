package com.Assignment_4.module11;

// 19. LeetCode 150 – Evaluate Reverse Polish Notation
import java.util.Stack;

public class EvaluateRPN {

    public static int evalRPN(String[] tokens){

        Stack<Integer> stack=new Stack<>();

        for(String t:tokens){

            if(t.equals("+"))
                stack.push(stack.pop()+stack.pop());

            else if(t.equals("*"))
                stack.push(stack.pop()*stack.pop());

            else if(t.equals("-")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a-b);
            }

            else if(t.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a/b);
            }

            else
                stack.push(Integer.parseInt(t));
        }

        return stack.pop();
    }

    public static void main(String[] args){

        String[] tokens={"2","1","+","3","*"};

        System.out.println(evalRPN(tokens));
    }
}
