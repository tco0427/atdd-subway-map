package wooteco.subway.controller.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class LineRequest {

    @NotBlank(message = "이름은 입력해주세요.")
    @Pattern(regexp = "^[가-힣|0-9]*선$")
    private String name;
    @NotBlank(message = "색상을 선택해주세요.")
    private String color;
    private Long upStationId;
    private Long downStationId;
    private int distance;

    public LineRequest() {
    }

    public LineRequest(String name, String color, Long upStationId, Long downStationId, int distance) {
        this.name = name;
        this.color = color;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public int getDistance() {
        return distance;
    }
}