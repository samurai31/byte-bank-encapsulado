class Conta {

//especificação, não posso alterar dados originais aqui, pois isso é uma "planta".
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia,int numero) {
		total++;
		System.out.println("o total de contas é"+ total);
		
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	//public void set nome (tipo novo nome)
	
	public void setNumero(int novoNumero) {
		if(numero <=0) {
			System.out.println("não pode valor mainor igual a 0");
			return;
		}
		this.numero = novoNumero;
	}

	//public tipo get nome
	
	public int getAgencia() {
		return this.agencia;

	}

	public void setAgencia(int agencia) {
		if (agencia<=0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}


	public Cliente getTitular() {
		return titular;
		
	}

	public void setTitular(Cliente titular) {
		// TODO Auto-generated method stub
		
	}
	
	public static int getTotal(){
		return Conta.total;
	}
}
