/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.eureka.app.layer.dao.impl;

import java.util.List;
import java.util.Map;
import pe.egcc.eureka.app.domain.Empleado;
import pe.egcc.eureka.app.layer.dao.espec.BooksDao;

/**
 *
 * @author AntOniO
 */
public class BooksDaoImpl extends AbstractDao implements BooksDao{

    @Override
    public List<Map<String, Object>> listarLibros() {
        String sql = "SELECT * from shop.books";		
		List<Map<String,Object>> lista  =  jdbcTemplate.queryForList(sql);
		return lista;
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
