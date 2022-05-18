package creational.factorymethod;

public class Program {

    public static void main(String[] args) {
        String speciality = "c";
        DeveloperFactory javaDeveloperFactory = getDeveloperBySpeciality(speciality);

        final Developer developer = javaDeveloperFactory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory getDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c")) {
            return new CDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }
}
