package Multi;

public class Conta
{
	public static double multiplica(int a, int b, int res) 
    {
        if (b == 0)
        {	
        	return res;
        }
        else
        {
        	res = res + a;
        }
        return multiplica(a, b - 1, res);
    }
}