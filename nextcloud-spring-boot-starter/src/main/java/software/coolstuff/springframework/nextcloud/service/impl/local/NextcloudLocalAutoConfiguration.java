package software.coolstuff.springframework.nextcloud.service.impl.local;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
@RequiredArgsConstructor
@ConditionalOnClass(Jackson2ObjectMapperBuilder.class)
@ConditionalOnExpression("#{'${nextcloud.location}' matches 'file:.*' or '${nextcloud.location}' matches 'classpath:.*'}")
@EnableConfigurationProperties(NextcloudLocalProperties.class)
public class NextcloudLocalAutoConfiguration {
  private final NextcloudLocalProperties nextcloudProperties;
}
