package lab.truffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public abstract class MyNode extends Node {
    public abstract int executeInt(VirtualFrame frame);

    public abstract int executeString(VirtualFrame frame);
}
