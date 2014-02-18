/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
/* Generated By:JavaCC: Do not edit this line. Token.java Version 5.0 */
/* JavaCCOptions:TOKEN_EXTENDS=,KEEP_LINE_COL=null,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.semanticweb.owlapi.functional.parser;

/** Describes the input token stream. */
public class Token implements java.io.Serializable {
    private static final long serialVersionUID = 40000L;
    /** An integer that describes the kind of this token. */
    public int kind;
    /** The line number of the first character of this Token. */
    public int beginLine;
    /** The column number of the first character of this Token. */
    public int beginColumn;
    /** The line number of the last character of this Token. */
    public int endLine;
    /** The column number of the last character of this Token. */
    public int endColumn;
    /** The string image of the token. */
    public String image;
    /** A reference to the next regular (non-special) token from the input
     * stream. */
    public Token next;
    /** This field is used to access special tokens that occur prior to this
     * token, but after the immediately preceding regular (non-special) token. */
    public Token specialToken;

    /** An optional attribute value of the Token. Tokens which are not used as
     * syntactic sugar will contain meaningful values that will be used later on
     * by the compiler or interpreter.
     * 
     * @return value */
    public Object getValue() {
        return null;
    }

    /** default constructor */
    public Token() {}

    /** @param kind
     *            kind */
    public Token(int kind) {
        this(kind, null);
    }

    /** @param kind
     *            kind
     * @param image
     *            string value */
    public Token(int kind, String image) {
        this.kind = kind;
        this.image = image;
    }

    /** Returns the image. */
    @Override
    public String toString() {
        return image;
    }

    /** Returns a new Token object.
     * 
     * @param ofKind
     *            kind
     * @param image
     *            string value
     * @return token */
    public static Token newToken(int ofKind, String image) {
        switch (ofKind) {
            default:
                return new Token(ofKind, image);
        }
    }

    /** @param ofKind
     *            type
     * @return token */
    public static Token newToken(int ofKind) {
        return newToken(ofKind, null);
    }
}
/*
 * JavaCC - OriginalChecksum=cb13f9a8b262bea28963c548386a41b9 (do not edit this
 * line)
 */
