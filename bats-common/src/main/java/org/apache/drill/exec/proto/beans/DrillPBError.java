/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from protobuf

package org.apache.drill.exec.proto.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class DrillPBError implements Externalizable, Message<DrillPBError>, Schema<DrillPBError>
{
    public enum ErrorType implements com.dyuproject.protostuff.EnumLite<ErrorType>
    {
        CONNECTION(0),
        DATA_READ(1),
        DATA_WRITE(2),
        FUNCTION(3),
        PARSE(4),
        PERMISSION(5),
        PLAN(6),
        RESOURCE(7),
        SYSTEM(8),
        UNSUPPORTED_OPERATION(9),
        VALIDATION(10),
        EXECUTION_ERROR(11),
        INTERNAL_ERROR(12),
        UNSPECIFIED_ERROR(13);
        
        public final int number;
        
        private ErrorType (int number)
        {
            this.number = number;
        }
        
        public int getNumber()
        {
            return number;
        }
        
        public static ErrorType valueOf(int number)
        {
            switch(number) 
            {
                case 0: return CONNECTION;
                case 1: return DATA_READ;
                case 2: return DATA_WRITE;
                case 3: return FUNCTION;
                case 4: return PARSE;
                case 5: return PERMISSION;
                case 6: return PLAN;
                case 7: return RESOURCE;
                case 8: return SYSTEM;
                case 9: return UNSUPPORTED_OPERATION;
                case 10: return VALIDATION;
                case 11: return EXECUTION_ERROR;
                case 12: return INTERNAL_ERROR;
                case 13: return UNSPECIFIED_ERROR;
                default: return null;
            }
        }
    }


    public static Schema<DrillPBError> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static DrillPBError getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DrillPBError DEFAULT_INSTANCE = new DrillPBError();

    
    private String errorId;
    private DrillbitEndpoint endpoint;
    private ErrorType errorType;
    private String message;
    private ExceptionWrapper exception;
    private List<ParsingError> parsingError;

    public DrillPBError()
    {
        
    }

    // getters and setters

    // errorId

    public String getErrorId()
    {
        return errorId;
    }

    public DrillPBError setErrorId(String errorId)
    {
        this.errorId = errorId;
        return this;
    }

    // endpoint

    public DrillbitEndpoint getEndpoint()
    {
        return endpoint;
    }

    public DrillPBError setEndpoint(DrillbitEndpoint endpoint)
    {
        this.endpoint = endpoint;
        return this;
    }

    // errorType

    public ErrorType getErrorType()
    {
        return errorType == null ? ErrorType.CONNECTION : errorType;
    }

    public DrillPBError setErrorType(ErrorType errorType)
    {
        this.errorType = errorType;
        return this;
    }

    // message

    public String getMessage()
    {
        return message;
    }

    public DrillPBError setMessage(String message)
    {
        this.message = message;
        return this;
    }

    // exception

    public ExceptionWrapper getException()
    {
        return exception;
    }

    public DrillPBError setException(ExceptionWrapper exception)
    {
        this.exception = exception;
        return this;
    }

    // parsingError

    public List<ParsingError> getParsingErrorList()
    {
        return parsingError;
    }

    public DrillPBError setParsingErrorList(List<ParsingError> parsingError)
    {
        this.parsingError = parsingError;
        return this;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<DrillPBError> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public DrillPBError newMessage()
    {
        return new DrillPBError();
    }

    public Class<DrillPBError> typeClass()
    {
        return DrillPBError.class;
    }

    public String messageName()
    {
        return DrillPBError.class.getSimpleName();
    }

    public String messageFullName()
    {
        return DrillPBError.class.getName();
    }

    public boolean isInitialized(DrillPBError message)
    {
        return true;
    }

    public void mergeFrom(Input input, DrillPBError message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.errorId = input.readString();
                    break;
                case 2:
                    message.endpoint = input.mergeObject(message.endpoint, DrillbitEndpoint.getSchema());
                    break;

                case 3:
                    message.errorType = ErrorType.valueOf(input.readEnum());
                    break;
                case 4:
                    message.message = input.readString();
                    break;
                case 5:
                    message.exception = input.mergeObject(message.exception, ExceptionWrapper.getSchema());
                    break;

                case 6:
                    if(message.parsingError == null)
                        message.parsingError = new ArrayList<ParsingError>();
                    message.parsingError.add(input.mergeObject(null, ParsingError.getSchema()));
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, DrillPBError message) throws IOException
    {
        if(message.errorId != null)
            output.writeString(1, message.errorId, false);

        if(message.endpoint != null)
             output.writeObject(2, message.endpoint, DrillbitEndpoint.getSchema(), false);


        if(message.errorType != null)
             output.writeEnum(3, message.errorType.number, false);

        if(message.message != null)
            output.writeString(4, message.message, false);

        if(message.exception != null)
             output.writeObject(5, message.exception, ExceptionWrapper.getSchema(), false);


        if(message.parsingError != null)
        {
            for(ParsingError parsingError : message.parsingError)
            {
                if(parsingError != null)
                    output.writeObject(6, parsingError, ParsingError.getSchema(), true);
            }
        }

    }

    public String getFieldName(int number)
    {
        switch(number)
        {
            case 1: return "errorId";
            case 2: return "endpoint";
            case 3: return "errorType";
            case 4: return "message";
            case 5: return "exception";
            case 6: return "parsingError";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
        __fieldMap.put("errorId", 1);
        __fieldMap.put("endpoint", 2);
        __fieldMap.put("errorType", 3);
        __fieldMap.put("message", 4);
        __fieldMap.put("exception", 5);
        __fieldMap.put("parsingError", 6);
    }
    
}
