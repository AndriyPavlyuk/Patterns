package creational.factorymethod;

public class CDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CDeveloper();
    }
}
