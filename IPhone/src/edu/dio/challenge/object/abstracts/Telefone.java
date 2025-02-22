package edu.dio.challenge.object.abstracts;

public interface Telefone {
    void ligar(String contato);
    void addContato(String contato);
    void excluirContato(String contato);
    boolean buscarContato(String contato);
}
