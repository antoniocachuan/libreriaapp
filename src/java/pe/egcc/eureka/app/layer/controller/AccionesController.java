/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eureka.app.layer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import pe.egcc.eureka.app.layer.service.AccionesService;

/**
 *
 * @author AntOniO
 */
@Component()
@ManagedBean
@RequestScoped
@ComponentScan("pe.egcc.eureka.app.layer.service")
public class AccionesController {

    @Autowired
    private AccionesService accionesService;

    private List<Map<String, Object>> lista;

    public List<Map<String, Object>> getLista() {
        if (lista == null) {
            lista = new ArrayList<Map<String, Object>>();
        }
        return lista;
    }

    public void consultarMovimientos() {
        lista = accionesService.listarLibros();
    }
}
