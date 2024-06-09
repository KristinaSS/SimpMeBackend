package com.simp.me.controller;

import com.simp.me.service.SkinService;
import org.openapitools.api.SkinApi;
import org.openapitools.model.AccountDTO;
import org.openapitools.model.AccountRequest;
import org.openapitools.model.AddSkinDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkinController implements SkinApi {

    @Autowired
    private SkinService skinService;

    @Override
    public ResponseEntity<Void> disOwnSkin(AddSkinDto addSkinDto) {
        skinService.nullifySkin(addSkinDto);
        return ResponseEntity.ok(null);
    }

    @Override
    public ResponseEntity<AccountDTO> getALlSkins(AccountRequest uuid) {
        return ResponseEntity.ok(skinService.getAllSkins(uuid.getId()));
    }

    @Override
    public ResponseEntity<Void> likeSkin(AddSkinDto addSkinDto) {
        skinService.likeSkin(addSkinDto);
        return ResponseEntity.ok(null);
    }

    @Override
    public ResponseEntity<Void> ownSkin(AddSkinDto addSkinDto) {
        skinService.ownSkin(addSkinDto);
        return ResponseEntity.ok(null);
    }

    @Override
    public ResponseEntity<Void> unLikeSkin(AddSkinDto addSkinDto) {
        skinService.nullifySkin(addSkinDto);
        return ResponseEntity.ok(null);
    }
}
