
public class AplicacaoQueUsaCalculos {
	public static void main(String[] args) {
		// situa��o 1 - preciso chamar o metodo do objeto do jeito que ele e

		ObjetoQueCalcula o = new ObjetoQueCalcula();
		o.realizaAlgumCalculo();

		// situa��o 2 - o modulo x so consegue chamar via metodo calcularValores()
		InterfaceModuloUm i1 = o;
		i1.calcularValores();

		// situa��o 3 - o modulo y so consegue chamar via metodo efetivarContas()
		InterfaceModuloDois i2 = o;
		i2.efetivarContas();
		
		// as interfaces - defina uma interface, e posso ter varias implementa��es da mesma interface em diferentes objetos, e depois posso troca-las
		// posso ter uma interface adicionar ao carrinho de compras, totalizar pedido(soma a lista do carrinho), posso ter diferentes implementa��es
		// e depois removelas dependendo da situa��o, epoca do ano, interfaces para ecommerce promo��o, calculo
	}
}
