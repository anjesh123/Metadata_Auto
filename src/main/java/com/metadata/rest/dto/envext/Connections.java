package com.metadata.rest.dto.envext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Connections {
  private List<Connection> connection;

  public List<Connection> getConnection() {
    return connection;
  }

  public void setConnection(List<Connection> connection) {
    this.connection = connection;
  }
}
