 abstract class Arma {

    private int cantidadMuniciones;
    private double alcance;
    private String marca;
    private int calibre;
    private String estado;
    private Policia policia;

    public Arma(int cantidadMuniciones, double alcance, String marca, int calibre, String estado,Policia policia) {
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.policia=policia;
    }

    public int getCantidadMuniciones() {
        return cantidadMuniciones;
    }

    public void setCantidadMuniciones(int cantidadMuniciones) {
        this.cantidadMuniciones = cantidadMuniciones;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

     public Policia getPolicia() {
         return policia;
     }

     public void setPolicia(Policia policia) {
         this.policia = policia;

     }

     public boolean enCondicion () {
         if ( getCalibre() >= 9 && estado== "EN USO"){
             System.out.println( " EL ARMA SE ENCUENTRA EN CONDICIONES ");
             return true;
         } else{
             System.out.println( " EL ARMA NO SE ENCUENTRA EN CONDICIONES ");
             return false;
         }
     }

 }
