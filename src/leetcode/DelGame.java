package leetcode;

import java.util.List;

//        给定一个从1 到 n 排序的整数列表。
//        首先，从左到右，从第一个数字开始，每隔一个数字进行删除，直到列表的末尾。
//        第二步，在剩下的数字中，从右到左，从倒数第一个数字开始，每隔一个数字进行删除，直到列表开头。
//        我们不断重复这两步，从左到右和从右到左交替进行，直到只剩下一个数字。
//        返回长度为 n 的列表中，最后剩下的数字。
//
//        示例：
//
//        输入:
//        2 4 6 8
//        2 6
//        6
//        输出:
//        6
//        n = 9,
//        1 2 3 4 5 6 7 8 9
public class DelGame {
    //    public int lastRemaining(int n) {
//
//    }
//    public int lastRe(List<Integer> track,boolean flag){
//        if(track.size()==1){
//            return track.get(0);
//
//        }
//    }
    public boolean isRectangle(int[][] rectangle) {
        return false;
    }

    public boolean back(int[][] track, int[][] res, int start) {
        int[] next = res[start];
        // 只需要更新next[0][1] 到结束的节点
        for (int i = next[0]; i < next[2]; i++)
            for (int j = next[1]; j < next[3]; j++) {
                // 当前的有可能超出
                if (track[i][j] == 1) {
                    return false;
                } else
                    track[i][j] = 1;
            }
        return back(track, res, start + 1);
    }

}

//


