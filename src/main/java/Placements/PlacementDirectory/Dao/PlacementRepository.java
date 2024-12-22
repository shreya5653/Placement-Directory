package Placements.PlacementDirectory.Dao;

import Placements.PlacementDirectory.Entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Integer> {

    List<Placement> findAllByOrderByCompanyNameAsc();
}
