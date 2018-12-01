package com.guardedbox.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * DTO: Body of the delete secret request.
 * 
 * @author s3curitybug@gmail.com
 *
 */
public class DeleteSecretDto {

    /** Secret ID. */
    @NotNull
    @Positive
    private Long secretId;

    /**
     * @return The secretId.
     */
    public Long getSecretId() {
        return secretId;
    }

    /**
     * @param secretId The secretId to set.
     */
    public void setSecretId(
            Long secretId) {
        this.secretId = secretId;
    }

}
