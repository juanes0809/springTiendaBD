package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionTipoPrenda;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.TipoPrendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPrendaServicio {
    @Autowired
    ValidacionTipoPrenda validacionTipoPrenda;
    @Autowired
    TipoPrendaRepositorio tipoPrendaRepositorio;

    public TipoPrenda guardarTipoPrenda(){
        return null;
    }

    public TipoPrenda buscarTipoPrendaPorId(){
        return null;
    }

    public List<TipoPrenda> buscarTipoPrendas(){
        return null;
    }

    public TipoPrenda modificarTipoPrenda(){
        return null;
    }

    public boolean eliminarTipoPrenda(){
        return true;
    }

}
