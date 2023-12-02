public class TokenInfo {
  
  private String token;
  private String lexema;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getLexema() {
    return lexema;
  }

  public void setLexema(String lexema) {
    this.lexema = lexema;
  }

  public TokenInfo(String Token, String Lexema){
      token = Token;
      lexema = Lexema;
  }
}
