package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private String orderId;

    public Accepted(Cook aggregate) {
        super(aggregate);
    }

    public Accepted() {
        super();
    }
}
//>>> DDD / Domain Event
