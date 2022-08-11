package bg.softuni.autoTraderExperience.repositoris;

import bg.softuni.autoTraderExperience.models.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
