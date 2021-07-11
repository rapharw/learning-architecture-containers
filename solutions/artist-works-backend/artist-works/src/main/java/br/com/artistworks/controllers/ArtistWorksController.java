package br.com.artistworks.controllers;

import br.com.artistworks.domain.Work;
import br.com.artistworks.repositories.ArtistWorksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artists/{id}/works")
public class ArtistWorksController {

    private final ArtistWorksRepository artistWorksRepository;

    @Autowired
    public ArtistWorksController(ArtistWorksRepository artistWorksRepository){
        this.artistWorksRepository = artistWorksRepository;
    }

    @GetMapping
    public List<Work> list(@PathVariable Integer id){
        return artistWorksRepository.findArtistWorksById(id).getWorks();
    }
}
