package pl.devsmentoring.java.TestOOP;

import java.time.LocalDateTime;
import java.util.Objects;

public class Event {
    private LocalDateTime dateTime;
    private String tank;
    private String operationType;
    private double volume;
    private boolean isOperationSuccessful;

    public Event(LocalDateTime dateTime, String tank, String operationType, double volume, boolean isOperationSuccessful) {
        this.dateTime = dateTime;
        this.tank = tank;
        this.operationType = operationType;
        this.volume = volume;
        this.isOperationSuccessful = isOperationSuccessful;
    }

    public String getOperationType() {
        return operationType;
    }

    public boolean isOperationSuccessful() {
        return isOperationSuccessful;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return isOperationSuccessful == event.isOperationSuccessful && Objects.equals(dateTime, event.dateTime) && Objects.equals(tank, event.tank) && Objects.equals(operationType, event.operationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, tank, operationType, isOperationSuccessful);
    }
}
