import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FuncoesUI {

    private static CalculadoraRPN calculadora = new CalculadoraRPN();
    
    public static void selecionaBotao(String textoBotao){

        String[] valorPreConvertido = textoBotao.split(" ");
        Numeros valores;
        String num_1, num_2;

        try{
            if(textoBotao.equals("+") || textoBotao.equals("-") || textoBotao.equals("*") || textoBotao.equals("/")){
                calculadora.realizaOperacao(textoBotao);
            }
            else{
                num_1 = valorPreConvertido[0];
        
                if(valorPreConvertido.length > 1) 
                    num_2 = valorPreConvertido[1];
                
                else{
                    num_2 = "0";
                }
                
                //Fazendo a conversão para double das Strings

                valores = new Numeros(Double.parseDouble(num_1),Double.parseDouble(num_2));
                calculadora.adicionaElemento(valores);
            }

        }catch(NumberFormatException e){
            System.out.println("Error");
        }

        //printaResultado();
        //Continuando loop
    }

    public static String printaResultado(){

        return calculadora.getUltimoElemento().toString();
    }
}
