package creational.abstractfactory.website;

import creational.abstractfactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Web Site PM manages website project");
    }
}
