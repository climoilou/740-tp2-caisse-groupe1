package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaisseTest {

    @Test
    void estVideVrai() {
        Caisse caisse = new Caisse();
        assertTrue(caisse.estVide());
    }

    @Test
    void estVideFaux() {
        Caisse caisse = new Caisse();
        caisse.ajouterUnBilletDeCinqDollars();
        assertFalse(caisse.estVide());
    }
}