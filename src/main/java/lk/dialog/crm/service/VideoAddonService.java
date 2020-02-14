package lk.dialog.crm.service;

import lk.dialog.crm.dto.VideoAddonSaveRequestDto;

import javax.transaction.Transactional;

/**
 * @author sandun
 */
@Transactional
public interface VideoAddonService {
    String getVideoAddon();

    Long getVideoAddonById(Long id);

    VideoAddonSaveRequestDto saveVideoAddonById(VideoAddonSaveRequestDto videoAddonSaveRequestDto);

    VideoAddonSaveRequestDto updateVideoAddonById(VideoAddonSaveRequestDto videoAddonSaveRequestDto);
}
