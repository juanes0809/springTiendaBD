package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionMarca;
import com.example.Store.modelos.Marca;
import com.example.Store.modelos.Producto;
import com.example.Store.repositorios.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServicio {
    @Autowired
    ValidacionMarca validacionMarca;
    @Autowired
    MarcaRepositorio marcaRepositorio;

    public Marca guardarMarca(){
        return null;
    }

    public Marca buscarMarcaPorId(){
        return null;
    }

    public List<Marca> buscarTodasMarcas(){
        return null;
    }

    public Marca modificarMarca(){
        return null;
    }

    public boolean eliminarMarca(){
        return true;
    }
}
