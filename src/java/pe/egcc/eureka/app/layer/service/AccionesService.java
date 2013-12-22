/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eureka.app.layer.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.egcc.eureka.app.layer.dao.espec.BooksDao;

/**
 *
 * @author AntOniO
 */
@Service
public class AccionesService {

    @Autowired
    private BooksDao booksDao;

    public List<Map<String, Object>> listarLibros() {
        return booksDao.listarLibros();
    }
}
