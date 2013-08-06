package CadeiaDeResponsabilidade;

public class CalcCadeiaImpl implements CalcCadeia {
	private Cadeia calc;
	
	CalcCadeiaImpl(){
		Cadeia soma = new Soma();
		Cadeia subtracao = new Subtracao();
		Cadeia produto = new Produto();
		Cadeia divisao = new Divisao();
		soma.setProx_operacao(subtracao);
		subtracao.setProx_operacao(produto);
		produto.setProx_operacao(divisao);
		this.calc = soma;
	}
	
	@Override
	public int realizaOperacao(String[] operandos_operacao) {
		// TODO Auto-generated method stub
		int[] operandos = new int [2];
		operandos[0] = Integer.parseInt(operandos_operacao[0]);
		operandos[1] = Integer.parseInt(operandos_operacao[1]);
		 return calc.trataOperacao(operandos_operacao[2],operandos );
	}

}
