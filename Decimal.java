import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class Decimal extends NumberSystem{
    public Decimal(){}
    public Decimal(String s)
    {
        super(s,10,new ArrayList<Character>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7','8','9')));
    }
    public Decimal toBase(int val){
        String ret = "";
        String sign = "";
        int val = Math.abs(num);
        if(val!=num)
        {
            sign = "-";
        }
        while (val > 0) {
            int rem = val % base;
            ret = ValueToSymbol.get(rem) + ret;
            val = val / base;
        }
        ret = sign+ret;
        return new Decimal(ret);
    }
}












































