package test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import main.java.App;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class AppTest {

    @Test
    public void testObterDados() {
        String input = "Francisco\n123456\n25\nhttps://github.com/franciscodouglas\nhttps://linkedin.com/in/franciscodouglas\nProgramacao Orientada a Objetos\nFATEC\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
 
        App app = new App();
        app.obterDados(scanner);

        assertEquals("Francisco", app.nomeCompleto);
        assertEquals("123456", app.rgm);
        assertEquals(25, app.idade);
        assertEquals("https://github.com/franciscodouglas", app.github);
        assertEquals("https://linkedin.com/in/franciscodouglas", app.linkedin);
        assertEquals("Programacao Orientada a Objetos", app.curso);
        assertEquals("FATEC", app.turma);
    }
}
