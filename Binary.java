import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class Binary extends NumberSystem{
    public Binary(){}
    public Binary(String s)
    {
        super(s,2,new ArrayList<Character>(Arrays.asList('0', '1')));
    }
    public Binary toBase(int num){
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
        return new Binary(ret);
    }
}












































