package td3.Visitable;

import td3.Visitor.Visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
