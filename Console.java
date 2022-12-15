import java.util.Scanner;
/* As funções do console são:
 *  - Captar inputs do teclado via terminal
 *  - Validar inputs (vou pular essa etapa)
 *  - Converter inputs para real ou complexo
 *  - Imprime outputs/resultados
 */
public class Console{
    
    //Usado para captar inputs
    private Scanner teclado;
    //Usado para realizar as operações
    private CalculadoraRPN calculadora;
    
    public Console(){
        teclado = new Scanner(System.in);
        calculadora = new CalculadoraRPN();
    }

    //Método que inicia a captação de inputs
    public void inicia(){
        //Apenas exibe a mensagem inicial
        System.out.println("Calculadora RPN");
        //Loop principal
        atualiza();
    }

    protected void atualiza(){

        String entrada;
        Numeros valor;
        
        //- Captar inputs do teclado via terminal
        entrada = teclado.nextLine();

        //- Validar inputs só vou exibir mensagem de erro usando try catch
        //pular

        //Converter inputs para real ou complexo
        String[] valorPreConvertido = entrada.split(" ");
        String num_1, num_2;
        
        

        //Se der erro, significa que a entrada é um sinal 
        try{
            if(entrada.equals("+") || entrada.equals("-") || entrada.equals("*") || entrada.equals("/")){
                calculadora.realizaOperacao(entrada);
            }
            else{
                num_1 = valorPreConvertido[0];
        
                if(valorPreConvertido.length > 1) 
                    num_2 = valorPreConvertido[1];
                
                else{
                    num_2 = "0";
                }
                
                //Fazendo a conversão para double das Strings

                valor = new Numeros(Double.parseDouble(num_1),Double.parseDouble(num_2));
                calculadora.adicionaElemento(valor);
            }

        }catch(NumberFormatException e){
            System.out.println("Entrada não é válida");
        }

        /* Ver se o número é complexo ou double
        

         * 1. Assumir que é real e botar no double (parseDouble) e se der erro == complexo
         * Colocar try catch, verificando se é sinal -> Operadores e mando direto pra calculadora após fazer
         * tratamento/verificacao if, else
         * senão -> conversão do complexo, splita e pega os dois e passo pra numeros
         * se for real (r=valor + i=0) se for imaginario (r= parte + i=valor)
         * 
         * vou receber no molde "numero numero"
         */

        //- Imprime outputs/resultados
        /* */
        printaResultado();
        //Continuando loop
        atualiza();
    }

    private void printaResultado(){
        System.out.println(calculadora.getUltimoElemento().toString());
    }
  
}
