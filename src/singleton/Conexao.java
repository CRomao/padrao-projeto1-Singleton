//O exemplo escolhido para o Singleton foi a
//do banco de dados, onde ele precisa somente de uma
//instância dessa classe.

package singleton;

/**
 * @author Romao
 */

public class Conexao {

    //variável estática para que possa controlar
    //a única instância que será feita dessa classe.
    private static Conexao con;
    private String ip, caminho;
    private int porta;
    
    //Construtor privado para que nenhuma classe possa instanciar
    //essa classe.
    private Conexao(String ip, String caminho, int porta){
        this.ip = ip;
        this.caminho = caminho;
        this.porta = porta;
    }
    
    //Método estático para que pertença a classe e que possa efetuar
    //o controle da única instância.
    public static Conexao getConexao(String ip, String caminho, int porta){
        if(con == null){
            con = new Conexao(ip, caminho, porta);
        }
        return con;
    }

    public String getIp() {
        return ip;
    }

    public String getCaminho() {
        return caminho;
    }

    public int getPorta() {
        return porta;
    }
    
    
}
