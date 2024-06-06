package com.simp.me.mapper;

import com.simp.me.models.Skin;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.openapitools.model.SkinDTO;

@Mapper
public interface SkinMapper {
    SkinMapper SKIN_MAPPER = Mappers.getMapper(SkinMapper.class);

    SkinDTO mapToDTO(Skin skin);
}
