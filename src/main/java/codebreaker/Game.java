package codebreaker;

import java.util.Arrays;

public class Game {
    private char[] secret;

    public Game(String code) {
        this.secret = code.toCharArray();
    }

    public String guess(String guessString) {
        String mark = "";
        char[] guess = guessString.toCharArray();
        for(int guessPos = 0; guessPos < 4; guessPos++) {
            if(secret[guessPos] == guess[guessPos]) {
                mark += 'b';
                secret[guessPos] = '_';
            }
        }
        for(int guessPos = 0; guessPos < 4; guessPos++) {
            for(int secretPos = 0; secretPos < 4; secretPos++) {
                if(secret[secretPos] == guess[guessPos]) {
                    mark += 'w';
                    secret[secretPos] = '_';
                    break;
                }
            }
        }
        
        char[] chars = mark.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
