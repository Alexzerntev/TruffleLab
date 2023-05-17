package lab.truffle;

import com.oracle.truffle.api.CallTarget;

import lab.truffle.nodes.IntAddNode;
import lab.truffle.nodes.IntLiteralNode;
import lab.truffle.nodes.MyNode;
import lab.truffle.nodes.MyRootNode;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        MyNode exprNode = new IntAddNode(new IntLiteralNode(5),new IntLiteralNode(5));

        MyRootNode rootNode = new MyRootNode(exprNode);
        CallTarget callTarget = rootNode.getCallTarget();

        Object result = callTarget.call(); 

        System.out.println(result);
    }
}
