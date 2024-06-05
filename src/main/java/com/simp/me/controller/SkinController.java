package com.simp.me.controller;

import org.openapitools.api.SkinApi;
import org.openapitools.model.AccountDTO;
import org.openapitools.model.AddSkinDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SkinController implements SkinApi {

    @Override
    public ResponseEntity<AccountDTO> getALlSkins(UUID body) {
        return null;
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
