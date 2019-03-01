package se.inera.intyg.intygsbestallning.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/users")
public class Controller {

    private final UserRepository userRepository;

    public Controller(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity users() {

        var defaultUser = new User();

        var defaultAddress = new Address();
        var customUser = new User(2L, "CustomTolvan", "Twelvansson", defaultAddress);

        var userWithBuildPattern = new UserWithBuilderPattern.Builder()
                .id(3L)
                .firstName("firstName")
                .lastName("lastname")
                .address(defaultAddress)
                .build();


        var userEntity = new UserEntity(
                defaultUser.getId(),
                defaultUser.getFirstName(),
                defaultUser.getLastName(),
                13);

        final UserEntity savedUser = userRepository.save(userEntity);

        var backToDto = new User(savedUser);


        return ResponseEntity.ok(List.of(backToDto));
    }
}
