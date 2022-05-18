package creational.abstractfactory;

import creational.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        final Developer developer = projectTeamFactory.getDeveloper();
        final Tester tester = projectTeamFactory.getTester();
        final ProjectManager projectManager = projectTeamFactory.getProjectManager();
        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
