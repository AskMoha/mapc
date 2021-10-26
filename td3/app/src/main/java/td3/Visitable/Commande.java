package td3.Visitable;

public class Commande {
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
}
