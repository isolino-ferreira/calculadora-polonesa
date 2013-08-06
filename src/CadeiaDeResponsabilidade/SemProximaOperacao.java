package CadeiaDeResponsabilidade;

public class SemProximaOperacao extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SemProximaOperacao(String aviso){
		super(aviso);
	}

}
