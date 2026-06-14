public static void main(String[] args){
    Voluntario voluntario1 = new Voluntario("Jonilson", "12345678900", 30, "Agricultura");
    Doador doador1 = new Doador("Maria", "98765432100", 60, 500.00);
    ProjetoSocial projeto1 = new ProjetoSocial("Horta Comunitária", 100, voluntario1);

    exibirResumo(voluntario1);
    exibirResumo(doador1);

    System.out.println(projeto1.iniciarProjeto());
}