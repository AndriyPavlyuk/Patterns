package structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendReport() {
        return "Send weekly report.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendReport();
    }
}
