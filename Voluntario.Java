public class Voluntario extends MembroONG{
    public String setor
    


    public Voluntario(String nome, String cpf, int diasAtuacao, String setor) {
        super(nome, cpf, diasAtuacao);
        this.setor = setor;
    }

    public string getSetor() {
        return setor;
    }

    public string setSetor() {
        return this.setor = setor;
    }

    @Override
    public String exibirResumo() {
        return super.exibirResumo() + ", Setor: " + setor ;

    }

}
