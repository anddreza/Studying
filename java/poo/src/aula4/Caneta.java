package aula4;

    public class Caneta {
        public String modelo;
        private float ponta;
        private String cor;
        // protected int carga;
        private boolean tampada;

      public Caneta(String m, String c, float p){ //Este é o método constructor
            this.modelo = m;
            this.cor = c;
            this.ponta = p;
            this.tampar();
         //   this.cor = "Azul";
      }

        public void status(){
            System.out.println("SOBRE A CANETA: ");
       //     System.out.println("Modelo "  + this.modelo);
            System.out.println("Modelo: " + this.getModelo());
//            System.out.println("Uma caneta " + this.cor);
        //    System.out.println("Ponta " + this.ponta);
            System.out.println("Ponta: " + this.getPonta());
//            System.out.println("Carga" + this.carga);
//            System.out.println("Está tampada? " + this.tampada);
            System.out.println("Cor " + this.cor);
            System.out.println("Tampada: " + this.tampada);
       }

        public void tampar(){
            this.tampada = true;
        }
        public void destampar(){
            this.tampada = false;
        }

        public float getPonta() {
            return this.ponta;
        }

        public void setPonta(float p) {
            this.ponta = p;
        }

        public String getModelo() {
            return this.modelo;
        }

        public void setModelo(String m) {
            this.modelo = m;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public boolean isTampada() {
            return tampada;
        }

        public void setTampada(boolean tampada) {
            this.tampada = tampada;
        }
    }

