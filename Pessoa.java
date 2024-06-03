public class Pessoa {
   private String nome;
   private double idade;
   private double altura;
   
   public Pessoa (String novoNome, double novaIdade, double novaAltura) {
		  this.nome = novoNome;
		  this.idade= novaIdade;
		  this.altura= novaAltura;
		}
	
 
   public String getNome() {
		return nome;
	}
	public double getIdade() {
		return idade;
   }
   public double getAltura() {
	   return altura; 
   }
   public void setNome (String novoNome) {
		this.nome= novoNome;
	}
   public void setIdade (double novaIdade) {
		this.idade= novaIdade;
	}
   public void setAltura (double novaAltura) {
		this.altura= novaAltura;
	}
   public String imprimirInformcoes() {
		return "Nome:" + this.nome + "\nIdade: " + this.idade + " \nAltura:" + this.altura + ".";

	}
}
