public abstract class Pobre implements CalculadoraTributo {
   private String nome;
   private double slarioBruto;
   private String cpf;



public Pobre(String nome, double slarioBruto, String cpf) {
    this.nome = nome;
    this.slarioBruto = slarioBruto;
    this.cpf = cpf;
}

public String getNome() {
    return nome;
}
public double getSlarioBruto() {
    return slarioBruto;
}
public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public void setSlarioBruto(double slarioBruto) {
    this.slarioBruto = slarioBruto;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void exibirResumo() {
        System.out.println("nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("salario buto: "+slarioBruto);
        System.out.println("inss: "+calcularINSS());
        System.out.println("irpf: "+calcularIRPF());
        System.out.println("salario liquido: "+calcularSalarioLiquido());
    }


}
