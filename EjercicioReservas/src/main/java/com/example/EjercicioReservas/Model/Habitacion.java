package Model;

public class Habitacion {
    private int numero;
    private String tipo;
    private float precioBase;

    public Habitacion(int numero, String tipo, float precioBase) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
}
