package mim.local.mim.modules.users.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import mim.local.mim.modules.users.services.interfaces.UserServicesInterfaces;
@RestController
@RequestMapping("v1/auth")


public class AuthController {
    private final UserServicesInterfaces userService;
    public AuthController(UserServicesInterfaces userService) {
        this.userService = userService;
    }
    
    
    }

