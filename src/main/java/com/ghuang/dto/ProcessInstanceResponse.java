package com.ghuang.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ProcessInstanceResponse {
  String processId;
  boolean isEnded;
}
