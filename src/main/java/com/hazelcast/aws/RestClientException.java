/*
 * Copyright 2020 Hazelcast Inc.
 *
 * Licensed under the Hazelcast Community License (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://hazelcast.com/hazelcast-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.hazelcast.aws;

/**
 * Exception to indicate any issues while executing a REST call.
 */
class RestClientException
        extends RuntimeException {
    private int httpErrorCode;

    RestClientException(String message, int httpErrorCode) {
        super(String.format("%s. HTTP Error Code: %s", message, httpErrorCode));
        this.httpErrorCode = httpErrorCode;
    }

    RestClientException(String message, Throwable cause) {
        super(message, cause);
    }

    int getHttpErrorCode() {
        return httpErrorCode;
    }
}
