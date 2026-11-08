package modulo4_4_4_5_actividad08;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class Actividad08Test {

    @Test
    void salidaEsperada() throws Exception {
        String salida = ejecutar();
        assertTrue(Pattern.matches("Edad: (1[89]|[2-5]\\d|6[0-5])", salida), "Debe imprimirse Edad: X con X entre 18 y 65. Salida obtenida: " + salida);
    }

    @Test
    void compruebaCodigo() throws Exception {
        String codigo = leerCodigo();
        assertTrue(contiene(codigo, "nextInt\\s*\\(\\s*48\\s*\\)\\s*\\+\\s*18\\b|\\b18\\s*\\+\\s*\\w+\\s*\\.\\s*nextInt\\s*\\(\\s*48\\s*\\)|nextInt\\s*\\(\\s*18\\s*,\\s*66\\s*\\)"), "Debe usarse nextInt(48) + 18");
    }

    private static String ejecutar() throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        Locale originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
        try {
            Actividad08.main(new String[0]);
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
        String codigo = Files.readString(Path.of("src/main/java/modulo4_4_4_5_actividad08/Actividad08.java"));
        return codigo.replaceAll("(?s)/\\*.*?\\*/", "").replaceAll("//[^\n]*", "");
    }

    private static boolean contiene(String codigo, String regex) {
        return Pattern.compile(regex).matcher(codigo).find();
    }
}
