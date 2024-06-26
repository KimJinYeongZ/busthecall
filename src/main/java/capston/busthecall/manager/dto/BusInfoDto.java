package capston.busthecall.manager.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BusInfoDto {

    private Long routeId;
    private Long busId;
    private String busNumber;
}
