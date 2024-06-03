public class ContaCorrente {
	private int numeroConta;
	private double saldo;
	public double depositar(double saldoUm, double saldoDois) {
		this.saldo = saldoUm;
		this.saldo = saldoDois;
		return (saldoUm + saldoDois);
	}
	public double sacar (double saldoUm, double saldoDois) {
		this.saldo = saldoUm;
		this.saldo = saldoDois;
		return (saldoUm - saldoDois);
	}
	
	public ContaCorrente (int novoNumeroConta, double novoSaldo) {
		  this.numeroConta = novoNumeroConta;
		  this.saldo= novoSaldo;
		}
	
	public int getNumeroConta() {
		   return numeroConta; 
	   }
	   public double getSaldo() {
		   return saldo; 
	   }
	  
	   public void setNumeroConta (int novoNumeroConta) {
			this.numeroConta= novoNumeroConta;
		}
	   public void setSaldo (double novoSaldo) {
			this.saldo= novoSaldo;
		}
	    
	   
	
	   public String imprimirInformcoes() {
			return "Conta:" + this.numeroConta + "\nSaldo: R$ " + this.saldo;
		}
}
