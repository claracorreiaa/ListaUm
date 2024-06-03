public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo (double novaBase, double novaAltura) {
		  this.base = novaAltura;
		  this.altura= novaAltura;
		}
	
	public double area(double baseB, double alturaB) {
		this.base = baseB;
		this.altura = alturaB;
		return (baseB * alturaB);

	}
	
	public double perimetro(double baseB, double alturaB) {
		this.base = baseB;
    	this.altura = alturaB;
    	return ((baseB * 2 ) +( alturaB * 2));
	}
	
	
	public Retangulo (int novaBase, double novaAltura) {
		  this.base = novaBase;
		  this.altura= novaAltura;
		}
	
	public double getBase() {
		   return base; 
	   }
	public double getAltura() {
		   return altura; 
	   }
	
	public void setBase (double novaBase) {
		this.base= novaBase;
	}
	public void setAltura (double novaAltura) {
		this.altura= novaAltura;
	}
}
