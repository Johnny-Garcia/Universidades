
public class MEC{
    
    public void imprimeUniversidades(Universidade arrayU[]){
        System.out.println("As universidades cadastradas são:\n");
        for(int i = 0; i<arrayU.length; i++)
            if(arrayU[i] instanceof Publica){
                System.out.println("Universidade Pública");
                arrayU[i].imprimeInfo();
                System.out.println();
            }
            else{
                System.out.println("Universidade Privada");
                arrayU[i].imprimeInfo();
                System.out.println();
            }
    }
    
    
    public void maisCara(Universidade arrayU[]){
        
        Universidade maisCara = null;
        double valorMaior = 0;
        
        for(int i = 0; i<arrayU.length; i++){
            if(arrayU[i] instanceof Privada){
                if(((Privada)arrayU[i]).getValorMensalidade() > valorMaior){
                    valorMaior = ((Privada)arrayU[i]).getValorMensalidade();
                    maisCara = arrayU[i];
                }
            }
        }  
        
            if(maisCara == null)
                System.out.println("Não há universidades Privadas");
            else{
                System.out.println("A universidade mais cara é: ");
                maisCara.imprimeInfo();
            }
    }
    
    
    public void universidadesDoSul(Universidade arrayU[]){
        System.out.println("As universidades públicas da Região Sul do brasil são:");
        for(int i = 0; i<arrayU.length; i++){
            if(arrayU[i] instanceof Publica){
                if(((Publica)arrayU[i]).getEstado().equalsIgnoreCase("RS")){
                    arrayU[i].imprimeInfo();
                    System.out.println();
                }else if(((Publica)arrayU[i]).getEstado().equalsIgnoreCase("SC")){
                    arrayU[i].imprimeInfo();
                    System.out.println();
                }else if(((Publica)arrayU[i]).getEstado().equalsIgnoreCase("PR")){
                    arrayU[i].imprimeInfo();
                    System.out.println();
                }
            }else
                System.out.println("Infelizmente não encontramos Universidades da região Sul");
        }
            
}
}



 
 

                    
    


    


