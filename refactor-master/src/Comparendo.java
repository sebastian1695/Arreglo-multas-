public class Comparendo {
    private int precioMultaCarro = 50000;
    private int precioMultaCamion = 60000;
    private int precioMultaMula= 80000;


    private int carro;
    private int camion;
    private int mula;



    public Comparendo ( int carro, int camion, int mula){
        this.carro= carro;
        this.camion= camion;
        this.mula= mula;

            }


            public void calcularmulta() {

               int multaCarro = precioMultaCarro;
               int multaCamion =precioMultaCamion;
               int multaMula = precioMultaMula;

                if (carro >= 65) {
                    System.out.println("la velocidad del carro es muy alta, te va a llegar una multa de: "   +multaCarro+".");
                    System.out.println("Asunto: Comparendo por exceso de velocidad");
                    System.out.println("Mensaje: El dueño del vehículo ha sido multado por conducir por encima de los límites de velocidad. Valor a pagar: " +multaCarro +".");
                    System.out.println("____________________");

                }  if (camion >= 70) {

                    System.out.println("la velocidad del camión es muy alta, te va a llegar una multa de: " +multaCamion+".");
                    System.out.println("Asunto: Comparendo por exceso de velocidad");
                    System.out.println("Mensaje: El conductor del vehículo ha sido multado por conducir por encima de los límites de velocidad. Valor a pagar: "+multaCamion+".");
                    System.out.println("____________________");

                }  if (mula>= 80){
                    System.out.println("la velocidad de la mula es muy alta, te va  a llegar una multa de: " +multaMula +".") ;
                    System.out.println("Asunto: Comparendo por exceso de velocidad");
                    System.out.println("Mensaje: La empresa dueña del vehículo ha sido multada por conducir por encima de los límites de velocidad. Valor a pagar: " +multaMula+".");
                    System.out.println("____________________");

                }
            }






}
