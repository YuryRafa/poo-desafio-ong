public class Doador extends MembroONG {
    private double valorDoadoMensal;

    public Doador(String nome, String cpf, int diasAtuacao, double valorDoadoMensal) {
        super(nome, cpf, diasAtuacao);
        this.valorDoadoMensal = valorDoadoMensal;
    }

    public double getValorDoadoMensal() {
        return valorDoadoMensal;
    }

    public void setValorDoadoMensal(double valor) {
        if (valor < 0) {
            System.out.println("Valor doado mensal não pode ser negativo.");
        } else {
            this.valorDoadoMensal = valor;
        }
    }

    @Override
    public void exibirResumo() {
        System.out.println("Doador Ativo: " + getNome() + " | Valor mensal: R$ " + valorDoadoMensal + " | Dias de atuação: " + getDiasAtuacao());
    }
}