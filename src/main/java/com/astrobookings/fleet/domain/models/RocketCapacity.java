package com.astrobookings.fleet.domain.models;

import com.astrobookings.shared.domain.models.BusinessErrorCode;
import com.astrobookings.shared.domain.models.BusinessException;

public record RocketCapacity(int capacity) {
    public RocketCapacity {
        validate(capacity);
    }

    public int getValue() {
        return capacity;
    }

    private void validate(int capacity) {
        if (capacity <= 0 || capacity >= 10) {
            throw new BusinessException(BusinessErrorCode.VALIDATION, "Rocket capacity must be between 1 and 10");
        }
    }
}
