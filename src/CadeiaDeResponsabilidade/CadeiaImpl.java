package CadeiaDeResponsabilidade;

public abstract class CadeiaImpl implements Cadeia {

	protected Cadeia prox_operacao;
	@Override
	public abstract int trataOperacao(String operacao, int[] operandos);
	
	public void setProx_operacao(CadeiaImpl prox_operacao) {
		this.prox_operacao = prox_operacao;
	}
	public Cadeia getProx_operacao() {
		return prox_operacao;
	}

}
