package modulo4_4_4_5_actividad07;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class Actividad07Test {

    @Test
    void salidaEsperada() throws Exception {
        String salida = ejecutar();
        assertTrue(Pattern.matches("Dado: [1-6]", salida), "Debe imprimirse Dado: X con X entre 1 y 6. Salida obtenida: " + salida);
    }

    @Test
    void compruebaCodigo() throws Exception {
        String codigo = leerCodigo();
        assertTrue(contiene(codigo, "nextInt\\s*\\(\\s*6\\s*\\)\\s*\\+\\s*1\\b|\\b1\\s*\\+\\s*\\w+\\s*\\.\\s*nextInt\\s*\\(\\s*6\\s*\\)|nextInt\\s*\\(\\s*1\\s*,\\s*7\\s*\\)"), "Debe usarse nextInt(6) + 1");
    }

    private static String ejecutar() throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        Locale originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
        try {
            Actividad07.main(new String[0]);
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
        String codigo = Files.readString(Path.of("src/main/java/modulo4_4_4_5_actividad07/Actividad07.java"));
        return codigo.replaceAll("(?s)/\\*.*?\\*/", "").replaceAll("//[^\n]*", "");
    }

    private static boolean contiene(String codigo, String regex) {
        return Pattern.compile(regex).matcher(codigo).find();
    }
}
