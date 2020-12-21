package com.company;


import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class layerForeachTree {

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            return null;
        }

        public void layerTree(List<List<Integer>> res, List<TreeNode> track) {
            if (track.size() > 0) {
                List<Integer> temp = new ArrayList<>();
                List<TreeNode> next = new ArrayList<>();
                for (TreeNode t : track) {
                    temp.add(t.val);
                    if (null != t.left)
                        next.add(t.left);
                    if (null != t.right)
                        next.add(t.right);
                }
                res.add(temp);
                layerTree(res, next);
            }

        }

    }
}
