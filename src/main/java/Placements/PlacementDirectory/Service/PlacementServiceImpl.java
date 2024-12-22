package Placements.PlacementDirectory.Service;

import Placements.PlacementDirectory.Dao.PlacementRepository;
import Placements.PlacementDirectory.Entity.Placement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementServiceImpl implements PlacementService {

    private final PlacementRepository placementRepository;

    @Autowired
    public PlacementServiceImpl(PlacementRepository placementRepository) {
        this.placementRepository = placementRepository;
    }

    @Override
    public List<Placement> findAll() {
        return placementRepository.findAllByOrderByCompanyNameAsc();
    }

    @Override
    public Placement findById(int id) {
        return placementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Did not find placement id - " + id));
    }

    @Override
    public Placement save(Placement placement) {
        return placementRepository.save(placement);
    }

    @Override
    public void deleteById(int id) {
        placementRepository.deleteById(id);
    }
}

