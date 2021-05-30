public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        System.out.println("Stack empty? " + stack.isEmpty());
        System.out.println("Stack pop");
        stack.pop();
        stack.push(1);
        System.out.println("Stack contains 1? " + stack.contains(1));
        stack.pop();
        stack.push(2);
        stack.push(3);

        System.out.println("Stack = " + stack.getStack());
        System.out.println("Stack pop");
        stack.pop();
        System.out.println("Stack = " + stack.getStack());
        System.out.println("Stack pop");
        stack.pop();
        System.out.println("Stack = " + stack.getStack());
        System.out.println("Stack pop");
        stack.pop();
        System.out.println("Stack = " + stack.getStack());
        System.out.println("Stack contains 1? " + stack.contains(1));
        System.out.println("Stack empty? " + stack.isEmpty());

    }
}
