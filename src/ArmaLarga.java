 class ArmaLarga extends Arma
 implements Comparable
 {
     private String usoJustificado;
     private int nivelArma;
     private boolean tieneSello;

     public ArmaLarga(int cantidadMuniciones, double alcance,
                      String marca, int calibre, String estado, String usoJustificado, int nivelArma, boolean tieneSello, Policia policia) {
         super(cantidadMuniciones, alcance, marca, calibre, estado, policia);
         this.usoJustificado = usoJustificado;
         this.nivelArma = nivelArma;
         this.tieneSello = tieneSello;
     }

     public String getUsoJustificado() {
         return usoJustificado;
     }

     public void setUsoJustificado(String usoJustificado) {
         this.usoJustificado = usoJustificado;
     }

     public int getNivelArma() {
         return nivelArma;
     }

     public void setNivelArma(int nivelArma) {
         this.nivelArma = nivelArma;
     }

     public boolean getTieneSello() {
         return tieneSello;
     }

     public void setTieneSello(boolean tieneSello) {
         this.tieneSello = tieneSello;
     }

     public void imprimirDatosDelArmaLarga() {
         System.out.println("DATOS DEL ARMA LARGA ");
         System.out.println(" CANTIDAD DE MUNICIONES " + getCantidadMuniciones());
         System.out.println(" ALCANCE " + getAlcance());
         System.out.println(" MARCA " + getMarca());
         System.out.println(" CALIBRE " + getCalibre());
         System.out.println(" ESTADO " + getEstado());
         System.out.println(" USO JUSTIFICADO " + usoJustificado);
         System.out.println(" NIVEL DEL ARMA " + nivelArma);
         System.out.println(" TIENE SELLO " + tieneSello);
         getPolicia().imprimirDatos();

     }

     @Override
     public boolean compareTo(ArmaLarga armaAComparar) {

         if (nivelArma > armaAComparar.getNivelArma()) {
             System.out.println( " EL ARMA " + getMarca() + " TIENE MAYOR NIVEL QUE EL ARMA " + armaAComparar.getMarca());
             return true;
         }

         else {
             System.out.println( " EL ARMA " + armaAComparar.getMarca() + " TIENE MAYOR NIVEL QUE EL ARMA " + getMarca());
             return false;
         }

     }
 }