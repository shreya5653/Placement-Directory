package Placements.PlacementDirectory.Controller;

import Placements.PlacementDirectory.Entity.Placement;
import Placements.PlacementDirectory.Service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/placements")
public class PlacementController {

    private final PlacementService placementService;

    @Autowired
    public PlacementController(PlacementService placementService) {
        this.placementService = placementService;
    }

    // Show list of all placements
    @GetMapping("/list")
    public String listPlacements(Model model) {
        List<Placement> placements = placementService.findAll();
        model.addAttribute("placements", placements);
        return "list-placements"; // Redirects to list-placements.html
    }

    // Show form for adding a new placement
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Placement placement = new Placement();
        model.addAttribute("placement", placement);
        return "placement-form"; // Redirects to placement-form.html
    }

    // Save a placement
    @PostMapping("/save")
    public String savePlacement(@ModelAttribute("placement") Placement placement) {
        placementService.save(placement);
        return "redirect:/placements/list"; // Redirect back to the list page
    }
    // Update the placement
    // Endpoint for showing the form pre-filled for updating
    @GetMapping("/showFormForUpdate/{placementId}")
    public String showFormForUpdate(@PathVariable("placementId") int id, Model model) {
        Placement placement = placementService.findById(id);
        model.addAttribute("placement", placement);
        return "placement-form"; // Redirects to placement-form.html for update
    }
    // Delete a placement by ID
    @GetMapping("/delete")
    public String delete(@RequestParam("placementId") int id) {
        placementService.deleteById(id);
        return "redirect:/placements/list"; // Redirect back to the list page
    }
}
