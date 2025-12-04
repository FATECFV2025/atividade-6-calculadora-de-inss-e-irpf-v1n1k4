public class PassaFome extends Pobre{

    public PassaFome(String nome, double slarioBruto, String cpf) {
        super(nome, slarioBruto, cpf);
        
    }

    @Override
    public double calcularINSS() {
        
        return 0;
    }

    @Override
    public double calcularIRPF() {
        
        return 0;
    }

    @Override
    public double calcularSalarioLiquido() {
        
        return getSlarioBruto();
    }
    
}
