package razrpop.DSL.flexer;

public class Token {
    private String type;
    private String value;
//    private int posL; // index
//    private int posR;

    public Token(String type, String value) {
        this.type = type;
        this.value = value;
    }

    // *
//    public Token(String type, String value, int posL, int posR) {
//        this.type = type;
//        this.value = value;
//        this.posL = posL;
//        this.posR = posR;
//    }
//    public int getPosL() {
//        return posL;
//    }
//    public void setPosL(int posL) {
//        this.posL = posL;
//    }
//    public int getPosR() {
//        return posR;
//    }
//    public void setPosR(int posR) {
//        this.posR = posR;
//    }
//    @Override
//    public String toString() {
//        return "Token{" +
//                "type='" + type + '\'' +
//                ", value='" + value + '\'' +
//                ", posL=" + posL +
//                ", posR=" + posR +
//                '}';
//    }
    // *

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Token{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
