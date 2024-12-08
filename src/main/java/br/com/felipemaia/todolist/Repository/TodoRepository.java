package br.com.felipemaia.todolist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.felipemaia.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
