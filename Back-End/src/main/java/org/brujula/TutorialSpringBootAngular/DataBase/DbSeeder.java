package org.brujula.TutorialSpringBootAngular.DataBase;

import lombok.var;
import org.brujula.TutorialSpringBootAngular.model.Note;
import org.brujula.TutorialSpringBootAngular.model.NoteBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "noteit.db.recreate", havingValue = "true")
public class DbSeeder implements CommandLineRunner {

    private NotebookRepository notebookRepository;

    private NoteRepository noteRepository;

    @Autowired
    public DbSeeder(NotebookRepository notebookRepository, NoteRepository noteRepository){
        this.notebookRepository = notebookRepository;
        this.noteRepository = noteRepository;
    }

    @Override
    public void run(String... args){

        //Remove all existing entities
        this.noteRepository.deleteAll();
        this.notebookRepository.deleteAll();

        //Save a default notebook
        NoteBook defaultNotebook = new NoteBook("Default");
        this.notebookRepository.save(defaultNotebook);

        NoteBook quotesNotebook = new NoteBook("Quotes");
        this.notebookRepository.save(quotesNotebook);

        //Save the welcome note
        Note note = new Note("Hello", "Welcome to Note It", defaultNotebook);
        noteRepository.save(note);

        System.out.println("Initialized database");

    }
}
