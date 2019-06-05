package org.brujula.TutorialSpringBootAngular.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
public class Note {

    @Id
    private UUID id;
    private String title;
    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    private NoteBook noteBook;

    private Date lastModifiedOn;

    protected Note(){
        this.id = UUID.randomUUID();
        this.lastModifiedOn = new Date();
    }



    public Note(String id, String title, String text, NoteBook noteBook){
        this(title, text, noteBook);
        if(id != null){
            this.id = UUID.fromString(id);
        }
    }

    public Note(String title, String text, NoteBook noteBook) {
        this();
        this.title = title;
        this.text = text;
        this.noteBook = noteBook;
    }
}
