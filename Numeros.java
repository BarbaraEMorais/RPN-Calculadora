public class Numeros {
    
    protected double numeroReal;
    protected double numeroComplexo;

    public Numeros(double numeroReal, double numeroComplexo){

        this.numeroReal = numeroReal;
        this.numeroComplexo = numeroComplexo;

    }

    public double getReal(){
        return numeroReal;
    }

    public double getComplexo(){
        return numeroComplexo;
    }

    
	public Numeros soma(Numeros numero) {

		double numeroReal2 = numeroReal + numero.getReal();
        double numeroComplexo2 = numeroComplexo + numero.getComplexo();

		return new Numeros(numeroReal2, numeroComplexo2);
	}
	

	public Numeros subtrai(Numeros numero) {

		double numeroReal2 = numeroReal - numero.getReal();
        double numeroComplexo2 = numeroComplexo - numero.getComplexo();
		
		return new Numeros(numeroReal2, numeroComplexo2);
	}
	

	public Numeros multiplica(Numeros numero) {

		//se os dois forem complexos retorno null 
		if(numero.getComplexo() != 0 && this.numeroComplexo!=0){
			return null; //fazer exceção se der tempo
		}

		if(numero.getComplexo() == 0){
			double numeroReal2 = this.getReal() * numero.getReal();
			double numeroComplexo2 = this.getComplexo() * numero.getReal();

			return new Numeros(numeroReal2, numeroComplexo2);
		}
		else
		{
			double numeroReal2 = this.getReal() * numero.getReal();
			double numeroComplexo2 = this.getReal() * numero.getComplexo();

			return new Numeros(numeroReal2, numeroComplexo2);
		}

	}
	

	public Numeros divide(Numeros numero){

		
		if(numero.getComplexo() != 0 && this.numeroComplexo!=0){
			return null; //fazer exceção se der tempo
		}

		if(numero.getComplexo() == 0){

			return null;
		}
		else{
			double numeroReal2 = this.getReal() / numero.getReal();
			double numeroComplexo2 = this.getComplexo() / numero.getReal();

			return new Numeros(numeroReal2, numeroComplexo2);
		}
	}

	public String toString() {

		String valorConcat = new String();

		if(getComplexo()!=0){
			valorConcat = String.valueOf(getReal()) + " " + String.valueOf(getComplexo());
		}
		else{
			valorConcat = String.valueOf(getReal());
		}

		return valorConcat;
	}
	
}
	

