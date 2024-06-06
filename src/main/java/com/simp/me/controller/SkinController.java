package com.simp.me.controller;

import com.simp.me.service.SkinService;
import org.openapitools.api.SkinApi;
import org.openapitools.model.AccountDTO;
import org.openapitools.model.AddSkinDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SkinController implements SkinApi {

    @Autowired
    private SkinService skinService;

    @Override
    public ResponseEntity<AccountDTO> getALlSkins(UUID uuid) {
        return ResponseEntity.ok(skinService.getAllSkins(uuid));
    }

    @Override
    public ResponseEntity<Void> likeSkin(AddSkinDto addSkinDto) {
        return null;
    }

    @Override
    public ResponseEntity<Void> ownSkin(AddSkinDto addSkinDto) {
        return null;
    }
}
