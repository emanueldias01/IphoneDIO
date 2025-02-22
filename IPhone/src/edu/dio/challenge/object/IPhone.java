package edu.dio.challenge.object;

import edu.dio.challenge.object.abstracts.Camera;
import edu.dio.challenge.object.abstracts.Navegador;
import edu.dio.challenge.object.abstracts.ReprodutorMusical;
import edu.dio.challenge.object.abstracts.Telefone;

import java.util.ArrayList;
import java.util.List;

public class IPhone implements Camera, Navegador, ReprodutorMusical, Telefone {

    private List<String> listaContatos;
    private List<String> galeria;

    public IPhone(){
        this.galeria = new ArrayList<>();
        this.listaContatos = new ArrayList<>();
    }

    @Override
    public void bateFoto() {
        System.out.println("Batendo foto...");
        String nomeFoto = "foto" + this.galeria.size();

        System.out.printf("Salvando: %s", nomeFoto);

        this.galeria.add(nomeFoto);
    }

    @Override
    public void gravaVideo() {
        System.out.println("Gravando video");
        String nomeVideo = "video" + this.galeria.size();

        System.out.printf("Salvando: %s", nomeVideo);

        this.galeria.add(nomeVideo);
    }

    @Override
    public void abreMidia() {
        System.out.println("abrindo galeria...");
        this.galeria.forEach(System.out::println);
    }

    @Override
    public void pesquisar(String pesquisa) {
        System.out.println("Pesquisando na web...");
    }

    @Override
    public void acessarLink(String link) {
        System.out.printf("Acessando link : %s", link);
    }

    @Override
    public void buscaMusica(String musica) {
        System.out.printf("Buscando musica: %s", musica);
    }

    @Override
    public void tocaMusica(String musica) {
        buscaMusica(musica);
        System.out.println("Tocando musica...");
    }

    @Override
    public void ligar(String contato) {

        if(buscarContato(contato)){
            System.out.printf("Ligando para %s", contato);
            return;
        }

        System.out.println("Contato nao encontrado");
    }

    @Override
    public void addContato(String contato) {
        this.listaContatos.add(contato);
    }

    @Override
    public void excluirContato(String contato) {
        this.listaContatos.remove(contato);
    }

    @Override
    public boolean buscarContato(String contato) {
        return this.listaContatos.contains(contato);
    }
}
