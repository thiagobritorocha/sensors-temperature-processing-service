package com.fairplay.sensor.temperature.processing.common;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedEpochRandomGenerator;
import java.util.UUID;

public class IdGenerator {
  private IdGenerator() {}

  private static final TimeBasedEpochRandomGenerator timeBasedRandomGenerator =
      Generators.timeBasedEpochRandomGenerator();

  public static UUID gerateTimeBasedUUID() {
    return timeBasedRandomGenerator.generate();
  }
}
