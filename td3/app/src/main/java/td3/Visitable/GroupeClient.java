package td3.Visitable;

import td3.Visitor.PrePostVisitor;
import td3.Visitor.Visitor;

import java.util.HashMap;
import java.util.Map;

public class GroupeClient implements Visitable,PrePostVisitable {
    private String name;
    private Map<String,Client> clients;
    public GroupeClient(String name)
    {
        this.name=name;
        this.clients=new HashMap<String,Client>();
    }
    public void addClient(Client client)
    {
        this.clients.put(client.getName(),client);
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
