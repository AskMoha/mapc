package td3.Visitable;
import td3.Visitor.*;

public class Ligne implements Visitable,PrePostVisitable {
    private String name;
    private int sum;
    public Ligne(String name,int sum)
    {
        this.name=name;
        this.sum=sum;
    }
    public Ligne(String name)
    {
        this.name=name;
        this.sum=0;
    }
    public void accept(PrePostVisitor prePostVisitor)
    {
        System.out.println(prePostVisitor.toString());
    }
    public void accept(Visitor visitor)
    {
        System.out.println(visitor.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
