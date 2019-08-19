import java.util.ArrayList;
import java.util.List;

public class solution {
    public List<List<Integer>>generate(int numRows){
        List<List<Integer>>list=new ArrayList<>(numRows);
                //list是一种引用，List类型的接口引用（Java语法）
        //list逻辑上是一种线性表
            //线性表的元素类型是 List<Integer>
            //(java 语法)List类型的接口引用
            //元素类型是Integer类类型的引用
            //Integer是元素类型的包装类
        for(int i=0;i<numRows;i++){
            list.add(new ArrayList<>(i+1));

        }
           list.get(0).add(1);
           list.get(1).add(1);
           list.get(1).add(1);
           for(int i=2;i<numRows;i++){
            List<Integer>nums=list.get(i);
            nums.add(1);
            for(int j=1;j<i;j++){
                int num=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                nums.add(num);
            }
            nums.add(1);
        }
        return list;
    }

    private static void printPascalsTriangle(solution s,int n){
        System.out.println(s.generate(n));
    }

    public static void main(String[] args) {
solution so=new solution();
printPascalsTriangle(so,10);
    }
}
