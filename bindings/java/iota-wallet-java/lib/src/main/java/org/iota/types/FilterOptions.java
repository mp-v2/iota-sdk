// Copyright 2022 IOTA Stiftung
// SPDX-License-Identifier: Apache-2.0

package org.iota.types;
public class FilterOptions extends AbstractObject {

    /// Filter all outputs where the booked milestone index is below the specified timestamp
    private Integer lowerBoundBookedTimestamp;
    /// Filter all outputs where the booked milestone index is above the specified timestamp
    private Integer upperBoundBookedTimestamp;

    public FilterOptions withLowerBoundBookedTimestamp(Integer lowerBoundBookedTimestamp) {
        this.lowerBoundBookedTimestamp = lowerBoundBookedTimestamp;
        return this;
    }

    public FilterOptions withUpperBoundBookedTimestamp(Integer upperBoundBookedTimestamp) {
        this.upperBoundBookedTimestamp = upperBoundBookedTimestamp;
        return this;
    }

    public Integer getLowerBoundBookedTimestamp() {
        return lowerBoundBookedTimestamp;
    }

    public Integer getUpperBoundBookedTimestamp() {
        return upperBoundBookedTimestamp;
    }
}