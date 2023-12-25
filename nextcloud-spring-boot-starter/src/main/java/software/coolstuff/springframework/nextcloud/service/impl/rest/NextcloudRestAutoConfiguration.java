package software.coolstuff.springframework.nextcloud.service.impl.rest;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@ConditionalOnClass(XmlMapper.class)
@ConditionalOnExpression("#{'${nextcloud.location}' matches 'http://.*' or '${nextcloud.location}' matches 'https://.*'}")
@EnableConfigurationProperties(NextcloudRestProperties.class)
public class NextcloudRestAutoConfiguration {
  private final NextcloudRestProperties nextcloudProperties;
}
