import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class PairWithGivenSumInBST {
    private static void inOrderTraversal(TreeNode root, List<Integer> sortedList) {
        if (root == null)
            return;
        
        inOrderTraversal(root.left, sortedList);
        sortedList.add(root.val);
        inOrderTraversal(root.right, sortedList);
    }

    private static void findPairWithSum(TreeNode root, int sum) {
        List<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(root, sortedList);
        int left = 0;
        int right = sortedList.size() - 1;

        while (left < right) {
            int currentSum = sortedList.get(left) + sortedList.get(right);
            if (currentSum == sum) {
                System.out.println("Pair is (" + sortedList.get(left) + ", " + sortedList.get(right) + ")");
                return;
            } else if (currentSum < sum) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Nodes are not found.");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(40);
        root.left = new TreeNode(20);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(30);
        root.right.left = new TreeNode(50);
        root.right.right = new TreeNode(70);

        int sum = 130;
        findPairWithSum(root, sum);
    }
}
