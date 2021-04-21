package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
      private List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }


    @Override
    public void print() {
        System.out.println("------"+getName()+getDescription()+"---");
        for(int i=0;i<organizationComponents.size();i++){
            organizationComponents.get(i).print();
        }
    }
}
