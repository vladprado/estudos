import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {

    public static void main(String[] args) {
        String texto = "meu email é vladtest@gmail.com";
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");
        Matcher matcher = pattern.matcher(texto);

        if(matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println(formatarTelefone("61985394227"));
        System.out.println(formatarTelefone("6135223141"));
        System.out.println(formatarTelefone("985394227"));
    }

    public static String formatarTelefone(String telefone) {
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if(matcher.matches()) {
            return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }

        return "Número de telefone inválido.";
    }
}
