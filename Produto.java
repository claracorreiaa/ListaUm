public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String novoNome, double novoPreco, int novaQuantidade) {
		this.nome = novoNome;
		this.preco = novoPreco;
		this.quantidade = novaQuantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
	}
	public void setQuantidade(int novaQuantidade) {
		this.quantidade = novaQuantidade;
	}
	
	public double calcularTotal() {
		return preco * quantidade;
	}
}
