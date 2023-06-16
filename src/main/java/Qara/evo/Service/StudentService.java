package Qara.evo.Service;

import Qara.evo.Dto.StudentDto;
import Qara.evo.Dto.StudentRequestDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllDto();
    StudentDto getById(long id);
    StudentDto createDto(StudentDto dto);
    StudentDto update(long id, StudentDto dto);
    void deleteById(long id);

    List<StudentDto> getByname(StudentRequestDto requestDto);

}
