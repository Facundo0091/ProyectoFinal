 class ArmaCorta extends Arma {
    private boolean esAutomatica;

     public ArmaCorta(int cantidadMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica,Policia policia) {
         super(cantidadMuniciones, alcance, marca, calibre, estado,policia);
         this.esAutomatica =esAutomatica;

     }

     public boolean isEsAutomatica() {
         return esAutomatica;
     }

     public void setEsAutomatica(boolean esAutomatica) {
         this.esAutomatica = esAutomatica;
     }
     //metodo efectividad
     public boolean efectividad () {
        if ( this.getAlcance() >= 200 ) {
            return true;
        } else{
            return false;
        }
     }

     public void imprimirDatosDelArma(){
         System.out.println("DATOS DEL ARMA CORTA ");
         System.out.println(" CANTIDAD DE MUNICIONES " + getCantidadMuniciones());
         System.out.println(" ALCANCE " + getAlcance());
         System.out.println(" MARCA " + getMarca() );
         System.out.println(" CALIBRE " + getCalibre());
         System.out.println(" ESTADO " + getEstado());
         System.out.println( " EL ARMA ES AUTOMATICA: " + esAutomatica);
         getPolicia().imprimirDatos();
     }
 }
