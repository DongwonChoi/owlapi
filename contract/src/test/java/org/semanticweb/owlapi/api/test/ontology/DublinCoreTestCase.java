/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2011, University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.semanticweb.owlapi.api.test.ontology;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.AbstractFileTestCase;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.vocab.DublinCoreVocabulary;

/**
 * Author: Matthew Horridge<br>
 * The University of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 16/12/2010
 */
@SuppressWarnings("javadoc")
public class DublinCoreTestCase extends AbstractFileTestCase {

    @Override
    protected String getFileName() {
        return "dublincore.rdf";
    }

    @Test
    public void testAnnotationProperties() {
        OWLOntology ontology = createOntology();
        //        System.out.println("Annotation properties ----------------------------------------------------------");
        //        for(OWLAnnotationProperty property : ontology.getAnnotationPropertiesInSignature()) {
        //            System.out.println(property);
        //        }
        //        System.out.println("Object properties --------------------------------------------------------------");
        //        for(OWLObjectProperty property : ontology.getObjectPropertiesInSignature()) {
        //            System.out.println(property);
        //            for(OWLAxiom ax : ontology.getReferencingAxioms(property)) {
        //                System.out.println("\t" + ax);
        //            }
        //        }

        for(DublinCoreVocabulary vocabulary : DublinCoreVocabulary.values()) {
            assertTrue(ontology.containsAnnotationPropertyInSignature(vocabulary.getIRI()));
        }
    }
}