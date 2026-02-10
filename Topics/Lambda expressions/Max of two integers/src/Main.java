import java.util.function.IntBinaryOperator;

class Operator {

    public static IntBinaryOperator binaryOperator = (int a,int b)->{
        if(a>b){
            return a;
        }else {
            return b;
        }
    };
}