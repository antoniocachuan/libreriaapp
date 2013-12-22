/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.libreria.layer.dao.mapper;

import com.app.libreria.domain.Empleado;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author AntOniO
 */
public class EmpleadoRowMapper implements RowMapper<Empleado>{
    @Override
	public Empleado mapRow(ResultSet rs, int i) throws SQLException {
		Empleado emp = new Empleado();
                emp.setApellidos(rs.getString("apellidos"));
                emp.setClave(rs.getString("clave"));
                emp.setCorreo(rs.getString("clave"));
                emp.setDireccion(rs.getString("direccion"));
                emp.setTelefono(rs.getString("telefono"));
                emp.setTipo(rs.getInt("tipo"));
                emp.setIdempleado(rs.getString("idempleado"));
                emp.setNombres(rs.getString("nombres"));
		return emp;
	}
}
