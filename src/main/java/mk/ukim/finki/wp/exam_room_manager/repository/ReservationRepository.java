package mk.ukim.finki.wp.exam_room_manager.repository;

import mk.ukim.finki.wp.exam_room_manager.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findAllByClassroomAndExam_ExamDate(Classroom classroom, LocalDate date);
}