public class FrasesInversas {

    public static void main(String[] args) {


        String frase1 = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String frase2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";
        String fraseInverso1 = "";
        String fraseInverso2 = "";

        //utilizando for
        for (int letrasDaFrase1 = frase1.length() -1; letrasDaFrase1 >=0 ; letrasDaFrase1 --){
            fraseInverso1 = fraseInverso1 + frase1.charAt(letrasDaFrase1); // O método charAt() retorna o caractere especificado a partir de uma string.
        }

        System.out.println(fraseInverso1);

        System.out.println("-------------------------------------");

        //utilizando while
        int letrasDaFrase2 = frase2.length() -1;
        while (letrasDaFrase2 >=0){
            fraseInverso2 = fraseInverso2 + frase2.charAt(letrasDaFrase2);
            letrasDaFrase2 --;
        }
        System.out.println(fraseInverso2);

    }
}
