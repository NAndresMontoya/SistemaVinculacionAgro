public class Solicitud {

    String productor;
    String maquinaria;
    String problema;
    String ubicacion;
    String urgencia;
    String estado;

    public Solicitud(
            String productor,
            String maquinaria,
            String problema,
            String ubicacion,
            String urgencia
    ) {

        this.productor = productor;
        this.maquinaria = maquinaria;
        this.problema = problema;
        this.ubicacion = ubicacion;
        this.urgencia = urgencia;
        this.estado = "Pendiente";

    }

    public void mostrarSolicitud() {

        System.out.println("--- DATOS DE LA SOLICITUD ---");
        System.out.println("Productor: " + productor);
        System.out.println("Maquinaria: " + maquinaria);
        System.out.println("Problema: " + problema);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Urgencia: " + urgencia);
        System.out.println("Estado: " + estado);

    }

    public void aceptarSolicitud() {

        estado = "Aceptada";

        System.out.println("La solicitud fue aceptada por un mecanico.");
        System.out.println("Contacto del productor disponible para coordinacion.");

    }

}