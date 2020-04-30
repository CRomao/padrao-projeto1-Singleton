package singleton;

/**
 * @author Romao
 */
public class App {

    public static void main(String[] args) {
        
        Conexao conexao = Conexao.getConexao("127.0.0.1", "c:/users/projeto", 8888);
        System.out.println(conexao);
        
        System.out.println(conexao.getCaminho());
               
        Conexao conexao2 = Conexao.getConexao("127.0.0.1", "c:/users/projeto", 8888);
        System.out.println(conexao2);
        
        System.out.println(conexao.getIp());
        
        
    }
    
}
