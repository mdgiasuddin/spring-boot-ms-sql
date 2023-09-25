package com.example.test.springmssql.mapper;

import com.example.test.springmssql.dto.UniversityDTO;
import com.example.test.springmssql.entity.University;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(
    builder = @Builder(disableBuilder = true)
)
public interface UniversityMapper {
    University createUniversityFromDTO(UniversityDTO dto);
}
