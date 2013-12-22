/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.libreria.layer.dao.impl;

import com.app.libreria.layer.dao.mapper.EmpleadoRowMapper;
import com.app.libreria.domain.Empleado;
import com.app.libreria.layer.dao.espec.EmpleadoCrudDao;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;

/**
 *
 * @author AntOniO
 */
public class EmpleadoCrudDaoImpl extends AbstractDao implements EmpleadoCrudDao{

    @Override
    public Empleado leerPorUsuario(String usuario) {
        
        Empleado emp = null;
		try {
			System.out.println("Usuario 222 "+usuario);
                        String sql = "select * from shop.persona where idempleado = ?";
			Object[] parm = { usuario };
			emp = jdbcTemplate.queryForObject(sql, parm,new EmpleadoRowMapper());
		} catch (EmptyResultDataAccessException e) {
			emp = null;
		}
		return emp;
    }

    @Override
    public Empleado leerPorCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> leerPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(Empleado obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Empleado obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
