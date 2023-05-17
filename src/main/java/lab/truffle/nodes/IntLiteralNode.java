package lab.truffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class IntLiteralNode extends MyNode {

    private final int value;

    public IntLiteralNode(int value) {
        this.value = value;
    }

    public int executeInt() {
        return this.value;
    }

    @Override
    public int executeInt(VirtualFrame frame) {
        return this.value;
    }

    @Override
    public int executeString(VirtualFrame frame) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executeString'");
    }
}
