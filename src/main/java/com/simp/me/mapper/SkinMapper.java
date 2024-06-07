package com.simp.me.mapper;

import com.simp.me.models.Account;
import com.simp.me.models.Skin;
import com.simp.me.models.SkinKey;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.openapitools.model.AddSkinDto;
import org.openapitools.model.SkinDTO;

@Mapper
public interface SkinMapper {
    SkinMapper SKIN_MAPPER = Mappers.getMapper(SkinMapper.class);

    @Mapping(source = "skinKey.id", target = "id")
    @Mapping(source = "liked", target = "isLiked")
    @Mapping(source = "owned", target = "isOwned")
    SkinDTO mapToDTO(Skin skin);

    @Mapping(source = "account", target = "account")
    @Mapping(source = "dto.skinId", target = "id")
    SkinKey mapToKeyModel(AddSkinDto dto, Account account);
}
