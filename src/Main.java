import java.util.Deque;
import java.util.LinkedList;

public class Main {




    public static boolean isBalanced(String expression) {

        Deque<Character> stck = new LinkedList();
        boolean balanced = true;
        int index = 0;
        while (balanced && index < expression.length()) {
            char ch = expression.charAt(index);
            if (isOpen(ch)) {
                stck.push(ch);
            } else if (isClose(ch)) {
                if (stck.isEmpty()) {
                    balanced = false;
                } else {
                    char topChar = stck.pop();

                    if (!isMatching(ch,topChar)){
                        balanced = false;
                    }



                }
            }

            index++;

        }
        if (balanced && stck.isEmpty()) {
            return true;
        } else
            return false;
    }


        public static boolean isOpen(char cha){
            if(cha =='(' || cha =='{' || cha =='[')
                return true;
            else
                return false;
        }

        public static boolean isClose(char cha){
            if(cha ==')' || cha =='}' || cha ==']')
                return true;
            else
                return false;
        }

        public static boolean isMatching(char c1, char c2){

            if(c1 == '(' && c2 ==')'){
              return true;
            }
            else if(c1 =='{' && c2 =='}'){
                return true;
            }
            else if(c1 =='[' && c2 ==']'){
                return true;
            }

            return false;

        }

    }



