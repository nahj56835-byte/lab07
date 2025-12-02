package isp;


public class OldPrinter implements Printer {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}