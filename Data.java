public class Data {
    private int dia;
    private int mes;
    private int ano; 
    
    public Data ( int novoDia, int  novoMes, int novoAno) {
		  this.dia = novoDia;
		  this.mes= novoMes;
		  this.ano= novoAno;
    }
		  
     public int getDia() {
			   return dia; 
		   }
		public int getmes() {
			   return mes; 
		   }
		public int getAno() {
			   return ano; 
		   }
		
		public void setDia(int novoDia) {
			this.dia= novoDia;
		}
		public void setmes (int novoMes) {
			this.mes= novoMes;
		}
		public void setano (int novoAno) {
			this.ano= novoAno;
		}
		public String imprimirInfurmcoes() {
			return "[ " + this.dia + "]/ " + "[ " + this.mes + "] / " + "[" + this.ano + "]";

		}
}
