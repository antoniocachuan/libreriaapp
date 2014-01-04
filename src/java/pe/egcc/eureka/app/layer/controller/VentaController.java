/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eureka.app.layer.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import pe.egcc.eureka.app.domain.Orders;
import pe.egcc.eureka.app.layer.service.VentaService;

/**
 *
 * @author AntOniO
 */
@Component()
@ManagedBean
@RequestScoped
@ComponentScan("pe.egcc.eureka.app.layer.service")
public class VentaController {

    /**
     * Creates a new instance of VentaController
     */
    @Autowired
    private VentaService ventaService;

    private int cantidad;

    private Orders orders;

    @PostConstruct
    public void init() {
        cantidad = 1;
    }

    public Orders getOrders() {
        if(orders==null){
            orders = new Orders();
        }
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public VentaController() {

    }

    public void procesarVenta() {
        ventaService.procesarVenta(orders);
    }

    public String registroVenta() {
        String destino;
        destino = "paginaVenta";
        return destino;
    }
}
