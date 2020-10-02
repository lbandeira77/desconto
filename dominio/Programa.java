package dominio;

public class Programa {
	private int codigo;
	private int quantidade;
	private float preco;
	private int pagamento;	

	public Programa(int codigo, int quantidade, float preco, int pagamento) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.preco = preco;
		this.pagamento = pagamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getPagamento() {
		return pagamento;
	}

	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}
	
}