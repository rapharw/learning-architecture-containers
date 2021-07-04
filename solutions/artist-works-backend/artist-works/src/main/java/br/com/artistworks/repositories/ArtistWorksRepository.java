package br.com.artistworks.repositories;

import br.com.artistworks.domain.Category;
import br.com.artistworks.domain.CategoryValuesStub;
import br.com.artistworks.domain.Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ArtistWorksRepository {

    private static final HashMap<Integer, List<Work>> hm;

    static {
        hm = new HashMap<>();

        // ------ Artist 1 ---------------
        Integer idArtist_1 = 1; // Amy Winehouse
        List<Work> works_idArtist_1 = new ArrayList<>();

        Work back_to_black = Work.builder()
                            .id(1)
                            .idArtist(idArtist_1)
                            .title("Back to black")
                            .category(new Category(CategoryValuesStub.MUSIC))
                            .build();

        Work rehab = Work.builder()
                            .id(2)
                            .idArtist(idArtist_1)
                            .title("Rehab")
                            .category(new Category(CategoryValuesStub.MUSIC))
                            .build();

        works_idArtist_1.add(back_to_black);
        works_idArtist_1.add(rehab);

        hm.put(idArtist_1, works_idArtist_1);

        // ------ Artist 2 ---------------
        Integer idArtist_2 = 2; // Kurt Cobain
        List<Work> works_idArtist_2 = new ArrayList<>();

        Work smells_like_teen_spirit = Work.builder()
                                        .id(3)
                                        .idArtist(idArtist_2)
                                        .title("Smells like teen spirit")
                                        .category(new Category(CategoryValuesStub.MUSIC))
                                        .build();

        works_idArtist_2.add(smells_like_teen_spirit);

        hm.put(idArtist_2, works_idArtist_2);

        // ------ Artist 4 ---------------
        Integer idArtist_4 = 4; // Tolkien
        List<Work> works_idArtist_4 = new ArrayList<>();

        Work lord_of_the_ring = Work.builder()
                                .id(4)
                                .idArtist(idArtist_4)
                                .title("Lord of the ring")
                                .category(new Category(CategoryValuesStub.WRITER))
                                .build();

        works_idArtist_4.add(lord_of_the_ring);

        hm.put(idArtist_4, works_idArtist_4);
    }

    public static List<Work> findAllByIdArtist(Integer idArtist){
        List<Work> works = hm.get(idArtist);
        if(works == null)
            return Collections.emptyList();
        return works;
    }
}
