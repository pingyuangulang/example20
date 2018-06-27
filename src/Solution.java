import java.util.ArrayList;

/**
 * @author JiBin
 * @date 2018/6/28 2:27
 */
public class Solution {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new Solution().findContinuousSequence(100);
        for (ArrayList list1 : list){
            for (Object i : list1){
                System.out.print(i+"    ");
            }
            System.out.println();
        }
    }
    
    /**
     *输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer> > findContinuousSequence(int sum) {
        double n = Math.sqrt((2*sum));
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i=2;i<=n;i++){
            if ((2*sum-Math.pow(i, 2)+i)%(2*i) == 0){
                int a = (int)(2*sum-Math.pow(i, 2)+i)/(2*i);
                ArrayList<Integer> list = new ArrayList<>();
                for (int j=0;j<i;j++){
                    list.add(a+j);
                }
                lists.add(list);
            }
        }
        return lists;
    }
}
