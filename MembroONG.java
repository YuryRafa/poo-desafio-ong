public class MembroONG {
    private String nome;
    private String cpf;
    private int diasAtuacao;

    public MembroONG(String nome, String cpf, int diasAtuacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.diasAtuacao = diasAtuacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getDiasAtuacao() {
        return diasAtuacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDiasAtuacao(int dias) {
        if (dias < 0) {
            System.out.println("Dias de atuação não podem ser negativos.");
        } else {
            this.diasAtuacao = dias;
        }
    }

    public void exibirResumo() {
        System.out.println("Membro: " + nome + " | CPF: " + cpf + " | Dias de atuação: " + diasAtuacao);
    }
}