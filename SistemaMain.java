public class SistemaMain {
    public static void main(String[] args) {
        Voluntario voluntario1 = new Voluntario("", "", 0, "");
        voluntario1.setNome("Jonilson");
        voluntario1.setCpf("12345678900");
        voluntario1.setDiasAtuacao(30);
        voluntario1.setDiasAtuacao(-5);
        voluntario1.setSetor("Agricultura");

        Doador doador1 = new Doador("", "", 0, 0);
        doador1.setNome("Maria");
        doador1.setCpf("98765432100");
        doador1.setDiasAtuacao(10);
        doador1.setDiasAtuacao(-1);
        doador1.setValorDoadoMensal(150.00);
        doador1.setValorDoadoMensal(-50.00);

        ProjetoSocial projeto1 = new ProjetoSocial("Horta Comunitária", 100, voluntario1);
        projeto1.setMetaImpacto(-10);

        System.out.println("=== Resumo dos Membros ===");
        voluntario1.exibirResumo();
        doador1.exibirResumo();

        System.out.println("\n=== Projeto Social ===");
        projeto1.iniciarProjeto();
    }
}