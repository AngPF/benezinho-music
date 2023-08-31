package br.com.fiap.domain.view;

import br.com.fiap.domain.entity.Artista;
import br.com.fiap.domain.entity.Estilo;
import br.com.fiap.domain.entity.Musica;

import javax.swing.*;

public class MenuView {

    public void show(){

        String mensagem = """
                *****   BENEZINHO MUSIC   *****
                Digite:
                
                1- Cadastro de Artistas
                    11 - Listagem de Artistas
                    12 - Consulta de Artista por ID
                    13- Consulta Artista pelo Nome
                    
                2- Cadastro de Estilos
                    21- Listagem de Estilo
                    22 - Consulta de estilo Musical pelo ID
                    23 - Consulta Estilo Musical pelo Nome
                    
                3- Cadastro de Musicas
                    31 - Listagem de musicas 
                    32 - Consulta de Musica peo ID
                    33 - Consulta Musica pelo Nome
                    
                0 - Sair do Programa                               
                """;

        var estiloView = new EstiloView();
        var artistaView = new ArtistaView();
        var musicaView = new MusicaView();

        short opcao = 0;

        do {
            try {
                opcao = Short.parseShort(JOptionPane.showInputDialog(mensagem));

            } catch (Exception e) {
                System.exit(0);
            }

            switch (opcao) {
                case 1 -> {
                    Artista artista = artistaView.persist(null);
                    System.out.println(artista);
                }
                case 11 -> {
                    artistaView.findAll().forEach(System.out::println);
                }
                case 12 -> {
                    Artista artista = artistaView.findById(null);
                    System.out.println(artista);
                }
                case 13 -> {
                    artistaView.findByName(null).forEach(System.out::println);
                }
                case 2 -> {
                    Estilo estilo = estiloView.persist(null);
                    System.out.println(estilo);
                }
                case 21 -> {
                    EstiloView.findAll().forEach(System.out::println);
                }
                case 22 -> {
                    Estilo estilo = estiloView.findById(null);
                    System.out.println(estilo);
                }
                case 23 -> {
                    estiloView.findByName(null).forEach(System.out::println);
                }
                case 3 -> {
                    Musica musica = musicaView.persist(null);
                    System.out.println(musica);
                }
                case 31 -> {
                    musicaView.findAll().forEach(System.out::println);
                }
                case 32 -> {
                    Musica musica = musicaView.findById(null);
                    System.out.println(musica);
                }
                case 33 -> {
                    musicaView.findByName(null).forEach(System.out::println);
                }
                case 0 -> {
                    var sair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do programa? ", "Sair", JOptionPane.YES_NO_OPTION);
                    if (sair == 1) opcao == 99;


                }
            }
        }while (opcao > 0);

    }
}
