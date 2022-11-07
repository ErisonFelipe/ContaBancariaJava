public class Cliente implements Autenticavel {
    private String nome;
    private String cpf;
    private String profissao;
    private AutenticacaoUtil autenticador;

    public Cliente(){

        this.autenticador = new AutenticacaoUtil();
    }

    public String setCpf(String cpf) {
        return this.cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }
}
