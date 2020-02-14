package lk.dialog.crm.service.impl;

import lk.dialog.crm.dto.VideoAddonSaveRequestDto;
import lk.dialog.crm.service.VideoAddonService;
import org.springframework.stereotype.Service;

/**
 * @author sandun
 */
@Service
public class VideoAddonServiceImpl implements VideoAddonService {

    @Override
    public String getVideoAddon() {
        return "Sandun";
    }

    @Override
    public Long getVideoAddonById(Long id) {
        return id;
    }

    @Override
    public VideoAddonSaveRequestDto saveVideoAddonById(VideoAddonSaveRequestDto videoAddonSaveRequestDto) {
        return videoAddonSaveRequestDto;
    }

    @Override
    public VideoAddonSaveRequestDto updateVideoAddonById(VideoAddonSaveRequestDto videoAddonSaveRequestDto) {

        Long mobileNo = videoAddonSaveRequestDto.getId();

        return videoAddonSaveRequestDto;
    }
}
