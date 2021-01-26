package com.example.demo.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupervisorTest {

    private static Supervisor supervisor;

    @BeforeEach
    void setUp() {
        supervisor = new Supervisor(1L, "Noah", "Fenster", "nf@kea.dk");
    }

    @Test
    public void testSupervisorDetails() {
        assertEquals("Noah", supervisor.getFirstName());
        assertEquals("KL", supervisor.getLastName());
        assertEquals("nf@kea.dk", supervisor.getEmail());

        System.out.println("\033[0;1m" + "Test completed");
    }

    @Test
    void supervisorDetailChange() {
        supervisor.setEmail("emailIsChanged@kea.dk");

        assertEquals("emailIsChanged@kea.dk", supervisor.getEmail());

        System.out.println("\033[0;1m" + "Test completed");
    }
}