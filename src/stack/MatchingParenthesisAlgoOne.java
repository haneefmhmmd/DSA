package stack;
import java.util.*;

public class MatchingParenthesisAlgoOne {
    public static boolean match(String parens) {
        //write your code here
        char[] parensArray = parens.toCharArray();
        int count = 0;
        for( char c : parensArray){
            if(c == '('){
                count++;
            }else if(c == ')'){
                if(count > 0){
                    count--;
                }else{
                    return false;
                }
            }
        }
        if(count == 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean multipleTypesParenthesisMatch(String parens) {
        //write your code here
        char[] parensArray = parens.toCharArray();
        int countCurvedParenthesis = 0,countCurlyParenthesis = 0;
        for( char c : parensArray){
            if(c == '(' || c == '{'){
                if(c == '('){
                    countCurvedParenthesis++;
                }else{
                    countCurlyParenthesis++;
                }
            }else if(c == ')' || c == '}'){
                if(c == ')'){
                    if(countCurvedParenthesis > 0){
                        countCurvedParenthesis--;
                    }else{
                        return false;
                    }
                }else{
                    if(countCurlyParenthesis > 0){
                        countCurlyParenthesis--;
                    }else{
                        return false;
                    }
                }

            }
        }
        if(countCurvedParenthesis == 0 && countCurlyParenthesis == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(multipleTypesParenthesisMatch(in.nextLine()));
    }
}
