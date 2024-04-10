package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionUsuario;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {
    //En los servicios debo inyectar las dependencias de: 1.Las validacioes  2.Las consultas o repositorios
    @Autowired
    ValidacionUsuario validacionUsuario;
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    //En el servicio se crea un metodo para cada una de las consultas a realizar en BD

    //Guardar un usuario
    public Usuario guardarUsuario(){
        return null;
    }

    //Consultar un usuario en BD por Id
    public Usuario buscarUsuarioPorId(){
        return null;
    }

    //Consultar todos los usuarios
    public List<Usuario> buscarTodosUsuarios(){
        return null;
    }

    //Editar un servicio
    public Usuario modificarUsuario(){
        return null;
    }

    //Eliminar un usuario
    public boolean eliminarUsuario(){
        return true;
    }

}
