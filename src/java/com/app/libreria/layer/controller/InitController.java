/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.libreria.layer.controller;

import com.app.libreria.domain.Empleado;
import com.app.libreria.layer.service.IngresoService;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 *
 * @author AntOniO
 */
@Component
@ManagedBean
@SessionScoped
@Configuration
@ComponentScan("com.app.libreria.layer.service")
public class InitController{

    @Autowired
    private IngresoService service;
    private Empleado empleado;
    private String usuario;
    private String clave;

    public Empleado getEmpleado() {
        return empleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String procesar() {
        String destino;
        try {
            empleado = service.validar(usuario, clave);
            destino = "paginaInicial";
        } catch (Exception e) {
            destino = "index";
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Error en inicio de sesión.",
                    e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        return destino;
    }

    public String salir() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.invalidate();
        return "index2";
    }
}
