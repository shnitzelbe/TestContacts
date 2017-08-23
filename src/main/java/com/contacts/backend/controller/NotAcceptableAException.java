package com.contacts.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class NotAcceptableAException  extends RuntimeException {
        public NotAcceptableAException(String filter) {
            super("Too many records for filter: '" + filter + "'.");
        }
}
