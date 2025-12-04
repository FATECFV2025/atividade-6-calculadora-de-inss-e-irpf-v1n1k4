public class Mendigo extends Pobre {

    public Mendigo(String nome, double slarioBruto, String cpf) {
        super(nome, slarioBruto, cpf);
    }

    @Override
    public double calcularINSS() {
        return getSlarioBruto() *0.11;
    }

    @Override
    public double calcularIRPF() {
        return getSlarioBruto()  *0.10;
    }

    @Override
    public double calcularSalarioLiquido() {
        return getSlarioBruto() - calcularINSS() - calcularIRPF();
    }


}
