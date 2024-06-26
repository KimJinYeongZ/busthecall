package capston.busthecall.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class OperateInfoRequest {

    private String routeName;
    private String busNumber;
}
