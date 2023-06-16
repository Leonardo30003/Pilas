/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas;

import java.util.Date;

/**
 *
 * @author leona
 */
public class PaginaWeb {
    public String nombre;
    public String ruta;
    public Date horaVista;
    public byte[] icono;
    public Date fechaCierre;
    public String dispositivos;

    public PaginaWeb(String nombre, String ruta, Date horaVista, byte[] icono, Date fechaCierre, String dispositivos) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.horaVista = horaVista;
        this.icono = icono;
        this.fechaCierre = fechaCierre;
        this.dispositivos = dispositivos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Date getHoraVista() {
        return horaVista;
    }

    public void setHoraVista(Date horaVista) {
        this.horaVista = horaVista;
    }

    public byte[] getIcono() {
        return icono;
    }

    public void setIcono(byte[] icono) {
        this.icono = icono;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(String dispositivos) {
        this.dispositivos = dispositivos;
    }

    @Override
    public String toString() {
        return "PaginaWeb{" + "nombre=" + nombre + ", ruta=" + ruta + ", horaVista=" + horaVista + ", icono=" + icono + ", fechaCierre=" + fechaCierre + ", dispositivos=" + dispositivos + '}';
    }
    
    
}
