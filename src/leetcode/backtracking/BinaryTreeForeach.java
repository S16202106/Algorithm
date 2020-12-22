package leetcode.backtracking;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeForeach {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> each(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        return res;
    }

    public static void back(List<TreeNode> next, boolean left) {
        if (next.size() < 1) {

        } else {
            List<TreeNode> track = new ArrayList<>();
            for (int i = next.size() - 1; i > -1; i--) {
                TreeNode first = next.get(i).left;
                TreeNode second = next.get(i).right;
                if (!left) {
                    track.add(next.get(i).left);
                    track.add(next.get(i).right);
                }
            }
        }
    }
}
