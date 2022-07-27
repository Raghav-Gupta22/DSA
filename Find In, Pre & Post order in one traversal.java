import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left=null;
    TreeNode right=null;
    TreeNode(){}
    TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }
}
class item{
    TreeNode Node;
    int number;
    item(TreeNode Node, int number){
        this.Node=Node;
        this.number=number;
    }
}

public class Traversals {
    static void print(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();
        Stack<item> stack = new Stack<>();
        if(root==null)
            System.out.println("EMPTY");
        else{
            stack.push(new item(root, 1));
            while(!stack.empty()){
                item temp= stack.pop();
                TreeNode node=temp.Node;
                int number =temp.number;
                if(number==1) {
                    preOrder.add(node.val);
                    stack.push(new item(node, ++number));
                    if(node.left!=null)
                        stack.push(new item(node.left, 1));
                }
                else if(number==2) {
                    inOrder.add(node.val);
                    stack.push(new item(node, ++number));
                    if(node.right!=null)
                        stack.push(new item(node.right, 1));
                }
                else if(number==3) {
                    postOrder.add(node.val);
                }
            }
        }
        System.out.println(preOrder);
        System.out.println(inOrder);
        System.out.println(postOrder);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        print(root);
    }
}
