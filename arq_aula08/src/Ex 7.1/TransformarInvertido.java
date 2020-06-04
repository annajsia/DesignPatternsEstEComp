package ex 7.1;

public class TransformarInvertido extends TransformaStringTemplate {
	
	@Override
	public void alterarString(String s) {
		
		s = new StringBuilder(s).reverse().toString();
		
		
		
		System.out.println("Convertido: " + s);
	
	}

}
