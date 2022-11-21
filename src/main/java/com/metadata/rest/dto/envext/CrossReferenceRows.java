package com.metadata.rest.dto.envext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossReferenceRows {

  private List<Row> row;

  public List<Row> getRow() {
    return row;
  }

  public void setRow(List<Row> row) {
    this.row = row;
  }
}
