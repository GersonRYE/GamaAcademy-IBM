
// Interface � uma classe abstrata que contem unicamente exclusivos metodos abstratos(cabe�alhos de metodos)
// Interface - serve para Especificar quais funcionalidades eu preciso
// exemplo carro precisa de uma pe�a original mas pode ter pe�as alternativas semelhantes
public interface InterfaceBD {
	public void conectar();

	public void desconectar();

	public void executar(String comando);
}
