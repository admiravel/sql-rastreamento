package main;

import entities.Usuario;
import entities.Encomenda;
import entities.Status;
import services.UsuarioServiceImpl;
import services.EncomendaServiceImpl;
import services.StatusServiceImpl;
import interfaces.UsuarioService;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioServiceImpl();
        EncomendaServiceImpl encomendaService = new EncomendaServiceImpl();
        StatusServiceImpl statusService = new StatusServiceImpl();

        // Criar um novo usuário
        Usuario novoUsuario = new Usuario("Maria Silva", "maria@example.com", "123456789");
        usuarioService.criarUsuario(novoUsuario);

        // Buscar e listar usuários
        Usuario usuario = usuarioService.buscarUsuario(1);
        System.out.println("Usuário encontrado: " + usuario.getNome());

        // Listar todos os usuários
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        usuarios.forEach(u -> System.out.println("Usuário: " + u.getNome()));

        // Criar uma nova encomenda
        Encomenda novaEncomenda = new Encomenda("AB123456BR", new Date(System.currentTimeMillis()), 1);
        encomendaService.criarEncomenda(novaEncomenda);

        // Adicionar status à encomenda
        Status novoStatus = new Status(1, "Em trânsito", new Date(System.currentTimeMillis()));
        statusService.salvarStatus(novoStatus);

        // Buscar e listar status por encomenda
        List<Status> statusList = statusService.buscarStatusPorEncomenda(1);
        statusList.forEach(s -> System.out.println("Status da encomenda: " + s.getStatus()));
    }
}
