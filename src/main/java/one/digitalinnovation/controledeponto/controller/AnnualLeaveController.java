package one.digitalinnovation.controledeponto.controller;

import one.digitalinnovation.controledeponto.model.AnnualLeave;
import one.digitalinnovation.controledeponto.service.AnnualLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/annualLeave")
public class AnnualLeaveController {

    @Autowired
    AnnualLeaveService annualLeaveService;

    @PostMapping
    public AnnualLeave createJourney(@RequestBody AnnualLeave annualLeave){
        return annualLeaveService.save(annualLeave);
    }
    @GetMapping
    public List<AnnualLeave> getAll(){
        return annualLeaveService.getAll();
    }
    @GetMapping("/{id}")
    //public Optional<AnnualLeave> getByID(@PathVariable("id") Long id ) {
    public AnnualLeave getByID(@PathVariable("id") Long id ) throws Exception {
        return annualLeaveService.getById(id);
        //return ResponseEntity.ok(annualLeaveService.getById(id).orElseThrow(() -> new NoSuchElementException("Jornada não encontrada")));
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id ) throws Exception {
        annualLeaveService.deleteById(id);
    }
}
