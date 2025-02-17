package Multi;

public class Conta
{
	public static double multiplica(int a, int b, int res) 
    {
        // Condição de parada
        if (b == 0) //quando o valor do Número escohlido reduzir a 1, retornará 1, e posteriormente o resultado do somatória até 1/N.
        {	
        	return res;//equivalente a retornar 1/1.
        }
        else
        {
        	res = res + a;//realiza o cálculo de 1/N atual.
        	//soma a variável resultado com a chamada da função recursiva e soma aos valores seguintes até 1/N.
        }
        return multiplica(a, b - 1, res);
    }
}