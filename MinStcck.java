import java.util.Stack;
public class MinStcck {
    class MinStack{
    Stack<Integer>norm=new Stack<>();
    Stack<Integer>min=new Stack<>();
    public MinStack(){}
    public void push(int x){
        norm.push(x);
        //min?
        if(min.empty()){
            min.push(x);
        }else{
            int m=min.peek();
            if(x<=m){
                min.push(x);
            }else{
                min.push(m);
            }
        }
    }
    public void pop(){
        norm.pop();
        min.pop();
    }
    public int top(){
    return norm.peek();
    }
    public int Minget(){
        return min.peek();
    }


    }
}
