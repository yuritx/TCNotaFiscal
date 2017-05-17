package Test;

import org.junit.Test;

import Negocio.NotaFiscalFachada;

public class NotaFiscalFachadaTest {

	@Test
	public void test(){
			String cpf = "122121";
			float desconto = NotaFiscalFachada.calculaDescontoIPVA(cpf );
	}
}
