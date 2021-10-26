package td3.Visitor;

public interface PrePostVisitor extends AbstractVisitor{
    public void preVisit(GroupeClient groupeClient);
    public void preVisit(Client client);
    public void preVisit(Commande commande);
    public void preVisit(Ligne ligne);
}
