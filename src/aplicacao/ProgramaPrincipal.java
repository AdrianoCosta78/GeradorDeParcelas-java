
package aplicacao;

import entidades.Contrato;
import entidades.Parcelas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import static java.util.Locale.setDefault;
import java.util.Scanner;
import servicos.ServicoContrato;
import servicos.ServicoPagamentoOnline;
import servicos.ServicoPayPal;
/**
 * @author Adriano
 */
public class ProgramaPrincipal {
    
    public static void main (String[] arg) throws ParseException{
       
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Entre com os dados do Contrato");
        System.out.println("   ");
        System.out.print("Informe o numero do contrato: ");
        Integer numero = sc.nextInt();
        System.out.print("Data (dd/mm/aaaa): ");
        Date data = sdf.parse(sc.next());
        System.out.print("Valor do Contrato: ");
        Double valorTotal = sc.nextDouble();
        
        Contrato contrato = new Contrato(numero, data, valorTotal);
        
        System.out.print("Informe o numero de Parcela(s): ");
        int N = sc.nextInt();
        
        ServicoContrato cs = new ServicoContrato(new ServicoPayPal());
       
        cs.processoContrato(contrato, N);
        
        System.out.println("PARCELAS: ");
        
        for (Parcelas pa : contrato.getParcelas()){
            System.out.println(pa);
        }
                  
        
       sc.close(); 
    }
    
}
