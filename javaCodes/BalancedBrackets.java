package javaCodes;
import java.util.*;
public class BalancedBrackets {
	public static boolean balancedParanthesis(String str) {
		Deque<Character> stack=new ArrayDeque<>();
		for(int i=0;i<str.length();i++) {
			char x=str.charAt(i);
			if(x=='(' || x=='{' || x=='[') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			char check;
			switch (x) {
			case ')':
				check=stack.pop();
				if(check=='{' || check=='[')
					return false;
				break;
			case ']':
				check=stack.pop();
				if(check=='{' || check=='(')
					return false;
				break;
			case '}':
				check=stack.pop();
				if(check=='[' || check=='(')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		boolean b=balancedParanthesis("({[{[(){}[]()[[]]]}]}){[([][][][][][][][][][]]][[[][][])]}");
		if(b) {
			System.out.println("The paranthesis are balanced");
		}else {
			System.out.println("The paranthesis are not balanced");
		}
	}

}
