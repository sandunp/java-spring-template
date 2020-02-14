package lk.dialog.crm.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @author sandun
 */

@Data
@ToString
public class VideoAddonSaveRequestDto {
    private Long id;
    @NotEmpty(message = "Mobile is a required")
    @Pattern(regexp = "^\\s*7[6,7]\\d{7}\\s*$", message = "Invalid mobile")
    private String name;
}
