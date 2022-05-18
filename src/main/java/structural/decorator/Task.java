package structural.decorator;

public class Task {

    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        Developer seniorJavaDeveloper = new SeniorJavaDeveloper(developer);
        Developer javaTeamLead = new JavaTeamLead(seniorJavaDeveloper);
        System.out.println("Responsibility of Java Developer:         " + developer.makeJob());
        System.out.println("Responsibility of Senior Java Developer:  " +seniorJavaDeveloper.makeJob());
        System.out.println("Responsibility of Java Team Lead:         "+javaTeamLead.makeJob());
    }
}
