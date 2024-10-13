public class Cliente {
    private Integer id;
    private String mat;
    private String nome;
    private String email;
    //MÉTODO CONSTRUTOR VAZIO
    public Cliente() {
    }
    //MÉTODO CONSTRUTOR CHEIO COM TODOS OS ATRIBUTOS
    public Cliente(Integer id, String mat,String nome, String email) {
        this.id = id;
        this.mat = mat;
        this.nome = nome;
        this.email = email;
    }
    //MÉTODO CONSTRUTOR CHEIO COM OS ATRIBUTOS, MENOS COM A CHAVE PRIMÁRIA
    public Cliente(String mat, String nome, String email) {
        //this.id = id;
        this.mat = mat;
        this.nome = nome;
        this.email = email;
    }
    //MÉTODOS GETTERS E SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //ESSE MÉTODO IRÁ PRINTAR NA TELA UM OBJETO DA TABELA CLIENTE
    @Override
    public String toString() {
        return "id" + id + ", Matricula = " + mat + ", nome = " + nome + ", email = " + email;
    }
}
