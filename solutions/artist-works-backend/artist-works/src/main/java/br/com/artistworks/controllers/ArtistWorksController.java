package br.com.artistworks.controllers;

import br.com.artistworks.domain.ArtistWorks;
import br.com.artistworks.domain.Work;
import br.com.artistworks.repositories.ArtistWorksRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/artists/{id}/works")
@Slf4j
public class ArtistWorksController {

    private final ArtistWorksRepository artistWorksRepository;

    @Autowired
    public ArtistWorksController(ArtistWorksRepository artistWorksRepository){
        this.artistWorksRepository = artistWorksRepository;
    }

    @GetMapping
    public List<Work> list(@PathVariable Integer id){
        log.info("GET /api/artists/{}/works", id);

        log.info("Find Artist Works by ID {}", id);

        Optional<ArtistWorks> optArtistWorksById = artistWorksRepository.findArtistWorksById(id);
        if(optArtistWorksById.isPresent()){
            List<Work> works = optArtistWorksById.get().getWorks();
            log.info("Works Size of Artist {} - {}", id, works.size());
            return works;
        }
        return Collections.emptyList();
    }
}
