import java.util.List; //Usada como um tipo genérico para declarar a lista de TokenInfo no código.

public class Compilador {
    public void ExecutarCompilador(){
        
        String caminhoArquivo = "C:\\Users\\akira\\Documents\\GitHub\\DesafiosJavaLuizao\\teste.pas";
        String code = MetodosUsados.lerArquivo(caminhoArquivo); //recebe caminho do arquivo e retorna o 
        //conteúdo como string

        List<TokenInfo> listaTokensELexemas = MetodosUsados.analisarCodigoPascal(code);

        for (TokenInfo token : listaTokensELexemas){
            System.out.println("Token: " + token.getToken() + ", Lexema: " + token.getLexema());
        }
    }
}
