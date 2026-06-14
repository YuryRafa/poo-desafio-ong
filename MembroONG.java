public class MembroONG{
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

    public String setNome() {
        return nome;
    }
    
    public String setCpf() {
        return cpf;
    }
    
    public int setDiasAtuacao() {
        if (diasAtuacao < 0) {
            System.out.println("Dias de atuação não podem ser negativos.");
            return this.diasAtuacao; 
        }
        return diasAtuacao;
    }

    public String exibirResumo() {
        return "Membro: " + nome + ", CPF: " + cpf + ", Dias de Atuação: " + diasAtuacao;
    }

    



}