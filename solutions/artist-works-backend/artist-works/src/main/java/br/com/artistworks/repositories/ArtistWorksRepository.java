package br.com.artistworks.repositories;

import br.com.artistworks.domain.ArtistWorks;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistWorksRepository extends MongoRepository<ArtistWorks, Integer> {

    ArtistWorks findArtistWorksById(Integer id);
}
