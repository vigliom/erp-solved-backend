package com.vigliom.erpsolvedbackend.model;

public enum Role {
    ROLE_USER("User"),
    ROLE_ADMIN("Admin"),
    ROLE_SUPERVISOR("Supervisor");

    private final String roleName;

    private Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public static Role fromRoleName(String roleName) {
        for (Role role : Role.values()) {
            if (role.getRoleName().equalsIgnoreCase(roleName)) {
                return role;
            }
        }
        return null;
    }
}
