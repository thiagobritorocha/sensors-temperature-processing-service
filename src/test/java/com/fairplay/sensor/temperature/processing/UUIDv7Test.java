package com.fairplay.sensor.temperature.processing;

import static org.assertj.core.api.Assertions.assertThat;

import com.fairplay.sensor.temperature.processing.common.IdGenerator;
import com.fairplay.sensor.temperature.processing.common.UUIDv7Utils;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class UUIDv7Test {

  @Test
  void shouldGenerateUUIDv7() {
    UUID uuid1 = IdGenerator.gerateTimeBasedUUID();
    UUID uuid2 = IdGenerator.gerateTimeBasedUUID();
    UUID uuid3 = IdGenerator.gerateTimeBasedUUID();
    UUID uuid4 = IdGenerator.gerateTimeBasedUUID();

    System.out.println(uuid1);
    System.out.println(uuid2);
    System.out.println(uuid3);
    System.out.println(uuid4);

    System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid1));
    System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid2));
    System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid3));
    System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid4));

    OffsetDateTime offsetDateTime =
        UUIDv7Utils.extractOffsetDateTime(uuid1).truncatedTo(ChronoUnit.MINUTES);
    OffsetDateTime currentOffsetDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);
    assertThat(offsetDateTime).isEqualTo(currentOffsetDateTime);
  }
}
