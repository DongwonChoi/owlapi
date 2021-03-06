/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2011, Ulm University
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
/* Generated By:JavaCC: Do not edit this line. KRSS2ParserConstants.java */
package org.semanticweb.owlapi.krss2.parser;

interface KRSS2ParserConstants {

    int EOF = 0;
    int COMMENT_START = 8;
    int IRI_START = 11;
    int IRI_END = 12;
    int TOP = 14;
    int BOTTOM = 15;
    int NIL = 16;
    int TRUE = 17;
    int OPENPAR = 18;
    int CLOSEPAR = 19;
    int ENDTBOX = 20;
    int ENDABOX = 21;
    int COMPOSE = 22;
    int DEFINECONCEPT = 23;
    int DEFINEPRIMITIVECONCEPT = 24;
    int DISJOINT = 25;
    int EQUIVALENT = 26;
    int IMPLIES = 27;
    int AND = 28;
    int OR = 29;
    int NOT = 30;
    int ALL = 31;
    int ONEOF = 32;
    int SOME = 33;
    int ATLEAST = 34;
    int ATMOST = 35;
    int EXACTLY = 36;
    int DEFINEROLE = 37;
    int DEFINEPRIMITIVEROLE = 38;
    int DISJOINTROLES = 39;
    int DOMAIN_ATTRIBUTE = 40;
    int IMPLIESROLE = 41;
    int INV = 42;
    int INVERSE = 43;
    int INVERSE_ATTRIBUTE = 44;
    int LEFT_IDENTITY_ATTRIBUTE = 45;
    int PARENT = 46;
    int PARENTS = 47;
    int RANGE = 48;
    int RANGE_ATTRIBUTE = 49;
    int REFLEXIVE_ATTRIBUTE = 50;
    int RIGHT_IDENTITY_ATTRIBUTE = 51;
    int ROLESEQUIVALENT = 52;
    int ROLE_INCLUSION = 53;
    int SUBROLE = 54;
    int SYMMETRIC_ATTRIBUTE = 55;
    int TRANSITIVE = 56;
    int TRANSITIVE_ATTRIBUTE = 57;
    int DEFINEINDIVIDUAL = 58;
    int DISTINCT = 59;
    int EQUAL = 60;
    int INSTANCE = 61;
    int RELATED = 62;
    int DPOINT = 63;
    int ENUM = 64;
    int INT = 65;
    int NAME = 66;
    int NCCHAR_FULL = 67;
    int NCCHAR1 = 68;
    int ERROR = 69;
    int DEFAULT = 0;
    int IN_COMMENT = 1;
    int IN_IRI = 2;
    String[] tokenImage = { "<EOF>", "\" \"", "\"\\t\"", "\"\\r\"", "\"\\\"\"",
            "\"|\"", "\"\\\\\"", "\"\\n\"", "\";\"", "\"\\n\"",
            "<token of kind 10>", "\"<\"", "\">\"", "<token of kind 13>",
            "<TOP>", "<BOTTOM>", "\"NIL\"", "\"t\"", "\"(\"", "\")\"",
            "\"end-tbox\"", "\"end-abox\"", "\"compose\"",
            "\"define-concept\"", "\"define-primitive-concept\"",
            "\"disjoint\"", "\"equivalent\"", "\"implies\"", "\"AND\"",
            "\"OR\"", "\"NOT\"", "\"ALL\"", "\"one-of\"", "\"SOME\"",
            "\"AT-LEAST\"", "\"AT-MOST\"", "\"EXACTLY\"", "\"define-role\"",
            "\"define-primitive-role\"", "\"disjoint-roles\"", "\":domain\"",
            "\"implies-role\"", "\"inv\"", "\"inverse\"", "\":inverse\"",
            "\":left-identity\"", "\":parent\"", "\":parents\"", "\"range\"",
            "\":range\"", "\":reflexive\"", "\":right-identity\"",
            "\"roles-equivalent\"", "\"role-inclusion\"", "\"subrole\"",
            "\":symmetric\"", "\"TRANSITIVE\"", "<TRANSITIVE_ATTRIBUTE>",
            "\"define-individual\"", "\"distinct\"", "\"equal\"",
            "\"instance\"", "\"related\"", "\":\"", "\"enum\"", "<INT>",
            "<NAME>", "<NCCHAR_FULL>", "<NCCHAR1>", "<ERROR>", };
}
