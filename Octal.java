import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class Octal extends NumberSystem{
    public Octal(){}
    public Octal(String s)
    {
        super(s,8,new ArrayList<Character>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7')));
    }
    public Octal toBase(int num){
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
        return new Octal(ret);
    }
}












































