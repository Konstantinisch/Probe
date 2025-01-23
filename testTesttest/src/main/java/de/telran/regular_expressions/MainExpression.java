package de.telran.regular_expressions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainExpression {
    public static void main(String[] args) {
        // 1 уровень сложности: 1. Написать регулярное выражение для проверки email (например my_25@domen-38.de).
        //2.* Написать регулярное выражение для проверки корректности нового пароля,
        //который соответствует определенным критериям:
        //
        //
        //состоять минимум из 8 символов;
        //
        //должен обязательно включать хотя бы одну маленькую букву;
        //
        //должен обязательно включать хотя бы одну большую букву;
        //
        //должен обязательно включать хотя бы одну цифру;
        //
        //должен обязательно включать хотя бы один спецсимвол (пример: !@#$%^&_+-=);
        //3. Разбить текст на слова с помощью шаблона регулярного выражения и расчитать
        //словарь встречающихся слов для этого текста
        //(подсчитать количество одинаковых слов, встречающихся в этом тексте).


        //Регулярное выражение а*:
        //Соответствует строкам:
        //"" (пустая строка, так как a встречается 0 раз)
        //"a" (один раз)
        //"aa" (два раза)
        //"aaa" (три раза)
        //и так далее.
        //[18:29]
        //Регулярное выражение ba*:
        //Соответствует строкам:
        //"b" (поскольку a встречается 0 раз)
        //"ba" (один раз)
        //"baa" (два раза)
        //и так далее.
        //Если у нас есть регулярное выражение., оно будет соответствовать любой строке, включая пустую, так как .
        // означает "любой символ", а говорит о том, что этот символ может повторяться ноль или более раз.
        //Например, строка "Hello, World!" будет соответствовать.*.
        //
        //Nachricht an @qppqpqpqpqpqpqpqpqppqpqpqpqpqpqp

        //String regEx = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&+=-]).{8,}$";
        String regEx =    "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&+=-]).{8,}$";
        //String regEx ="^(?=.+[a-z])(?=.+[A-Z])(?=.*\\d)(?=.+[@])"; // + false
        // String regEx = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@])[A-Za-z\\d@.-]+$";

        String str = "my_25@domeBn-38.de";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);
        System.out.println(" is available here? -> " + matcher.matches());

        System.out.println(Pattern.matches(regEx, str));

        String regEx2 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@])";

        String text = "Du hast mir gestern richtig gut geholfen und ich weiss es zu schaetzen.";
        String[] words = text.split("[\\W+]");
        Map<String, Integer> worldCount = new LinkedHashMap<>();
        for(String word :words){
            if (!word.isEmpty()){
                worldCount.put(word, worldCount.getOrDefault(word,0)+1);
                System.out.println(word);
            }

        }
        for(Map.Entry<String, Integer> entry : worldCount.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
        String regEx3 = "E.+e";
        String mail = "www.web.de";
        Pattern pattern3 = Pattern.compile(regEx3);
        Matcher matcher3 = pattern3.matcher(mail);
        while (matcher3.find())
            System.out.println(mail.substring(matcher3.start(),matcher3.end()));

        String text1 = "I1learned2about3Telran4College5and6now7I'm8studying9Java";
        String delimiter = "\\d";

        Arrays.stream(text1.split(delimiter))
                .forEach(s -> System.out.print(s+" "));
        System.out.println();




    }

    // String emailRegex = "^[\w.-]+@[\w.-]+\.[a-zA-Z]{2,6}$";
    //(?=.[a-z]) — хотя бы одна маленькая буква
    //(?=...) — это специальная конструкция, называемая "позитивная проверка".
    // Она означает, что в строке должно быть то, что указано внутри скобок
    //. — это означает "любое количество любых символов" (включая ноль символов).
    //[a-z] — это означает "любая маленькая буква от a до z"
    //Таким образом, эта часть проверяет, есть ли хотя бы одна маленькая буква где-то в пароле


}
