//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Policia policia1 = new Policia("Raul", "Gomez", 22115);
        Policia policia2 = new Policia("Osvaldo", "Perez", 22119);
        ArmaCorta armaCorta1 = new ArmaCorta(20, 150, "Bersa", 9, "EN USO", true, policia1);//armaCorta1.getPolicia().get
        ArmaLarga armaLarga1 = new ArmaLarga(10, 120, "Remington", 12, "EN USO", "USO JUSTICADO POR OPERATIVOS ANTI DROGA", 3, true, policia1);


        armaCorta1.imprimirDatosDelArma();
        armaCorta1.enCondicion();
        System.out.println("LA EFECTIVIDAD DEL ARMA DEL EFECTIVO ES:" + (armaCorta1.efectividad() ? " MAYOR A 200 MTS" : " MENOR A 200 MTS"));
        armaLarga1.imprimirDatosDelArmaLarga();
        armaLarga1.enCondicion();

        ArmaLarga armaLarga2 = new ArmaLarga(30, 100, "COLT m4", 45, "EN USO", "USO JUSTICADO POR OPERATIVOS ANTI MOTINES", 5, true, policia2);
        armaLarga2.imprimirDatosDelArmaLarga();

        armaLarga1.compareTo(armaLarga2);

    }

}