package dsa;

import java.util.HashMap;

public class Test {
    public static final HashMap<String,String> firstHashMap=new HashMap<String,String>(1000);
    public static void main(String[] args) throws InterruptedException{
        int[]a=new int[]{1,2,3,4,5};
        System.out.println(maxSubsequenceSum(a));
    }
    public static int maxSubsequenceSum(int[] a) {
        int maxSum = 0;
        for(int i=0; i<a.length; i++) {        //i为子序列的左边界
            for(int j=i; j<a.length; j++) {    //j为子序列的右边界
                int thisSum = 0;
                for(int k=0; k<=j; k++)        //迭代子序列中的每一个元素，求和
                    thisSum += a[k];
                if(thisSum > maxSum)
                    maxSum = thisSum;
            }
        }
        return maxSum;
    }
}