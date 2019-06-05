package org.brujula.TutorialSpringBootAngular.DataBase.repository;

import org.brujula.TutorialSpringBootAngular.model.Note;
import org.brujula.TutorialSpringBootAngular.model.NoteBook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface NoteRepository extends JpaRepository<Note, UUID> {

    List<Note> findAllByNoteBook(NoteBook noteBook);
}
