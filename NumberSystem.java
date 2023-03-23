import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class NumberSystem {
    
    private String numberStr;
    private int value;
    
    protected int base;
    protected Map<Character,Integer> SymbolToValue;
    protected Map<Integer,Character> ValueToSymbol;
    public NumberSystem(){}
    public NumberSystem(String num,int b,ArrayList<Character>symbols) throws CustomException
    {
        numberStr = num;
        if(b>36 || b<1)
        {
            throw new CustomException("!!! Base must be between 1-36 !!!");
        }
        symbols = new ArrayList(symbols.subList(0,b));
        base = b;
        value = 0;
        SymbolToValue = new HashMap<>();
        ValueToSymbol = new HashMap<>();
        for (int i = 0; i < symbols.size(); i++) {
            SymbolToValue.put(symbols.get(i),i);
            ValueToSymbol.put(i,symbols.get(i));
        }
        int sign = 1;
        for (int i = 0; i < numberStr.length(); i++) {
            char c = numberStr.charAt(i);
            if(c == '-')
            {
                sign = -1;
                continue;
            }
            int digit = SymbolToValue.get(c);
            value = value * base + digit;
            if(value>100000000)
            {
                throw new CustomException("!!! Value out of range !!!");
            }
        }
        value = value*sign;
    }
    public int getValue()
    {
        return value;
    }
    public NumberSystem toBase(NumberSystem n)
    {
        return toBase(n.getValue());
    }
    public NumberSystem Add(NumberSystem n)
    {
        return toBase(value+n.getValue());
    }
    public NumberSystem Sub(NumberSystem n)
    {
        return toBase(value-n.getValue());
    }
    public NumberSystem Mul(NumberSystem n)
    {
        return toBase(value*n.getValue());
    }
    public NumberSystem Pow(NumberSystem n)
    {
        return toBase(Main.BinaryExpo(value,n.getValue()));
    }
    public NumberSystem Xor(NumberSystem n)
    {
        return toBase(value^n.getValue());
    }
    public NumberSystem And(NumberSystem n)
    {
        return toBase(value&n.getValue());
    }
    public NumberSystem Or(NumberSystem n)
    {
        return toBase(value|n.getValue());
    }
    public Boolean isGreater(NumberSystem n)
    {
        return value>n.getValue();   
    }
    public Boolean Equals(NumberSystem n)
    {
        return value == n.getValue();   
    }
    
    @Override
    public String toString() {
        return numberStr + "(base-" + base + ")";
    }
    
    public abstract NumberSystem toBase(int value);
}






















































