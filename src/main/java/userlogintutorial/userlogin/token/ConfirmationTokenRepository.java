package userlogintutorial.userlogin.token;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface ConfirmationTokenRepository extends MongoRepository<ConfirmationToken,String> {
    Optional<ConfirmationToken> findByToken(String token);
}
