public class Test {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        Structure<Integer> qu = new Queue<Integer>();

        for(int i = 0; i < 10; i++) {
            qu.push(i);
        }
        for(int i = 9; i >= 0; i--) {
            System.out.println(qu.pop());
        }
    }   
}
