package nganxep;

import java.util.*;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            System.out.println(solution(a));
        }
    }

    private static String solution(String a) {
        System.out.println(a);
        Stack<Character> stack = new Stack<>();
        char[] s = a.toCharArray();
        for (char s1 : s) {
            stack.push(s1);
        }
        System.out.println(stack);
        List<String> characters = new ArrayList<>();
        StringBuilder s1 = new StringBuilder();
        while (!stack.isEmpty()) {
            s1.append(stack.pop());
        }
        return s1.toString().trim();
    }

}

