/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.Date;

/**
 *
 * @author ruben
 */
public class Noticia {
    private int id;
    private String url;
    private Date fecha;
    private Date duracion;

    public Noticia(int id, String url, Date fecha, Date duracion) {
        this.id = id;
        this.url = url;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Noticia{" + "id=" + id + ", url=" + url + ", fecha=" + fecha + ", duracion=" + duracion + '}';
    }
    
    
}
