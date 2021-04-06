public class Principal{
    
    public static void main(String args[]){
        
        Universidade arrayU[] = new Universidade[Teclado.leInt("Digite a quantidade de Universidades deseja cadastrar: ")];
        System.out.println();
        
        int tipo;
        
        for(int i = 0; i<arrayU.length;){
        tipo = Teclado.leInt("Qual o tipo de Universidade será?\nDigite: 1 -> Pública    2 -> Privada ");
        System.out.println();
        if(tipo == 1){
            arrayU[i++] = new Publica(Teclado.leString("Informe o nome da Universidade: "),
                Teclado.leInt("Informe a quantidade de alunos: "), Teclado.leInt("Informe a quantidade de professores: "),
                Teclado.leString("Informe o Estado: "), Teclado.leString("Informe a Cidade: "));
                System.out.println();
            }else
            arrayU[i++] = new Privada(Teclado.leString("Informe o nome da Universidade: "),
                Teclado.leInt("Informe a quantidade de alunos: "), Teclado.leInt("Informe a quantidade de professores: "),
                Teclado.leDouble("Informe o Valor da mensalidade: "));
                System.out.println();
        }       
        
       
        MEC teste = new MEC();
        
        
        teste.imprimeUniversidades(arrayU);
        
        System.out.println();
        
        
        teste.maisCara(arrayU);
        
        System.out.println();
        
        
        teste.universidadesDoSul(arrayU);
        
    }
}
