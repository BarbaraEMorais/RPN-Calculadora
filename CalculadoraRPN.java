import java.util.Stack;

/*As funções da calculadora são:
 *  - Armazenar os inputs que são números;
 * 	- Realizar operações
 *  - Adicionar resultado da operação na pilha/ enviar para tela do usuário
 */

public class CalculadoraRPN {

	//criando pilha de numeros
    private Stack<Numeros> pilha;
    
    public CalculadoraRPN(){

        pilha = new Stack<Numeros>();
    }

    public void adicionaElemento(Numeros v){
        pilha.add(v);
    }

	//recebe um operador e realiza a operação
    public void realizaOperacao(String operador){

		Numeros num_1, num_2, resultado;
		
		//pegando os 2 ultimos elementos da pilha, caso existam
		if(pilha.size() > 1) {
			num_1 = pilha.pop();
			num_2 = pilha.pop();
		} else {	
			//retorna mensagem de erro		
			throw new ArrayIndexOutOfBoundsException("Digite mais valores para realizar a operacao");
		}
		
		//verifica operador e envia para calculo da função
		switch(operador) {
			case "+":
				resultado = num_2.soma(num_1);
				break;
			case "-":
				resultado = num_2.subtrai(num_1);
				break;
	     	case "*":
                resultado = num_2.multiplica(num_1);
				break;
			case "/":
                resultado = num_2.divide(num_1);
				break;
			default:
				return;
		}
		
		//adiciona valor na pilha
		pilha.add(resultado);
	}

	public Numeros getUltimoElemento(){

		Numeros ultimoPilha, auxiliarPilha;

		if(pilha.size() > 0) {

			ultimoPilha = pilha.pop();
			auxiliarPilha = new Numeros(ultimoPilha.getReal(), ultimoPilha.getComplexo());
			pilha.add(ultimoPilha);

			return auxiliarPilha;
			
		} else {	
			System.out.println("Não foi possível operar");
			return null;
		}
	
	}
}
