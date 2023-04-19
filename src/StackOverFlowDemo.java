public class StackOverFlowDemo {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackOverFlowDemo demo = new StackOverFlowDemo();
        try {
            demo.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:"+demo.stackLength);
            throw e;
        }
    }
}
