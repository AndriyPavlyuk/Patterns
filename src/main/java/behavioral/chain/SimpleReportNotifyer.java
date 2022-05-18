package behavioral.chain;

public class SimpleReportNotifyer extends Notifier {
    public SimpleReportNotifyer(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
