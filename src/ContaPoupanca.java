
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class ContaPoupanca extends Contas {
    private double taxa;
    
    public void setTaxa(double taxa)
    {
        this.taxa = taxa;
    }
    
    public double getTaxa()
    {
        return this.taxa;
    }
    
    public void reajustar(double taxa)
    {
        double reajuste = this.getSaldo()*this.taxa;
        this.setSaldo(this.getSaldo() + reajuste);
        JOptionPane.showMessageDialog(null, "Reajuste Realizado com sucesso!");
    }
    public void reajustar ()
    {
        double reajuste = this.getSaldo()*0.1;
        this.setSaldo(this.getSaldo() + reajuste);
        JOptionPane.showMessageDialog(null, "Reajuste Realizado com a taxa padrão!");
    
    }
    @Override
    public String tipoconta(){
         return "conta pounpança";

    }
    
}
