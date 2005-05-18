/*
 * Copyright 2005 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.tools.ant.types;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.BuildFileTest;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.taskdefs.condition.Condition;

public class PropertySetTest extends BuildFileTest {

    public PropertySetTest(String name) {
        super(name);
    }

    public void setUp() {
        configureProject("src/etc/testcases/types/propertyset.xml");
    }

    public void testReferenceToTwoReferences() {
        executeTarget("reference-to-two-references");
    }

    public void testNestedMapped() {
        executeTarget("nested-mapped");
    }

    public void testNestedMappedMapped() {
        executeTarget("nested-mapped-mapped");
    }
}
