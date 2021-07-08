package servicos;

import entidades.Contrato;
import entidades.Parcelas;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Adriano
 */
public class ServicoContrato {
    
    private ServicoPagamentoOnline servicoPagamentoOnline;
    
    public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline){
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }
    
    public void processoContrato (Contrato contrato, int meses){
        double cotaBasica = contrato.getValorTotal()/meses;
        for (int i = 1; i<=meses; i++){
            double cotaAtualizada = cotaBasica + servicoPagamentoOnline.juros(cotaBasica, i);
            
            double cotaCheia = cotaAtualizada + servicoPagamentoOnline.taxaPagamento(cotaAtualizada);
            Date dataVencimento = adicionarMeses(contrato.getDataContrato(),i);
            contrato.getParcelas().add(new Parcelas(dataVencimento, cotaCheia));
        }
        
    }
    
    private Date adicionarMeses(Date date, int N){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, N);
        return calendar.getTime();
        
    }
}
