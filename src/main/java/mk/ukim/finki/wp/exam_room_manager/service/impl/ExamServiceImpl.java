package mk.ukim.finki.wp.exam_room_manager.service.impl;

import lombok.RequiredArgsConstructor;
import mk.ukim.finki.wp.exam_room_manager.model.Exam;
import mk.ukim.finki.wp.exam_room_manager.model.Subject;
import mk.ukim.finki.wp.exam_room_manager.repository.ExamRepository;
import mk.ukim.finki.wp.exam_room_manager.service.ExamService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {

    private final ExamRepository examRepository;

    @Override
    public Exam createExam(LocalDate examDate, LocalTime localTime, int duration, int numberOfStudents, Subject subject) {
        Exam exam = new Exam(examDate, localTime, duration, numberOfStudents, subject);
        return examRepository.save(exam);
    }

    @Override
    public List<Exam> findAllBySubject(Subject subject) {
        return examRepository.findAllBySubject(subject);
    }
}
