package BancoDoBem;

import java.util.List;

public abstract class Banco {
   public List<Conta> getContas() {
      return contas;
   }

   public void setContas(List<Conta> contas) {
      this.contas = contas;
   }

   private String nome;
   private List<Conta> contas;


   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public abstract void Sacar();

   public abstract void Depositar();

   public abstract void Transferir();
}
