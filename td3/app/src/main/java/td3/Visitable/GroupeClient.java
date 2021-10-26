package td3.Visitable;

import java.util.HashMap;
import java.util.Map;

public class GroupeClient {
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

}
