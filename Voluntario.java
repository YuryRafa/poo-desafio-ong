public class Voluntario extends MembroONG {
    private String setor;

    public Voluntario(String nome, String cpf, int diasAtuacao, String setor) {
        super(nome, cpf, diasAtuacao);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void exibirResumo() {
        System.out.println("Voluntário: " + getNome() + " | Setor: " + setor + " | Dias de atuação: " + getDiasAtuacao());
    }
}