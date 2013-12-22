/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.libreria.layer.service;

import com.app.libreria.domain.Empleado;
import com.app.libreria.layer.dao.espec.EmpleadoCrudDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


/**
 *
 * @author AntOniO
 */
@Service
@ComponentScan("com.app.libreria.layer.dao")
public class IngresoService {

	@Autowired
	private EmpleadoCrudDao empleadoCrudDao;
	
	public Empleado validar(String usuario, String clave) {
                System.out.println("Usuario ");
                System.out.println("Clave");
		Empleado emp = empleadoCrudDao.leerPorUsuario(usuario);
		if(emp == null){
			throw new RuntimeException("Usuario no es correcto.");
		} else if(!emp.getClave().equals(clave)){
			throw new RuntimeException("Clave no es correcta.");
		}
		return emp;		
		
	}

}
