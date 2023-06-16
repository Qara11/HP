package Qara.evo.Manager;

import Qara.evo.Dto.SchoolDto;
import Qara.evo.Service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {
    @Override
    public List<SchoolDto> getAll() {
        return null;
    }

    @Override
    public SchoolDto getById(Long id) {
        return null;
    }

    @Override
    public SchoolDto create(SchoolDto dto) {
        return null;
    }

    @Override
    public SchoolDto update(Long id, SchoolDto dto) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
