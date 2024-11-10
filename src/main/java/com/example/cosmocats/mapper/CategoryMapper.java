package com.example.cosmocats.mapper;

import com.example.cosmocats.domain.Category;
import com.example.cosmocats.dto.CategoryDTO;

public interface CategoryMapper {
    CategoryDTO toDTO(Category category);
    Category toEntity(CategoryDTO categoryDTO);
}
