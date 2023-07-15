package preTraversalOfBinaryTree;

public class test {
    public static void main(String[] args){
        treeNode nodeOne=new treeNode(1);
        treeNode nodeTwo=new treeNode(2);
        treeNode nodeThree=new treeNode(3);

        nodeTwo.left=nodeOne;
        nodeTwo.right=nodeThree;

        test t=new test();
        t.Print(nodeTwo);
    }
    public void Print(treeNode node){
        if(node==null){
            return;
        };
        System.out.print(node.val);
        Print(node.left);
        Print(node.right);
    }
}
