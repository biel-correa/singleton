package org.example;

// Diagrams on resources folder
public class Role {
    public Role(String name, String[] permissions) {
        this.setName(name);
        this.setPermissions(permissions);
    }

    private String name;
    private String[] permissions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }
}
