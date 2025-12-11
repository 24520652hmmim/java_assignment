package mim.local.mim.modules.users.dtos;

public class UserDTOS {
    private final Long id;
    private final String email;

    public UserDTOS(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
