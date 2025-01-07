package dev.omuzalevska.kata_acronym;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    
        @Test
        public void testMainOutput() {
            // Створюємо потік для захоплення виведення на консоль
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outputStream));
    
            App.main(new String[]{});
    
            String output = outputStream.toString();
            assertTrue(output.contains("PNG"));
            assertTrue(output.contains("ROR"));
            assertTrue(output.contains("FIFO"));
            assertTrue(output.contains("GIMP"));
            assertTrue(output.contains("CMOS"));
            assertTrue(output.contains("ROTFLSHTMDCOALM"));
    
            System.setOut(originalOut);
        }
    }
