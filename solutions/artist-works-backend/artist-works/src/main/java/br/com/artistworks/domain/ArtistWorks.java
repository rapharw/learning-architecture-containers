package br.com.artistworks.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArtistWorks {

    @Id
    private Integer id;
    private List<Work> works = new ArrayList<>();
}
