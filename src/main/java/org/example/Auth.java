package org.example;

// Diagrams on resources folder
public class Auth {
    private Auth() {};
    private static Auth instance = new Auth();
    public static Auth getInstance() {
        return instance;
    }

    private String token;
    private Role role;

    public boolean isAdmin() {
        return this.role.getName().equals("admin");
    }

    public boolean isLoggedIn() {
        return this.token != null && !this.token.isEmpty();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}