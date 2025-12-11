package mim.local.mim.modules.users.dtos;

public class LoginResponse {
    private final String token;
    private final UserDTOS user;

    public LoginResponse(String token, UserDTOS user) {
        this.token = token;
        this.user = user;
    }
    public String getToken() {
        return token;
    }   
    public void setToken(String token) {
        this.token = token;
    }
    public UserDTOS getUser() {
        return user;
    }
    public void setUser(UserDTOS user) {
        this.user = user;
    }
    
}
