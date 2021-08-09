package Abstract;

import Entities.Gamer;

import java.util.List;

public interface BaseGamerService {
    void save(Gamer gamer);
    void update(Gamer gamer);
    void delete(Gamer gamer);
    Gamer login();
}
