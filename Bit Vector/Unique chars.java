import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int checker = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';
            if((checker & (1<<val)) == 1) {
                System.out.println("NOT UNIQUE");
                break;
            }
            checker |= (1<<val);
//             System.out.println(Integer.toBinaryString(checker));
        }
        System.out.println("UNIQUE");
    }
}
