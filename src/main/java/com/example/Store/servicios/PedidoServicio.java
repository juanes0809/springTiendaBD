package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionPedido;
import com.example.Store.modelos.Pedido;
import com.example.Store.modelos.Producto;
import com.example.Store.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServicio {
    @Autowired
    ValidacionPedido validacionPedido;
    @Autowired
    PedidoRepositorio pedidoRepositorio;

    public Pedido guardarPedido(){
        return null;
    }

    public Pedido buscarPedidoPorId(){
        return null;
    }

    public List<Pedido> buscarTodosPedidos(){
        return null;
    }

    public Pedido modificarPedido(){
        return null;
    }

    public boolean eliminarPedido(){
        return true;
    }
}
