package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entidades.Calculadora;

public class CalculadoraTest {
	@Test
	public void resultadoOkQuandoDiminuirDoisNumeros() {
		Calculadora calculadora = new Calculadora();
		double n1 = 50;
		double n2 = 100;
		
		double valorEsperado = -50;
		double valorRetornado = calculadora.subtrair(n1, n2);
		Assertions.assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void resultadoOkQuandoMultiplicarDoisNumeros() {
		Calculadora calculadora = new Calculadora();
		double valor = 100.0;
		double multiplicador = 2.0;
		
		double valorEsperado = 200.0;
		double valorRetornado = calculadora.multiplicar(valor, multiplicador);
		
		Assertions.assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void resultaDeveSerDezQuandoSomarCincoComCinco() {
		// Arrange
		Calculadora calculadora = new Calculadora();

		// Act
		double resultado = calculadora.somar(5.0, 5.0);
		double valorEsperado = 10.0;

		// Assert
		Assertions.assertEquals(valorEsperado, resultado);
	}

	@Test
	public void resultadoDivisaoOkQuandoDivisorDiferenteZero() throws Exception {
		// Arrange
		Calculadora calculadora = new Calculadora();
		double divisor = 10.0;
		double dividendo = 20.0;

		// Act
		double valorEsperado = 2.0;
		double valorRetornado = calculadora.dividir(dividendo, divisor);
		// Assertions
		Assertions.assertEquals(valorEsperado, valorRetornado);
	}
	
    @Test
	public void divisaoLancaExcecaoQuandoDivisorZero() {

		// Arrange   100/0
		Calculadora calculadora = new Calculadora();
		double divisor = 0.0;
		double dividendo = 10.0;

		// Act
		Exception ex = Assertions.assertThrows(Exception.class, () -> calculadora.dividir(dividendo, divisor));
		Assertions.assertTrue(ex.getMessage().contains("N�o � possivel dividir por zero."));
	}
}
