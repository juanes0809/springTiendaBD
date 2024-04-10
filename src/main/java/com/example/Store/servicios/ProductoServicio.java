package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionProducto;
import com.example.Store.modelos.Producto;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {
    @Autowired
    ValidacionProducto validacionProducto;
    @Autowired
    ProductoRepositorio productoRepositorio;

    public Producto guardarProducto(){
        return null;
    }

    public Producto buscarProductoPorId(){
        return null;
    }

    public List<Producto> buscarTodosProductos(){
        return null;
    }

    public Producto modificarProducto(){
        return null;
    }

    public boolean eliminarProducto(){
        return true;
    }
}
