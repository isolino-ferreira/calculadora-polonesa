package CadeiaDeResponsabilidade;

public class Soma extends CadeiaImpl {
	

	@Override
	public int trataOperacao(String operacao, int[] operandos) {
		// TODO Auto-generated method stub
		int result;
		if(operacao.equals("+")){
			result = operandos[0] + operandos[1];
		}else{
			if(prox_operacao!=null)
				result = prox_operacao.trataOperacao(operacao, operandos);
			else
				throw new SemProximaOperacao("Sem mais operacoes");
		}
		
		return result;

	}

	@Override
	public void setProx_operacao(Cadeia subtracao) {
		// TODO Auto-generated method stub
		
	}

}
