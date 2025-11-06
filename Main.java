class Casa {
    private String color;
    private int pisos;
    private int puertas;
    private boolean tieneVentanas;
    private boolean tieneGaraje;

    // Constructor
    public Casa(String color, int pisos, int puertas, boolean tieneVentanas, boolean tieneGaraje) {
        this.color = color;
        this.pisos = pisos;
        this.puertas = puertas;
        this.tieneVentanas = tieneVentanas;
        this.tieneGaraje = tieneGaraje;
    }

    // Método describir
    public String describir() {
        String desc = "Casa color " + color + ", con " + pisos + " piso(s) y " + puertas + " puerta(s).\n";
        desc += (tieneVentanas ? "Tiene ventanas.\n" : "No tiene ventanas.\n");
        desc += (tieneGaraje ? "Incluye garaje.\n" : "No incluye garaje.\n");
        return desc;
    }

    // Método pintar
    public void pintar(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("La casa ha sido pintada de color " + nuevoColor + ".");
    }

    // Getters
    public String getColor() { return color; }
    public int getPisos() { return pisos; }
    public int getPuertas() { return puertas; }
}

// --------------------------------------------------------------
// SUBCLASE: Floristería Flor by Ista
// --------------------------------------------------------------
class florbyista extends Casa {

    private String colorFachada;
    private String colorLateral;
    private String colorPuerta;
    private String materialTecho;
    private String logo;

    private int totalFloresInterior;
    private int totalFloresExterior;

    // Detalles de la puerta
    private double anchoPuerta;
    private double altoPuerta;
    private String materialPuerta;

    // Constructor
    public florbyista() {
        super("Amarillo", 1, 1, true, false);

        // Atributos propios
        this.colorFachada = "Verde"; 
        this.colorLateral = "Azul";
        this.colorPuerta = "Marrón"; 
        this.materialTecho = "Tejas de barro artesanales";
        this.logo = "Logo 'Flor by Vero' en letras cursivas con un racimo de 3 flores y dos hojas";

        // Flores
        this.totalFloresInterior = 14; 
        this.totalFloresExterior = 9;  

        // Puerta
        this.anchoPuerta = 72.5;
        this.altoPuerta = 203.0;
        this.materialPuerta = "Madera maciza con herrajes de hierro forjado";
    }

    // Método describir (sobrescrito)
    @Override
    public String describir() {
        String desc = "--- Descripción Arquitectónica de la Floristería Flor by Vero ---\n\n";
        desc += "Estructura Base: 4 paredes blancas con lianas y flores a su alrededor.\n";
        desc += "Techo: De tamaño grande con " + this.materialTecho + ".\n\n";

        desc += "--- Fachadas y Colores ---\n";
        desc += "* Fachada Principal: Color " + this.colorFachada + ".\n";
        desc += "* Fachada Posterior: Color " + this.colorFachada + ".\n";
        desc += "* Laterales (Izquierda y Derecha): Color " + this.colorLateral + ".\n\n";

        desc += "--- Puertas y Ventanas ---\n";
        desc += "* Puerta Principal: Color " + this.colorPuerta + ", de " + this.materialPuerta +
                " (" + this.anchoPuerta + " cm x " + this.altoPuerta + " cm).\n";
        desc += "* Ventana Izquierda: Translúcida, con el logo: \"" + this.logo + "\".\n";
        desc += "* Ventana Posterior: Tipo tragaluz.\n";
        desc += "* Ventana Derecha: Translúcida, permite ver plantas colgantes.\n\n";

        desc += "--- Resumen de Flores en Exhibición ---\n";
        desc += "* Flores Interiores (Total " + this.totalFloresInterior + "): 14 unidades (Lirios, Orquídeas y Rosas).\n";
        desc += "* Flores Exteriores (Total " + this.totalFloresExterior + "): 9 girasoles (en matera posterior).\n";

        return desc;
    }

    // Método sobrescrito pintar
    @Override
    public void pintar(String nuevoColor) {
        super.pintar(nuevoColor);
        this.colorFachada = nuevoColor;
        System.out.println("La FACHADA PRINCIPAL de la floristería ha sido pintada de color " + nuevoColor);
    }

    // Nuevos métodos específicos de la floristería
    public void pintarLaterales(String nuevoColor) {
        this.colorLateral = nuevoColor;
        System.out.println("Las fachadas LATERALES han sido pintadas de color " + nuevoColor);
    }

    public void pintarPuerta(String nuevoColor) {
        this.colorPuerta = nuevoColor;
        System.out.println("La PUERTA ha sido pintada de color " + nuevoColor);
    }
}

// --------------------------------------------------------------
// Clase principal para ejecutar en OneCompiler
// --------------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        // Crear instancia
        florbyista miTienda = new florbyista();

        // Mostrar descripción
        System.out.println(miTienda.describir());

        System.out.println("======================================================");
        System.out.println("                     PINTANDO LA TIENDA...");
        System.out.println("======================================================");

        // Ejemplos de uso
        miTienda.pintar("Blanco Nube");
        miTienda.pintarLaterales("Azul Cielo");
        miTienda.pintarPuerta("Café Claro");
    }
}
