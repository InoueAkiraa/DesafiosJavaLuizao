import java.io.BufferedReader; //Usada para leitura eficiente de arquivos de texto.
import java.io.FileReader; //Usada para abrir um arquivo de texto para leitura.
import java.io.IOException; //Trata possíveis erros de E/S (entrada/saída)
import java.util.ArrayList; //Usada para criar uma lista dinâmica que pode crescer ou diminuir 
//conforme necessário. 
import java.util.List; //Usada como um tipo genérico para declarar a lista de TokenInfo no código.
import java.util.regex.Matcher; //São classes que permitem a manipulação de expressões regulares em Java.
import java.util.regex.Pattern; 


public class MetodosUsados {
  
  public static String lerArquivo(String caminhoArquivo){
      StringBuilder code = new StringBuilder(); //usa BufferedReader para ler o arquivo linha por linha
      try ( BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))){//fecha automaticamente
          String line;
          while((line = reader.readLine()) != null){
              code.append(line).append('\n');
          }
      } catch (IOException e){  
          e.printStackTrace();  
      }
      return code.toString();
  }

  public static List<TokenInfo> analisarCodigoPascal(String code){
    List<TokenInfo> tokens = new ArrayList<>();
    
    //usa expressões regulares p/ encontrar 
    //padrões de tokens e armazenar na lista de objetos
    Pattern pattern = Pattern.compile("'[^']*'|[.,;()]|\\b(program|PROGRAM|Hello|HELLO|begin|BEGIN|end|END|write|WRITE|writeln|WRITELN)");
    Matcher matcher = pattern.matcher(code);

    while (matcher.find()){
        String lexema = matcher.group();
        String token = pegarTokenParaLexema(lexema);
        tokens.add(new TokenInfo(token, lexema));
    }
    return tokens;
  }

  public static String pegarTokenParaLexema(String lexeme){
    switch(lexeme){
        case "program":
            return "KEYWORD";
        case "PROGRAM":
            return "KEYWORD";
        case "Hello":
            return "IDENTIFICADOR";
        case "HELLO":
            return "IDENTIFICADOR";
        case "begin":
            return "KEYWORD";
        case "BEGIN":
            return "KEYWORD";
        case "end":
            return "KEYWORD";
        case "END":
            return "KEYWORD";
        case "write" :
            return "KEYWORD";
        case "writeln" :
            return "KEYWORD";
        case "WRITELN" :
            return "KEYWORD";
        case "," :
            return "COMMA";
        case ";" :
            return "DELIMITADOR DE LINHA";
        case "(" :
            return "DELIMITADOR";
        case ")" :
            return "DELIMITADOR";
        case "." :
            return "DELIMITADOR DE PROGRAMA";
        default:
            if(lexeme.matches("^'.*'$")){
                return "STRING LITERAL";
            }
            return "OTHER";
    }
  }
}
