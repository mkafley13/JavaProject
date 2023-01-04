package day20;

import java.util.List;

public interface CrudRepository<T> {

    T create(T data);
    List<T> read();
    T update(T data);
    void remove(T data);
}
