package Qara.evo.Manager;

import Qara.evo.Dto.StudentDto;
import Qara.evo.Dto.StudentRequestDto;
import Qara.evo.Model.Student;
import Qara.evo.Repository.StudentRepository;
import Qara.evo.Service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    private final ModelMapper mapper;
    @Override
    public List<StudentDto> getAllDto() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> dtos = students.stream().map(student -> mapper.map(student,StudentDto.class)).toList();
        return dtos;
    }

    @Override
    public StudentDto getById(long id) {
        studentRepository.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
        return mapper.map(studentRepository.findById(id), StudentDto.class);
    }

    @Override
    public StudentDto createDto(StudentDto dto) {

        Student student = mapper.map(dto, Student.class);
        Student save = studentRepository.save(student);
        return mapper.map(save, StudentDto.class);
    }

    @Override
    public StudentDto update(long id, StudentDto dto) {

        studentRepository.findById(id).ifPresentOrElse(student -> dto.setId(student.getId()),
                () -> {
            throw new RuntimeException("student not found");
                });
        Student student = mapper.map(dto,Student.class);
        Student save = studentRepository.save(student);
        return mapper.map(save, StudentDto.class);
    }
    @Override
    public void deleteById(long id) {
        studentRepository.deleteById(id);
        log.info("silindi");
    }

    @Override
    public List<StudentDto> getByname(StudentRequestDto requestDto) {
        String name = requestDto.getName();
        List<Student> students = studentRepository.getByName(name);
        List<StudentDto> dtos = students.stream().map(entity -> mapper.map(entity, StudentDto.class)).toList();
        return dtos;
    }

}
