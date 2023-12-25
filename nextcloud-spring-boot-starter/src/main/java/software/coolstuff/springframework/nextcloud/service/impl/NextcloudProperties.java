package software.coolstuff.springframework.nextcloud.service.impl;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

/**
 * Nextcloud Configuration Properties.
 * <p>
 * The Configuration Properties will be implemented by 2 Classes
 * <ul>
 *   <li><code>software.coolstuff.springframework.nextcloud.service.impl.resource.NextcloudResourceProperties</code><br/>
 *       Implements Resource specific Properties
 *   </li>
 *   <li><code>software.coolstuff.springframework.nextcloud.service.impl.rest.NextcloudRestProperties</code><br/>
 *       Implements REST specific Properties
 *   </li>
 * </ul>
 * <p>
 * Within this Class you find the common Properties used by both Implementations
 *
 * @author mufasa1976
 * @since 1.0.0
 */
@Validated
@Getter
@Setter
public abstract class NextcloudProperties {
  public static final String PREFIX = "nextcloud";
  /**
   * Default Buffer Size
   *
   * @since 1.0.0
   */
  public static final int DEFAULT_BUFFER_SIZE = 8192;

  /**
   * Common Properties for the UserService
   *
   * @author mufasa1976
   * @since 1.0.0
   */
  @Validated
  @Getter
  @Setter
  public static class UserServiceProperties {
    /**
     * Should Modifications through {@link software.coolstuff.springframework.nextcloud.service.api.NextcloudUserService} be allowed
     *
     * @since 1.0.0
     */
    private boolean enableModifications = true;
  }

  /**
   * Location of the Nextcloud Instance.
   * <p/>
   * May start with either of these:
   * <table>
   *   <tr>
   *     <th>Prefix</th>
   *     <th>Usage</th>
   *   </tr>
   *   <tr>
   *     <td><code>classpath:</code></td>
   *     <td>Use a YAML-Resource within the Classpath to configure the Nextcloud Services</td>
   *   </tr>
   *   <tr>
   *     <td><code>file:</code></td>
   *     <td>Use a YAML-Resource outside the Classpath to configure the Nextcloud Services</td>
   *   </tr>
   *   <tr>
   *     <td><code>http://</code> or<br/><code>https://</code></td>
   *     <td>Connects to the Nextcloud Instance</td>
   *   </tr>
   * </table>
   *
   * @since 1.0.0
   */
  private String location;

  /**
   * User Service common Properties
   *
   * @since 1.0.0
   */
  private UserServiceProperties userService = new UserServiceProperties();
}
