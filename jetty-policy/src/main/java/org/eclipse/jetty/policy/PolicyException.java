package org.eclipse.jetty.policy;
//========================================================================
//Copyright (c) Webtide LLC
//------------------------------------------------------------------------
//All rights reserved. This program and the accompanying materials
//are made available under the terms of the Eclipse Public License v1.0
//and Apache License v2.0 which accompanies this distribution.
//
//The Eclipse Public License is available at
//http://www.eclipse.org/legal/epl-v10.html
//
//The Apache License v2.0 is available at
//http://www.apache.org/licenses/LICENSE-2.0.txt
//
//You may elect to redistribute this code under either of these licenses.
//========================================================================


@SuppressWarnings("serial")
public class PolicyException extends RuntimeException 
{

    public PolicyException()
    {
            super();
    }

    public PolicyException( final String message, final Throwable cause)
    {
            super( message, cause );
    }

    public PolicyException( final String message )
    {
            super( message );
    }

    public PolicyException( final Throwable cause )
    {
            super( cause );
    }
	
}
