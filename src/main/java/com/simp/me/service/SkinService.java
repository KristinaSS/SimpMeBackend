package com.simp.me.service;

import com.simp.me.models.Account;
import com.simp.me.models.Skin;
import com.simp.me.models.SkinKey;
import com.simp.me.repository.SkinRepository;
import org.openapitools.model.AccountDTO;
import org.openapitools.model.AddSkinDto;
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

    @Autowired AccountService accountService;

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

    public void likeSkin(AddSkinDto addSkinDto) {
        Account account = accountService.getAccountById(addSkinDto.getAccId());
        SkinKey skinKey = SKIN_MAPPER.mapToKeyModel(addSkinDto, account);
        Skin skin = Skin.builder()
                .skinKey(skinKey)
                .isLiked(true)
                .isOwned(false)
                .build();
        skinRepository.save(skin);
    }

    public void ownSkin(AddSkinDto addSkinDto) {
        Account account = accountService.getAccountById(addSkinDto.getAccId());
        SkinKey skinKey = SKIN_MAPPER.mapToKeyModel(addSkinDto, account);
        Skin skin = Skin.builder()
                .skinKey(skinKey)
                .isLiked(false)
                .isOwned(true)
                .build();
        skinRepository.save(skin);
    }
}
