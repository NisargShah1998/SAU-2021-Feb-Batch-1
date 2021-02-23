import java.util.Scanner;
import java.util.Stack;

public class Calculator {
	
	public static int checkPrecedence(char op)
	{
		if (op == '*' || op == '/' || op=='%')
			return 3;
		else if(op == '+' || op=='-')
			return 2;
		else
			return 1;
	}
	
	public static int calculate(char op,int b,int a) {
		switch (op){
	        case '+':
	            return (a + b);
	        case '-':
	        	return (a - b);
	        case '*':
	        	return (a * b);
	        case '/':
	        	return (a / b);
	        case '%':
	        	return (a % b);
		}
		return 0;
	}
	
	public static int evaluate(String expression)
	{
	    Stack<Integer> operand = new Stack<Integer>();
	    Stack<Character> operator = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++)
        {
             
            if (expression.charAt(i) == ' ')
                continue;
            
            if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9')
            {
                StringBuffer number = new StringBuffer();
                while (i < expression.length() && expression.charAt(i) >= '0' && expression.charAt(i) <= '9')
                    number.append(expression.charAt(i++));
                operand.push(Integer.parseInt(number.toString()));
                i--;
            }
            else if (expression.charAt(i) == '(') {
            	if(expression.charAt(i+1) == '-') {
            		 i=i+2;
            		 StringBuffer number = new StringBuffer();
                     while (i < expression.length() && expression.charAt(i) >= '0' && expression.charAt(i) <= '9')
                         number.append(expression.charAt(i++));
                     operand.push(0-Integer.parseInt(number.toString()));
            	}else 
            		operator.push(expression.charAt(i));
            }
            else if (expression.charAt(i) == ')')
            {
                while (operator.peek() != '(') {
                	int b = operand.pop();
                	int a = operand.pop();
                	char op = operator.pop();
                	operand.push(calculate(op,b,a));
                }
                operator.pop();
            }
            else if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/' || expression.charAt(i) == '%')
            {
                while (!operator.empty() && checkPrecedence(expression.charAt(i))<=checkPrecedence(operator.peek())) {
                	int b = operand.pop();
                	int a = operand.pop();
                	char op = operator.pop();
                	operand.push(calculate(op,b,a));
                }
                operator.push(expression.charAt(i));
            }
        }
 
        while (!operator.empty()) {
        	int b = operand.pop();
	    	int a = operand.pop();
	    	char op = operator.pop();
	    	operand.push(calculate(op,b,a));
    	}
	    
		return operand.pop();
}
 
    // Driver method to test above methods
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Expression: ");
    	String expression1 = sc.nextLine();
    	System.out.println("Output: " + evaluate(expression1));
    	System.out.println("Enter Expression: ");
    	String expression2 = sc.nextLine();
    	System.out.println("Output: " + evaluate(expression2));
    	System.out.println("Enter Expression: ");
    	String expression3 = sc.nextLine();
    	System.out.println("Output: " + evaluate(expression3));
    	System.out.println("Enter Expression: ");
    	String expression4 = sc.nextLine();
    	System.out.println("Output: " + evaluate(expression4));
    }
}
