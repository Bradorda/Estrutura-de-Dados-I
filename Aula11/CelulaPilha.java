public class CelulaPilha {
    private String conta;
    private CelulaPilha anterior;

    public CelulaPilha() {}
        public CelulaPilha(String conta,CelulaPilha anterior) {
            this.conta = conta;
            this.anterior = anterior;
        }

        public String getDado(){
        return this.conta;
        }

        public void setDado(String conta){
        this.conta = conta;
        }

        public CelulaPilha getAnterior(){
        return (this.anterior);
        }

        public void setAnterior(CelulaPilha anterior){
        this.anterior = anterior;
        }
}