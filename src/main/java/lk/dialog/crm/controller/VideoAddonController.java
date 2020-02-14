package lk.dialog.crm.controller;

import lk.dialog.crm.common.ConstAPI;
import lk.dialog.crm.dto.VideoAddonSaveRequestDto;
import lk.dialog.crm.service.VideoAddonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author sandun
 */
@RestController
@RequestMapping(ConstAPI.API_ROOT)
public class VideoAddonController {

    private final VideoAddonService videoAddonService;

    public VideoAddonController(VideoAddonService videoAddonService) {
        this.videoAddonService = videoAddonService;
    }

    @GetMapping(value = ConstAPI.GET_ALL_VIDEO_ADDON, produces = ConstAPI.PRODUCE_TYPE_JSON)
    public ResponseEntity<?> getVideoAddon(){
        String val = videoAddonService.getVideoAddon();
        return ResponseEntity.status(HttpStatus.OK).body(val);
    }

    @GetMapping(value = ConstAPI.GET_VIDEO_ADDON_BY_ID, produces = ConstAPI.PRODUCE_TYPE_JSON)
    public ResponseEntity<?> getVideoAddonById(
            @PathVariable Long id
    ){
        Long val = videoAddonService.getVideoAddonById(id);
        return ResponseEntity.status(HttpStatus.OK).body(val);
    }

    @PostMapping(value = ConstAPI.CREATE_VIDEO_ADDON, produces = ConstAPI.PRODUCE_TYPE_JSON, consumes = ConstAPI.CONSUME_TYPE_JSON)
    public ResponseEntity<?> saveVideoAddonById(
            @RequestBody VideoAddonSaveRequestDto videoAddonSaveRequestDto
    ){
        VideoAddonSaveRequestDto videoAddonSaveRequestDto1 = videoAddonService.saveVideoAddonById(videoAddonSaveRequestDto);
        return ResponseEntity.status(HttpStatus.OK).body(videoAddonSaveRequestDto1);
    }

    @PutMapping(value = ConstAPI.UPDATE_VIDEO_ADDON, produces = ConstAPI.PRODUCE_TYPE_JSON, consumes = ConstAPI.CONSUME_TYPE_JSON)
    public ResponseEntity<?> updateVideoAddonById(
            @RequestBody @Valid VideoAddonSaveRequestDto videoAddonSaveRequestDto
    ){


        VideoAddonSaveRequestDto videoAddonSaveRequestDto1 = videoAddonService.updateVideoAddonById(videoAddonSaveRequestDto);
        return ResponseEntity.status(HttpStatus.OK).body(videoAddonSaveRequestDto1);
    }


}
