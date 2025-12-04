public class SobraNada extends Pobre {
//descobri q da pra fazer automatico nice

    public SobraNada(String nome, double slarioBruto, String cpf) {
        super(nome, slarioBruto, cpf);
        
    }

    @Override
    public double calcularINSS() {
        return 0;
    }

    @Override
    public double calcularIRPF() {
        return getSlarioBruto() *0.10;
    }

    @Override
    public double calcularSalarioLiquido() {
        return getSlarioBruto() - calcularIRPF();
    }
    
}
