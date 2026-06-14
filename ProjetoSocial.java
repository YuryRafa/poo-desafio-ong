public class ProjetoSocial {
    public String nomeDoProjeto;
    public int metaImpacto;
    public Voluntario lider;

    public ProjetoSocial(String nomeDoProjeto, int metaImpacto, Voluntario lider) {
        this.nomeDoProjeto = nomeDoProjeto;
        this.metaImpacto = metaImpacto;
        this.lider = lider;
    }

    public String iniciarProjeto() {
        return "Projeto " + nomeDoProjeto + " iniciado, liderado por " + lider.getNome() + ". Meta de impacto: " + metaImpacto;
    }


    
}