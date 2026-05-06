package mk.ukim.finki.wp.exam_room_manager.service;

import mk.ukim.finki.wp.exam_room_manager.model.Professor;
import org.springframework.security.core.userdetails.UserDetails;

public interface ProfessorService {
    Professor findByUsername(String username);
}
