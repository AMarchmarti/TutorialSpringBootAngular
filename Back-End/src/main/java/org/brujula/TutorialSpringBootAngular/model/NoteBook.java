package org.brujula.TutorialSpringBootAngular.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class NoteBook {

    @Id
    private UUID id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "notebook", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Note> notes;

    protected NoteBook(){
        this.id = UUID.randomUUID();
        this.notes = new ArrayList<>();
    }

    public NoteBook(String name){
        this();
        this.name = name;
    }

    public NoteBook(String id, String name){
        this();
        if(id != null){
            this.id = UUID.fromString(id);
        }
    }

}
