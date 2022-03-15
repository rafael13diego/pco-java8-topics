package Java8.Optional.repositorio;

import Java8.Optional.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
