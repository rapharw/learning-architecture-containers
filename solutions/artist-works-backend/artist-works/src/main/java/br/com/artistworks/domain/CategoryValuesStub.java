package br.com.artistworks.domain;

public enum CategoryValuesStub {
    MUSIC("SONG"),
    WRITER("BOOK"),
    PAINTER("PAINTING");

    private final String value;

    CategoryValuesStub(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
