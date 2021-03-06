package pl.touroperators.touroperator2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.touroperators.touroperator2.model.Reservation;
import pl.touroperators.touroperator2.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    Reservation save(Reservation reservation);
}
