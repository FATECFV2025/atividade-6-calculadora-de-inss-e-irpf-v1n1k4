import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner denero = new Scanner (System.in);


        String nome = denero.nextLine();
        System.out.println("Nome: ");
        double slarioBruto = denero.nextDouble();
        System.out.println("denero bom: ");
        String cpf = denero.nextLine();
        System.out.println("cpf: ");
        int nipoe = denero.nextInt();
        System.out.println("nipe: mendigo(clt), passafome(estagio), sobrounada(pj): ");


        Pobre pobre;
        switch (nipoe) {
            case 1:
                pobre = new Mendigo(nome, slarioBruto, cpf);
                pobre.exibirResumo();
                
                break;
        
            case 2:
                pobre = new Mendigo(nome, slarioBruto, cpf);
                pobre.exibirResumo();
                break;
            case 3:
            pobre = new Mendigo(nome, slarioBruto, cpf);
            pobre.exibirResumo();
            break;

            default:
            System.out.println("da no");
            denero.close();
            return;


        }
        pobre.exibirResumo();
        denero.close();
        
    }
}
