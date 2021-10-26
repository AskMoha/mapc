package td3.Visitor;

public interface Visitor extends AbstractVisitor {
    public void visit(GroupeClient groupeClient);
    public void visit(Client client4);
    public void visit(Commande commande);
    public void visit(Ligne ligne);

}
