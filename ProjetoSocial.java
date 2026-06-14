public class ProjetoSocial {
    private String nomeDoProjeto;
    private int metaImpacto;
    private Voluntario lider;

    public ProjetoSocial(String nomeDoProjeto, int metaImpacto, Voluntario lider) {
        this.nomeDoProjeto = nomeDoProjeto;
        this.metaImpacto = metaImpacto;
        this.lider = lider;
    }

    public String getNomeDoProjeto() {
        return nomeDoProjeto;
    }

    public int getMetaImpacto() {
        return metaImpacto;
    }

    public Voluntario getLider() {
        return lider;
    }

    public void setNomeDoProjeto(String nomeDoProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public void setMetaImpacto(int metaImpacto) {
        if (metaImpacto < 0) {
            System.out.println("Meta de impacto não pode ser negativa.");
        } else {
            this.metaImpacto = metaImpacto;
        }
    }

    public void setLider(Voluntario lider) {
        this.lider = lider;
    }

    // Method
    public String iniciarProjeto() {
        System.out.println("Projeto " + nomeDoProjeto + " iniciado!");
        System.out.println("Líder responsável: " + lider.getNome());
        System.out.println("Setor: " + lider.getSetor());
        System.out.println("Meta de impacto: " + metaImpacto + " pessoas atendidas.");
        return "Projeto iniciado com sucesso!";
    }
}