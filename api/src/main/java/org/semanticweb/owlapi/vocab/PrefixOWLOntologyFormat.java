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
package org.semanticweb.owlapi.vocab;

import java.util.Map;
import java.util.Set;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.util.DefaultPrefixManager;

/** Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 20-Feb-2007<br>
 * <br>
 * <p/>
 * An */
public class PrefixOWLOntologyFormat extends OWLOntologyFormat implements PrefixManager {
    private static final long serialVersionUID = 40000L;
    private final DefaultPrefixManager nsm;

    @SuppressWarnings("javadoc")
    public PrefixOWLOntologyFormat() {
        nsm = new DefaultPrefixManager();
        nsm.clear();
    }

    @Override
    public void setPrefix(String prefixName, String prefix) {
        String _prefixName = prefixName;
        if (!_prefixName.endsWith(":")) {
            _prefixName = _prefixName + ":";
        }
        nsm.setPrefix(_prefixName, prefix);
    }

    @Override
    public void clear() {
        nsm.clear();
    }

    @Override
    public Set<String> getPrefixNames() {
        return nsm.getPrefixNames();
    }

    @Override
    public void setDefaultPrefix(String namespace) {
        nsm.setDefaultPrefix(namespace);
    }

    @Override
    public boolean containsPrefixMapping(String prefix) {
        return nsm.containsPrefixMapping(prefix);
    }

    @Override
    public String getDefaultPrefix() {
        return nsm.getDefaultPrefix();
    }

    @Override
    public Map<String, String> getPrefixName2PrefixMap() {
        return nsm.getPrefixName2PrefixMap();
    }

    @Override
    public String getPrefix(String prefixName) {
        return nsm.getPrefix(prefixName);
    }

    @Override
    public IRI getIRI(String iri) {
        return nsm.getIRI(iri);
    }

    @Override
    public String getPrefixIRI(IRI iri) {
        return nsm.getPrefixIRI(iri);
    }

    @Override
    public void copyPrefixesFrom(PrefixManager prefixManager) {
        nsm.copyPrefixesFrom(prefixManager);
    }

    @Override
    public void unregisterNamespace(String namespace) {
        nsm.unregisterNamespace(namespace);
    }
}
