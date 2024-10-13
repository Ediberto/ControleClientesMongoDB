public class tabteste {
    private Integer id;
    private String mat;
    private String nome;
    private String email;
    //MÉTODO CONSTRUTOR VAZIO
    public tabteste() {
    }
    public tabteste(Integer id, String mat, String nome, String email) {
        this.id = id;
        this.mat = mat;
        this.nome = nome;
        this.email = email;
    }

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
}
