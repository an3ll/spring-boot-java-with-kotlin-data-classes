package se.inera.intyg.intygsbestallning.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class Controller {

    private final Handler<User> userHandler;

    public Controller(final Handler<User> userHandler) {
        this.userHandler = userHandler;
    }

    @GetMapping
    public ResponseEntity users() {
        return ResponseEntity.ok(userHandler.get());
    }
}
