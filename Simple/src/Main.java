import top100.IsSymmetric;
import top100.TreeNode;

public class Main {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(2);

        IsSymmetric isSymmetric = new IsSymmetric();
        System.out.println(isSymmetric.isSymmetric(treeNode));
    }

}
