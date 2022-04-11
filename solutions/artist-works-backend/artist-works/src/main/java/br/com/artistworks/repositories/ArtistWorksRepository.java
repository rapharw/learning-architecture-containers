package br.com.artistworks.repositories;

import br.com.artistworks.domain.ArtistWorks;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ArtistWorksRepository extends MongoRepository<ArtistWorks, Integer> {

    Optional<ArtistWorks> findArtistWorksById(Integer id);
}
