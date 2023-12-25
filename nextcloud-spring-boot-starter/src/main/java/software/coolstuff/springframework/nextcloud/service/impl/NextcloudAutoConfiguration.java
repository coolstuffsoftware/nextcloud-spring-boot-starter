package software.coolstuff.springframework.nextcloud.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "nextcloud", name = "location")
@EnableAspectJAutoProxy
public class NextcloudAutoConfiguration {
  private final NextcloudProperties nextcloudProperties;
}
