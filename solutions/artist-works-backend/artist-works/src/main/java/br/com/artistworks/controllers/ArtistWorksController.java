package br.com.artistworks.controllers;

import br.com.artistworks.domain.Work;
import br.com.artistworks.repositories.ArtistWorksRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/artists/{id}/works")
public class ArtistWorksController {

    @GetMapping
    public List<Work> list(@PathVariable Integer id){
        return ArtistWorksRepository.findAllByIdArtist(id);
    }
}
