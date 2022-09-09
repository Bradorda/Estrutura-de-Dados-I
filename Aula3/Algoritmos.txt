import java.util.Scanner;

public class Algoritmos_Aula3 {

        public static void main(String []args){

         /* Faca os seguintes exercicios e suba o codigo no Github
        11, 12, 16, 18, 23, 25, 26, 27, 31, 40,  41, 42, 43, 44, 46, 48*/
            /* o Uso de ------------------------------ e pra facilitar a visualizacao do codigo quando execultar*/

            Scanner input = new Scanner(System.in);

            /* Algoritimo 11 */
            System.out.println ("Aprendendo Algoritmo!!");
            System.out.println("------------------------------\n");

            /* Algoritimo 12 */
            System.out.println ("Aprendendo Algoritmo!!");
            System.out.println ("Com Anita e Guto");
            System.out.println("------------------------------\n");

            /* Algoritimo 16 */
            int x;
            x = 10;
            System.out.println (x);
            System.out.println("------------------------------\n");

            /* Algoritimo 18 */
            int xx;
            xx = 10;
            System.out.println ("Valor de x = "+ (xx + 1));
            System.out.println("------------------------------\n");

            /* Algoritimo 23 */
            int a,d;
            System.out.println ("Digite numero de tres casas: ");
            a = input.nextInt();
            d = a % 100 / 10;
            System.out.println ("Algarismo da casa das dezenas: "+d);
            System.out.println("------------------------------\n");

            /* Algoritimo 25 */
            int data,dia,mes,ano;
            System.out.println ("Digite a data no formado ddmmaa: ");
            data = input.nextInt();
            dia = data / 10000;
            mes = data % 10000 / 100;
            ano = data % 100;
            System.out.println ("DIA "+dia);
            System.out.println ("MES "+mes);
            System.out.println ("ANO "+ano);
            System.out.println("------------------------------\n");

            /* Algoritimo 26 */
            int dataa,diaa,mess,anoo,ndata;
            System.out.println ("Digite a data no formato DDMMAA");
            dataa = input.nextInt();
            diaa = dataa/10000;
            mess = dataa % 10000 / 100;
            anoo = dataa % 100;
            ndata = mes * 10000 + dia * 100 + ano;
            System.out.println ("DIA: "+diaa);
            System.out.println ("MES: "+mess);
            System.out.println ("ANO: "+anoo);
            System.out.println ("DATA NO FORMATO MMDDAA "+ndata);
            System.out.println("------------------------------\n");

            /* Algoritimo 27 */
            int xxx , yyy;
            xxx = 2;
            yyy = 5;
            System.out.println ("X = "+xxx);
            xxx++;
            System.out.println ("Y = "+yyy);
            yyy--;
            System.out.println ("Novo valor de X: "+xxx);
            System.out.println ("Novo valor de y: "+yyy);
            System.out.println("------------------------------\n");

            /* Algoritimo 31 */
            float ma;
            ma = ( 8 + 9 + 7 ) / 3;
            System.out.println ("A media aritmetica e: "+ma);
            System.out.println("------------------------------\n");

            /* Algoritimo 40 */
            int quoc,rest,val1,val2;
            System.out.println ("Entre com o dividendo: ");
            val1 = input.nextInt();
            System.out.println ("Entre com o divisor: ");
            val2 = input.nextInt();
            quoc = val1 / val2;
            rest = val1 % val2;
            System.out.println ("Dividendo: "+val1);
            System.out.println ("Divisor: "+val2);
            System.out.println ("Quociente: "+quoc);
            System.out.println ("Resto: "+rest);
            System.out.println("------------------------------\n");

            /* Algoritimo 41 */
            float aa, b, c, dd, mp;
            System.out.println ("Entre com 1 numero: ");
            aa = input.nextInt();
            System.out.println ("Entre com o 2 numero: ");
            b = input.nextInt();
            System.out.println ("Entre com o 3 numero: ");
            c = input.nextInt();
            System.out.println ("Entre com o 4 numero: ");
            dd = input.nextInt();
            mp = (aa*1 + b*2 + c*3  + dd*4) / 10;
            System.out.println ("Media ponderada: "+mp);
            System.out.println("------------------------------\n");

            /* Algoritimo 42 */
            double angulo,rang;
            System.out.println ("Digite um angulo em graus: ");
            angulo = input.nextInt();
            rang = ( angulo*Math.PI ) / 180;
            System.out.println ("seno: "+Math.sin(rang));
            System.out.println ("co-seno: "+Math.cos(rang));
            System.out.println ("tangente: "+Math.tan(rang));
            System.out.println ("co-secante: "+ 1/Math.sin (rang));
            System.out.println ("secante: "+ 1/ Math.cos(rang));
            System.out.println ("cotangente: "+ 1/ Math.tan (rang));
            System.out.println("------------------------------\n");

            /* Algoritimo 43 */
            double num, logaritmo;
            System.out.println ("Entre com o logaritmo: ");
            num = input.nextInt();
            logaritmo = Math.log(num) / Math.log (10);
            System.out.println ("Logaritmo: "+logaritmo);
            System.out.println("------------------------------\n");

            /* Algoritimo 44 */
            double numm, base , logaritmoo;
            System.out.println ("Entre com o logaritmando: ");
            numm = input.nextInt();
            System.out.println ("Entre com a base: ");
            base = input.nextInt();
            logaritmoo = Math.log(numm) / Math.log(base);
            System.out.println ("O logaritmo de " + numm + " na base " + base + " e " + logaritmoo );
            System.out.println("------------------------------\n");

            /* Algoritimo 46 */
            double saldo , nsaldo;
            System.out.println ("Digite saldo: ");
            saldo = input.nextInt();
            nsaldo = saldo * 1.01;
            System.out.println ("Novo saldo: "+nsaldo);
            System.out.println("------------------------------\n");

            /* Algoritimo 48 */
            double sm,qtdade, preco, vp, vd;
            System.out.println ("Entre com o salario minimo: ");
            sm = input.nextInt();
            System.out.println ("Entre com a quantidade em quilowatt: ");
            qtdade = input.nextInt();
            preco = sm / 700;
            vp = preco * qtdade;
            vd = vp * 0.9;
            System.out.println ("preco do quilowatt: "+ preco + "\nvalor a ser pago: "+ vp + "\nvalor com desconto: "+ vd);
        }
    }



