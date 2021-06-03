/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador1;

/**
 *
 * @author VINNY
 */
public class Contador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc=0;
        while (cc<10){
            cc+=1;
            if (cc == 2 || cc == 3 || cc==4){
                continue; //quando o contador chegar em 5 ou 7 não vai executar esse comando e vai verificar a condição (Volta p laço)
            }
            if (cc==7){
                break; //sai do laço de repetição quando contador chega ao 7
            }
            System.out.println("Cambalhota" +cc);
            
            
        }
    }
    
}
