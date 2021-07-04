package br.com.artistworks.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Work {

    private final Integer id;
    private final String title;
    private final Integer idArtist;
    private final Category category;
}

