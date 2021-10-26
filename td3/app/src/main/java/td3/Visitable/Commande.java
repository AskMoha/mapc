package td3.Visitable;

import td3.Visitor.PrePostVisitor;
import td3.Visitor.Visitor;

public class Commande implements Visitable,PrePostVisitable{
    private String name;
    public Commande(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }

    @Override
    public void accept(Visitor visitor) {

    }
}
