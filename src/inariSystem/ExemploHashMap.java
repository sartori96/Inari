import java.util.HashMap;
import java.util.Map;
  
  
public class ExemploHashMap {
  
       public static void main (String args[]){
              
             Map<String,String> example = new HashMap<String,String>();
              
              
              /*
              * Vamos adicionar alguns valores a nossa lista
              * Vamos ver outros métodos do HashMap, como é o caso do “containsKey”. 
              * Este método irá procurar por uma chave dentro da tabela, ou seja, 
              * o valor da chave que você especificar neste método deve ser do mesmo tipo especificado em HashMap T<K,V>
              * */
             example.put( "K1", new String( "V1" ));
             example.put( "K2", new String( "V2" ));
             example.put( "K3", new String( "V3" ));
             example.put( "K4", new String( "V4" ));
             example.put( "K5", new String( "V5" ));
              
             String keyToSearch = "K1";        
              
              
             if ( example.containsKey( keyToSearch ) ) {
              System.out.println("Valor da Chave "+keyToSearch+
               " = "+example.get(keyToSearch));             
             }else{
                    System.err.println("Chave não existe");
             }
              
       }
        
        
}
