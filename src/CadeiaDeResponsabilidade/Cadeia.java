package CadeiaDeResponsabilidade;

public interface Cadeia {
	public int trataOperacao(String operacao,int[] operandos);
	public void setProx_operacao(Cadeia subtracao);
}
