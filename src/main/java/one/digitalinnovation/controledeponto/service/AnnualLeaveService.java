package one.digitalinnovation.controledeponto.service;

import one.digitalinnovation.controledeponto.model.AnnualLeave;
import one.digitalinnovation.controledeponto.repository.AnnualLeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AnnualLeaveService {
    AnnualLeaveRepository annualLeaveRepository;
    @Autowired
    public AnnualLeaveService( AnnualLeaveRepository annualLeaveRepository){
        this.annualLeaveRepository = annualLeaveRepository;
    };

    public AnnualLeave save(AnnualLeave journey){
        return annualLeaveRepository.save(journey);
    }

    public List<AnnualLeave> getAll() {
        return annualLeaveRepository.findAll();
    }
    public AnnualLeave getById(Long id) throws Exception{
        return annualLeaveRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Jornada não encontrada"));
    }

    public void deleteById(Long id) {
        annualLeaveRepository.deleteById(id);
    }
    /*public Optional<AnnualLeave> getById(Long id) {
        return journeyRepository.findById(id);
    } */
}
