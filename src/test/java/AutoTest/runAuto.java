package AutoTest;

public class runAuto {
    public static void main(String[] args) throws InterruptedException {
        firstAuto test = new firstAuto();
        secondAuto test1 = new secondAuto();
//        test.dianji();
        test1.start_test();
//        test1.dingwei();
        test1.end_test();
        test1.wait_test();
    }
}
