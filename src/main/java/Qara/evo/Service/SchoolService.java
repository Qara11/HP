package Qara.evo.Service;

import Qara.evo.Dto.SchoolDto;
import Qara.evo.Model.School;

import java.util.List;

public interface SchoolService {

    List<SchoolDto> getAll();
    SchoolDto getById(Long id);
    SchoolDto create(SchoolDto dto);
    SchoolDto update(Long id, SchoolDto dto);
    void deleteById(Long id);

}
