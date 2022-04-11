package br.com.artistworks.controllers;

import br.com.artistworks.domain.Work;
import br.com.artistworks.init.PopulateArtistWorksCollections;
import br.com.artistworks.repositories.ArtistWorksRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/populate-artist-works")
@Slf4j
public class AdminPopulateCollectionsController {

    private final PopulateArtistWorksCollections populateArtistWorksCollections;

    @Autowired
    public AdminPopulateCollectionsController(PopulateArtistWorksCollections populateArtistWorksCollections){
        this.populateArtistWorksCollections = populateArtistWorksCollections;
    }

    @GetMapping
    public String execute(){
        log.info("GET /admin/populate-artist-works");
        populateArtistWorksCollections.run();
        return HttpStatus.OK.name();
    }
}
