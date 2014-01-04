/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.eureka.app.layer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import pe.egcc.eureka.app.domain.Orders;
import pe.egcc.eureka.app.layer.dao.espec.OrderDao;

/**
 *
 * @author AntOniO
 */
@Service
@ComponentScan("pe.egcc.eureka.app.layer.dao")
public class VentaService {
    @Autowired
    private OrderDao orderDao;
    
    public void procesarVenta(Orders order) {
		orderDao.procesarVenta(order);
	}
    
}
