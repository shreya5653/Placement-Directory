package Placements.PlacementDirectory.Service;

import Placements.PlacementDirectory.Entity.Placement;

import java.util.List;

public interface PlacementService {
    List<Placement> findAll();

    Placement findById(int id);

    Placement save(Placement placement);

    void deleteById(int id);
}
