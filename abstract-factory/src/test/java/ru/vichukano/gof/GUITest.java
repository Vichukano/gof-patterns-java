package ru.vichukano.gof;

import com.github.stefanbirkner.systemlambda.SystemLambda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GUITest {

    @Test
    void shouldCreateDifferentGUIElementsForDifferentOS() throws Exception {
        var macGUI = new GUI("mac");
        var windowsGUI = new GUI("windows");
        var linuxGUI = new GUI("linux");

        var macOsOut = SystemLambda.tapSystemOut(macGUI::use);
        var windowsOut = SystemLambda.tapSystemOut(windowsGUI::use);
        var linuxOut = SystemLambda.tapSystemOut(linuxGUI::use);

        assertTrue(macOsOut.contains("Mac Os"));
        assertTrue(windowsOut.contains("Windows"));
        assertTrue(linuxOut.contains("Linux"));
    }

}