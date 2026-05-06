package mk.ukim.finki.wp.exam_room_manager.service.impl;

import lombok.RequiredArgsConstructor;
import mk.ukim.finki.wp.exam_room_manager.model.Professor;
import mk.ukim.finki.wp.exam_room_manager.repository.ProfessorRepository;
import mk.ukim.finki.wp.exam_room_manager.service.ProfessorService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfessorServiceImpl implements ProfessorService {

    private final ProfessorRepository professorRepository;

    @Override
    public Professor findByUsername(String username) {
        return professorRepository.findByUsername(username).orElseThrow();
    }
}
