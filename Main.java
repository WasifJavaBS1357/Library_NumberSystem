public class Main {
    public static int BinaryExpo(int x,int n)
    {
        int result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = result * x;
            }
            x = x * x;
            n = n >> 1;
        }
        return result;
    }
    public static void main(String args[]) {
        BaseN o1 = new BaseN();
        
        o1 = new BaseN("ADG",34);    
        try{
            o1 = new BaseN("-ADG",34);    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(o1.Add(new BaseN("-1",2)));
    }
}