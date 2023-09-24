package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServerData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-24T15:24:29.451528149Z[GMT]")


public class ServerData   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("framework")
  private String framework = null;

  public ServerData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServerData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServerData language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   **/
  @Schema(description = "")
  
    public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public ServerData framework(String framework) {
    this.framework = framework;
    return this;
  }

  /**
   * Get framework
   * @return framework
   **/
  @Schema(description = "")
  
    public String getFramework() {
    return framework;
  }

  public void setFramework(String framework) {
    this.framework = framework;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerData serverData = (ServerData) o;
    return Objects.equals(this.id, serverData.id) &&
        Objects.equals(this.name, serverData.name) &&
        Objects.equals(this.language, serverData.language) &&
        Objects.equals(this.framework, serverData.framework);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, language, framework);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
