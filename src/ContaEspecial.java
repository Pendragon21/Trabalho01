/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */

public class ContaEspecial extends Contas {
   private int limite;
   private double multa;
    
    public void descontar(double valor) {
        this.sacar(this.multa*valor*0.01);
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    
   
    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    public int getLimite() {
        return limite;
    }


   @Override
    public String tipoconta(){
         return "conta-especial";

    }
}
