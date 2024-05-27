public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /**Requisitos:
         * Conhecer a classe Scanner
         * Exibir as mensagens ao usuário
         * Obter pela classe scanner os valores digitados no terminal
         * Exibir a mensagem final da conta criada 
         */

         double saldo = 25;
         double valorSolicitado = 18;

         if (saldo >= valorSolicitado){
            saldo = saldo - valorSolicitado;
         }else{
            System.out.println("Saldo insuficiente.");
         }

         System.out.println("Saldo atual: " + saldo);

         System.out.println("-----------------------------------------------");

         saldo = 15;
         valorSolicitado = 22;

         if (saldo >= valorSolicitado){
            saldo = saldo - valorSolicitado;
         }else{
            System.out.println("Saldo insuficiente.");
         }

         System.out.println("Saldo atual: " + saldo);
    }
}
