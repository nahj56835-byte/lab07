package isp;

public class MultiFunctionMachine implements Printer, Scanner, Fax {
    @Override
    public void print(String content) {
        System.out.println("Multifunction Printing: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Multifunction Scanning: " + content);
    }

    @Override
    public void fax(String content) {
        System.out.println("Multifunction Faxing: " + content);
    }
}