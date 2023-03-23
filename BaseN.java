import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class BaseN extends NumberSystem{
    public BaseN(){}
    public BaseN(String s,int n) throws CustomException
    {
        super(s,n,new ArrayList<Character>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z')));
    }
    public BaseN toBase(int val){
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
        
        return new BaseN(ret,base);
    }
}












































