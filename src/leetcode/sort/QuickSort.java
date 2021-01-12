package leetcode.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuickSort {
    public static  void sort(List<? extends  String> data){
        for( String t:data){
            System.out.println(t.toString());
        }

    }

    public static void main(String[] args) {
        List<String> temp=new ArrayList<>();
        temp.add("A");
        sort(temp);
        Map<Integer,Integer> t=new HashMap<>();
    }
}
