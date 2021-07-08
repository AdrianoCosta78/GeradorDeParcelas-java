
package servicos;

/**
 * @author Adriano
 */
public class ServicoPayPal implements ServicoPagamentoOnline{
    
    private static final double Taxa_Pagamento = 0.02;
    private static final double Meses_Juros = 0.01;

    @Override
    public double taxaPagamento(double valor) {
        
        return valor * Taxa_Pagamento;
    }

    @Override
    public double juros(double valor, int meses) {
         
        return valor * meses * Meses_Juros ;
    }
    
    
}
