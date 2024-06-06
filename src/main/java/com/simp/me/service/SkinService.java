package com.simp.me.service;

import com.simp.me.repository.SkinRepository;
import org.openapitools.model.AccountDTO;
import org.openapitools.model.SkinDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.simp.me.mapper.SkinMapper.SKIN_MAPPER;

@Service
public class SkinService {

    @Autowired
    private SkinRepository skinRepository;

    public AccountDTO getAllSkins(UUID uuid) {

        List<SkinDTO> skins = skinRepository.findAllByAccountId(uuid)
                .stream()
                .map(SKIN_MAPPER::mapToDTO)
                .collect(Collectors.toList());

        return AccountDTO.builder()
                .id(uuid)
                .skins(skins)
                .build();
    }
}
