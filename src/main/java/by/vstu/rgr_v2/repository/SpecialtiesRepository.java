package by.vstu.rgr_v2.repository;

import by.vstu.rgr_v2.entity.Specialties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtiesRepository extends JpaRepository<Specialties, Long> {
}