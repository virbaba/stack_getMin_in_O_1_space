import java.util.*;
public class Solution {
    static class SpecialStack {
        int min = Integer.MAX_VALUE;
        Stack<Integer> st = new Stack<>();
        void push(int data) {
            if(st.isEmpty()){
                st.push(data);
                min = data;
            }
            // Implement the push() function.
            else if(min > data){
                int val = 2 * data - min;
                st.push(val);
                min = data;
            }
            else
                st.push(data);

        }

        void pop() {
            // Implement the pop() function.
            if(st.isEmpty())
                return;
            
            if(st.peek() > min){
                st.pop();
            }
            else{
                int data = st.peek();
                min = 2 * min - data;
                st.pop();
            }
        }

        int top() {
            // Implement the top() function.
            if(st.isEmpty())
                return -1;
            
            if(st.peek() > min)
                return st.peek();

            return min;

        }

        int getMin() {
            // Implement the getMin() function.
            if(st.isEmpty())
                return -1;
            return min;
        }
    };
}
