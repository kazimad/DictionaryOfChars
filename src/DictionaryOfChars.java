import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


/**
 * Created by KaZimad on 13.03.14.
 */
public class DictionaryOfChars {
    public static void main (String []args) throws IOException {
        String ch;

        HashMap<Character, Integer> MyMap = new HashMap();
        BufferedReader bfr = new BufferedReader(new FileReader("Chars.txt"));
        while ((ch = bfr.readLine())!=null){

            for (int i =0; i <ch.length(); i++){
                char charAt = ch.charAt(i);
                if (charAt ==' '){
                    continue;
                }

                if ( MyMap.containsKey(charAt)){
                    MyMap.put(charAt,MyMap.get(charAt) +1);

                }
                else {MyMap.put(charAt,1);}
                System.out.print(charAt + "-" + MyMap.get(charAt));
                System.out.print(' ');
            }



    }
}
}

