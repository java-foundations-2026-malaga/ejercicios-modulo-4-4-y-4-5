package modulo4_4_4_5_actividad09;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class Actividad09Test {

    @Test
    void salidaEsperada() throws Exception {
        String salida = ejecutar();
        assertTrue(Pattern.matches("(?is).*\\b(piedra|papel|tijera)\\b.*", salida), "Debe imprimirse piedra, papel o tijera. Salida obtenida: " + salida);
    }

    @Test
    void compruebaCodigo() throws Exception {
        String codigo = leerCodigo();
        assertTrue(contiene(codigo, "nextInt\\s*\\(\\s*3\\s*\\)"), "Debe usarse nextInt(3)");
        assertTrue(contiene(codigo, "(?i)\"[^\"]*piedra"), "Debe usarse piedra");
        assertTrue(contiene(codigo, "(?i)\"[^\"]*papel"), "Debe usarse papel");
        assertTrue(contiene(codigo, "(?i)\"[^\"]*tijera"), "Debe usarse tijera");
    }

    private static String ejecutar() throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        Locale originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
        try {
            Actividad09.main(new String[0]);
        } finally {
            System.setOut(originalOut);
            Locale.setDefault(originalLocale);
        }
        String texto = buffer.toString(StandardCharsets.UTF_8).replace("\r\n", "\n").replace('\r', '\n');
        StringBuilder salida = new StringBuilder();
        for (String linea : texto.split("\n")) {
            salida.append(linea.strip()).append("\n");
        }
        return salida.toString().strip();
    }

    private static String leerCodigo() throws Exception {
        String codigo = Files.readString(Path.of("src/main/java/modulo4_4_4_5_actividad09/Actividad09.java"));
        return codigo.replaceAll("(?s)/\\*.*?\\*/", "").replaceAll("//[^\n]*", "");
    }

    private static boolean contiene(String codigo, String regex) {
        return Pattern.compile(regex).matcher(codigo).find();
    }
}
