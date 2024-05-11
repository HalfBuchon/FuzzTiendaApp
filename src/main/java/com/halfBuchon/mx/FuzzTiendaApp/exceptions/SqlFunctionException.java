package com.halfBuchon.mx.FuzzTiendaApp.exceptions;

import org.springframework.dao.DataAccessException;

public class SqlFunctionException extends DataAccessException {

    public SqlFunctionException(String msg) {
        super(msg);
    }

}
