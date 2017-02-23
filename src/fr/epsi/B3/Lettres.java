/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.B3;

/**
 *
 * @author tkint
 */
public enum Lettres {
    A(".-"),
    B("-..."),
    C("-.-."),
    D("-.."),
    E("."),
    F("..-."),
    G("--."),
    H("...."),
    I(".."),
    J(".---"),
    K("-.-"),
    L(".-.."),
    M("--"),
    N("-."),
    O("---"),
    P(".--."),
    Q("--.-"),
    R(".-."),
    S("..."),
    T("-"),
    U("..-"),
    V("...-"),
    W(".--"),
    X("-..-"),
    Y("-.--"),
    Z("--.."),
    ZERO("-----", 0),
    UN(".----", 1),
    DEUX("..---", 2),
    TROIS("...--", 3),
    QUATRE("....-", 4),
    CINQ(".....", 5),
    SIX("-....", 6),
    SEPT("--...", 7),
    HUIT("---..", 8),
    NEUF("----.", 9)
    ;

    private String morse;
    private Integer chiffre = -1;

    Lettres(String s) {
        this.morse = s;
    }
    
    Lettres(String s, Integer chiffre) {
        this.morse = s;
        this.chiffre = chiffre;
        
    }
    
    public String getMorse() {
        return this.morse;
    }
    
    public Integer getChiffre() {
        return this.chiffre;
    }
}
