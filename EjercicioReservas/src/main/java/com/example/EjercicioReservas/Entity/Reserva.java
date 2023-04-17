package Repository.Entity;

import javax.persistence.*;

@Entity
@Table (name="Reserva")
public class Reserva {
    @Column (name ="fecha")
    private String fecha;
    @OneToOne
    @JoinColumn (name ="numero")
    private Habitacion habitacion;

    @OneToOne
    @JoinColumn (name = "cedula")
    private Cliente cliente;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo")
    private int codigo;

    @Column(name ="total")
    private int total;

    public Reserva() {
    }

    public Reserva(String fecha, Habitacion habitacion, Cliente cliente, int codigo, int total) {
        this.fecha = fecha;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.codigo = codigo;
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getTotal() {
        return total;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
