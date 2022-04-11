package br.com.artistworks.init;

import br.com.artistworks.domain.ArtistWorks;
import br.com.artistworks.domain.Category;
import br.com.artistworks.domain.CategoryValuesStub;
import br.com.artistworks.domain.Work;
import br.com.artistworks.repositories.ArtistWorksRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
@Slf4j
public class PopulateArtistWorksCollections {

    private static final HashMap<Integer, ArtistWorks> hm;
    private final ArtistWorksRepository artistWorksRepository;

    @Autowired
    public PopulateArtistWorksCollections(ArtistWorksRepository artistWorksRepository){
        this.artistWorksRepository = artistWorksRepository;
    }

    static {
        hm = new HashMap<>();

        // ------ Artist 1 ---------------
        Integer idArtist_1 = 1; // Amy Winehouse
        List<Work> works_idArtist_1 = new ArrayList<>();

        Work back_to_black = Work.builder()
                            .id(1)
                            .title("Back to black")
                            .category(new Category(CategoryValuesStub.MUSIC))
                            .build();

        Work rehab = Work.builder()
                            .id(2)
                            .title("Rehab")
                            .category(new Category(CategoryValuesStub.MUSIC))
                            .build();

        works_idArtist_1.add(back_to_black);
        works_idArtist_1.add(rehab);

        hm.put(idArtist_1, ArtistWorks.builder().id(idArtist_1).works(works_idArtist_1).build());

        // ------ Artist 2 ---------------
        Integer idArtist_2 = 2; // Kurt Cobain
        List<Work> works_idArtist_2 = new ArrayList<>();

        Work smells_like_teen_spirit = Work.builder()
                                        .id(3)
                                        .title("Smells like teen spirit")
                                        .category(new Category(CategoryValuesStub.MUSIC))
                                        .build();

        works_idArtist_2.add(smells_like_teen_spirit);

        hm.put(idArtist_2, ArtistWorks.builder().id(idArtist_2).works(works_idArtist_2).build());

        // ------ Artist 4 ---------------
        Integer idArtist_4 = 4; // Tolkien
        List<Work> works_idArtist_4 = new ArrayList<>();

        Work lord_of_the_ring = Work.builder()
                                .id(4)
                                .title("Lord of the ring")
                                .category(new Category(CategoryValuesStub.WRITER))
                                .build();

        works_idArtist_4.add(lord_of_the_ring);

        hm.put(idArtist_4, ArtistWorks.builder().id(idArtist_4).works(works_idArtist_4).build());

        log.info("Static Populating: {}", hm.size());
    }


    public void run() {
        log.info("----- Clear database -----");
        artistWorksRepository.deleteAll();

        log.info("----- Start Populating artistWorks -----");
        hm.forEach((id, artistWorks) -> {
            artistWorksRepository.save(artistWorks);
            log.info("Saved artistWorks {}", id);
        });

        log.info("----- End Populating artistWorks -----");
    }

}
