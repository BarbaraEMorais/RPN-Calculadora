/*Início do programa.
 * 
 * Deve iniciar e instanciar o console ou UI 
 */
public class Main{
    public static void main(String[] args) {
    
    //instanciando console
    Console console = new Console();
    GUI ui = new GUI();
    
    //Descomente para iniciar o console
    //console.inicia();

    GUI.main(args);   

    }
}