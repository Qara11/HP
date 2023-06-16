package Qara.evo.Controller;

import Qara.evo.Dto.StudentDto;
import Qara.evo.Dto.StudentRequestDto;
import Qara.evo.Service.StudentService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/getall")
    public List<StudentDto> studentDtos() {
        return studentService.getAllDto();
    }


    @GetMapping("/{id}")
    public StudentDto getById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @PostMapping("/create")
    public StudentDto getById(@RequestBody StudentDto dto) {
        return studentService.createDto(dto);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Long id) {
        studentService.deleteById(id);
    }

    @PutMapping("update/{id}")
    public StudentDto getById(@PathVariable Long id, @RequestBody StudentDto dto) {
        return studentService.update(id, dto);
    }

    @GetMapping("/getname")
    public List<StudentDto> getByName (@RequestBody StudentRequestDto requestDto) {
        return studentService.getByname(requestDto);
}
}
