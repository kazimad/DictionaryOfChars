import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

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
                if (ch.charAt(i)==' '){
                    continue;
                }

                if ( MyMap.containsKey(ch.charAt(i))){
                    MyMap.put((ch.charAt(i)),MyMap.get((ch.charAt(i))) +1);

                }
                else {MyMap.put((ch.charAt(i)),1);}

            }
            System.out.println("Буквы"+MyMap.keySet()+"Встречаються"+MyMap.values()+"раз");

        }
    }
}

