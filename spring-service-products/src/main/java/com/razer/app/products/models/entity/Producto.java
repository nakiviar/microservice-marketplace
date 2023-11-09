package com.razer.app.products.models.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity //represents a table stored in a database.
@Table(name = "productos") // the name of the table in database , and the name of the class dont be necessarily the same
public class Producto  implements Serializable { //interfaz serializable que permite convertir este objeto en bits

    @Serial  // introduce in java 14 -- Validate in compile time like @override (tiempo de compilacion)
    private static final long serialVersionUID = -6384204763420258352L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false, unique = false)
    private String nombre;

    @Column(name = "precio")
    private Double precio;

    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
