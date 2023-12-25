package software.coolstuff.springframework.nextcloud.service.impl.rest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import software.coolstuff.springframework.nextcloud.service.impl.NextcloudProperties;

@Validated
@Getter
@Setter
@ConfigurationProperties(NextcloudProperties.PREFIX)
public class NextcloudRestProperties extends NextcloudProperties {
}
