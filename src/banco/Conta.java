package banco;

public class Conta {

	private Integer numero;
	private Integer agencia;
	private Double saldo;
	private Cliente cliente;
	
	public void deposita(double valorDepositado) {
		if (valorDepositado <= 0) {
			System.out.println("ERRO! valor invalido");
		}else {
			saldo =+ valorDepositado;
		}
	}
	
	public void saca(double valorSacado) {
		if(valorSacado <= 0 || valorSacado > saldo) {
			System.out.println("ERRO! valor invalido");
		}else {
			saldo =- valorSacado;
		}
	}

	public Double getSaldo() {
		return saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
