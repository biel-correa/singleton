package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthTest {

    @Test
    public void shouldReturnTrueWhenAdmin() {
        Role role = new Role("admin", new String[]{"read", "write"});
        Auth.getInstance().setRole(role);
        assertTrue(Auth.getInstance().isAdmin());
    }

    @Test
    public void shouldReturnFalseWhenNotAdmin() {
        Role role = new Role("common", new String[]{"read"});
        Auth.getInstance().setRole(role);
        assertFalse(Auth.getInstance().isAdmin());
    }

    @Test
    public void shouldReturnTrueWhenHasToken() {
        Auth.getInstance().setToken("token");
        assertTrue(Auth.getInstance().isLoggedIn());
    }

    @Test
    public void shouldReturnFalseWhenTokenIsNull() {
        Auth.getInstance().setToken(null);
        assertFalse(Auth.getInstance().isLoggedIn());
    }

    @Test
    public void shouldReturnFalseWhenTokenIsEmpty() {
        Auth.getInstance().setToken("");
        assertFalse(Auth.getInstance().isLoggedIn());
    }
}