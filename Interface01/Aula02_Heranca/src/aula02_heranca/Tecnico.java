package aula02_heranca;

public class Tecnico extends Empregado{
    String titulo;
    public Tecnico (int matricula, String nome, String titulo) {
        super (matricula, nome);
        this.titulo = titulo;
    }
    
}
