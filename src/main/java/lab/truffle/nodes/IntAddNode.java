package lab.truffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class IntAddNode extends MyNode {

    @Child
    private MyNode left, right;

    public IntAddNode(MyNode left, MyNode right) {
        this.left = left;
        this.right = right;
    }

    public int executeInt(VirtualFrame frame) {
        int leftResult = this.left.executeInt(frame);
        int rightResult = this.right.executeInt(frame);
        return leftResult + rightResult;
    }

    @Override
    public int executeString(VirtualFrame frame) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executeString'");
    }
}
