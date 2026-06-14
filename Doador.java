public class Doador extends MembroONG{
    private double valorDoadoMensal;
    public Doador(String nome, String cpf, int diasAtuacao, double valorDoadoMensal) {
        super(nome, cpf, diasAtuacao);
        this.valorDoadoMensal = valorDoadoMensal;
    }

    public double getValorDoadoMensal() {
        return valorDoadoMensal;
    }

    public double setValorDoadoMensal() {
        if (valorDoadoMensal < 0) {
            System.out.println("Valor doado mensal não pode ser negativo.");
            return this.valorDoadoMensal; 
        }
        return this.valorDoadoMensal = valorDoadoMensal;
    }


    @Override
    public String exibirResumo() {
        return super.exibirResumo() + ", Valor Doado Mensal: R$ " + valorDoadoMensal;
    }
}