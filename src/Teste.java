import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso();
        ingresso.setValor(50F);

        Normal normal = new Normal();
        normal.setValor(50F);

        IngressoVip ingressoVip = new IngressoVip();
        ingressoVip.setValorAdicional(50F);

        CamaroteInferior inferior = new CamaroteInferior();
        inferior.setLocalizacao("Ponto A");
        inferior.setValorAdicional(50F);

        CamaroteSuperior superior = new CamaroteSuperior();
        superior.setAdicionalSuperior(100F);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para normal ou 2 para VIP");
        int opcao = scanner.nextInt();

        if (opcao == 1){
            System.out.println("Ingresso Normal");
            System.out.println("Valor: R$" + normal.getValor());

        } else if ( opcao == 2) {

            System.out.println("Ingresso VIP");
            System.out.println("Digite 1 para camarote superior ou 2 para camarote inferior");
            int opcao2 = scanner.nextInt();

            if (opcao2 == 1){

                System.out.println("Camarote superior");
                superior.getValor()+superior.getAdicionalSuperior();
                
            }


        }



    }
}
