package se.inera.intyg.intygsbestallning.user;

import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<UserEntity, Long> {

}
