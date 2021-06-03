
package programamenu;

import java.util.Scanner;

/**
 *
 * @author VINNY
 */
public class ProgramaMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner (System.in);
        System.out.println("Quantas pernas?");
        int pernas = t.nextInt();
        String tipo;
        System.out.println("Iso é um(a) ");
        
        switch (pernas){
            case 1:
                tipo = "Cadastrar";
                break;
            case 2:
                tipo = "Deletar";
                break;
            case 3:
                tipo = "Consultar";
                break;
            default:
                 tipo = "opcao invalida";
                break;
        }
        System.out.println(tipo);
        
        
    }
    
}
