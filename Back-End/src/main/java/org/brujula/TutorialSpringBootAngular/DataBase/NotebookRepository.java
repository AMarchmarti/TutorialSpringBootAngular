package org.brujula.TutorialSpringBootAngular.DataBase;

import org.brujula.TutorialSpringBootAngular.model.NoteBook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NotebookRepository extends JpaRepository<NoteBook, UUID> {
}
