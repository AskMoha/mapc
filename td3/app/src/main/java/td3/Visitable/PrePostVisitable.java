package td3.Visitable;

import td3.Visitor.PrePostVisitor;

public interface PrePostVisitable {
    void accept(PrePostVisitor prePostVisitor);
}
