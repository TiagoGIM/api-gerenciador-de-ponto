package one.digitalinnovation.controledeponto.repository;

import one.digitalinnovation.controledeponto.model.AnnualLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnualLeaveRepository extends JpaRepository<AnnualLeave, Long> {

}
