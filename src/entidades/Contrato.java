
package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Adriano
 */
public class Contrato {

          
        private Integer numeroContrato;
        private Date dataContrato;
        private Double valorTotal;
        
        List<Parcelas> parcelas = new ArrayList<Parcelas>();
        
        public Contrato(){
        }

    public Contrato(Integer numeroContrato, Date dataContrato, Double valorTotal) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorTotal = valorTotal;
    }

    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }

   

    

          
        
        
        }
    

