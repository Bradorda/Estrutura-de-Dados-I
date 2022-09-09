public class Algoritimo_19 {


    public static void main(String []args) {

        double item = 0.333333333333333333; /* Não estava reconhecendo 1/3 */

        System.out.println("\n");

        System.out.println ("Raiz: "+ Math.sqrt(64));
        System.out.println ("Raiz com exp e log e  realint: "+ Math.round (Math.exp (0.5 * Math.log (64))));
        System.out.println ("Raiz com exp e log e sem realint: "+ Math.exp (0.5 * Math.log (64)));
        System.out.printf ("%.3f", Math.sin ((45 * 3.14 / 180) + 0.00013));
        System.out.printf ("\nPotencia com exp e log e formatar: %.3f", Math.exp(3 * Math.log(8))+0.00013 );
        System.out.println ("\nPotencia com exp e log sem formatar: "+ Math.exp (3 * Math.log(8)));
        System.out.printf ("Potencia com operador ** e formatar: %.3f", Math.pow(8,3));
        System.out.println ("\nRaiz cubica: " + Math.exp ( item * Math.log(8)));
        System.out.println ("Absoluto: "+ Math.abs(-8));
        System.out.println ("Absoluto: "+Math.abs(8));
        System.out.println ("Convertendo para inteiro 5.5: " + Math.round (5.5));
        System.out.println ("Convertendo para inteiro 6.5: " + Math.floor (6.5));
        System.out.println ("convertendo para inteiro 6.5 + 0.0001: "+ Math.round(6.5 + 0.0001));
        System.out.println ("convertendo para inteiro 5.45: "+ Math.round(5.45));
        System.out.println ("convertendo para inteiro 5.51: "+ Math.round(5.51));
        System.out.println ("convertendo para real 87: "+Math.floor(87));
        System.out.println ("convertendo para int 3/4: "+ Math.round( 0.75 ) +" \n ");

    }
}
