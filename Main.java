class Main {
    static boolean isBalanced (String s) { // exact same as before but uses LinkedList based stack and stack methods instead of array
        stack<Character> brackets = new stack();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                brackets.push(c);
            } 
            
            else if (c == ')' || c == ']' || c == '}') {
                if (brackets.isEmpty()) {
                    return false;
                }
                char top = brackets.pop();
                if (c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{') {
                    return false;
                }
            }
        }

        return brackets.isEmpty();  
    }

    public static Queue<Integer> merge(Queue<Integer> A, Queue<Integer> B) { // takes two sorted queues of type integer
        Queue<Integer> S = new Queue<>();
        while (!A.isEmpty() && !B.isEmpty()) { // while both aren't empty
            if (A.front().compareTo(B.front()) <= 0) { // if front of A is < front of B
                S.enqueue(A.dequeue()); // dequeues front of A and adds it to S
            } 
            
            else {
                S.enqueue(B.dequeue()); // dequeues front of B and adds it to S
            }
        }
        
        while (!A.isEmpty()) { // if there are any leftovers in A, they are added to S
            S.enqueue(A.dequeue()); 
        }
        while (!B.isEmpty()) { // if there are any leftovers in B, they are added to S
            S.enqueue(B.dequeue());
        }
        return S;
    }

    public static void main(String []args) {
        System.out.println(isBalanced("(9*[3*{[(3+3)/5]*7}])"));
        System.out.println(isBalanced("((3*(9-(4*(6-5))))"));
        System.out.println(isBalanced("{3*(2+[3-[4/[6/9]]]})"));
        System.out.println(isBalanced("{2-{3*{6/[[[(((9-0)))]]]}}/7}"));

        Queue s = new Queue();

        String str = "(9*[3*{[(3+3)/5]*7}])";

        for (int i = 0; i < str.length(); i++) {
                s.enqueue(str.charAt(i));
        }
        s.printQueue(s.list.head);
        
        Queue A = new Queue();
        A.enqueue(1);A.enqueue(3);A.enqueue(5);A.enqueue(7);A.enqueue(9);
        Queue B = new Queue();
        B.enqueue(2);B.enqueue(3);B.enqueue(6);B.enqueue(8);B.enqueue(10);
        Queue C = new Queue();
        C = merge(A, B);
        C.printQueue(C.list.head);

        A.enqueue(1);A.enqueue(2);A.enqueue(3);A.enqueue(4);A.enqueue(5);
        B.enqueue(6);B.enqueue(7);B.enqueue(8);B.enqueue(9);B.enqueue(10);
        C = merge(A, B);
        C.printQueue(C.list.head);

        A.enqueue(2);A.enqueue(4);A.enqueue(8);A.enqueue(16);A.enqueue(32);
        B.enqueue(1);B.enqueue(3);B.enqueue(5);B.enqueue(7);B.enqueue(9);
        C = merge(A, B);
        C.printQueue(C.list.head);

        A.enqueue(10);A.enqueue(11);A.enqueue(12);A.enqueue(13);
        B.enqueue(1);B.enqueue(2);B.enqueue(3);B.enqueue(4);
        C = merge(A, B);
        C.printQueue(C.list.head);

    }
}