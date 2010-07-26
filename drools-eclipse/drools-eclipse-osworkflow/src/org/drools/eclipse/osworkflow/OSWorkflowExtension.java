/**
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.eclipse.osworkflow;

import org.drools.eclipse.flow.common.editor.ProcessExtension;
import org.drools.eclipse.flow.common.editor.core.ProcessWrapperBuilder;
import org.drools.eclipse.flow.common.editor.editpart.ProcessEditPartFactory;
import org.drools.eclipse.osworkflow.core.OSWorkflowWrapperBuilder;
import org.drools.eclipse.osworkflow.editor.editpart.OSWorkflowEditPartFactory;

public class OSWorkflowExtension implements ProcessExtension {

    public boolean acceptsProcess(String type) {
        return "OSWorkflow".equals(type);
    }

    public ProcessEditPartFactory getProcessEditPartFactory() {
        return new OSWorkflowEditPartFactory();
    }

    public ProcessWrapperBuilder getProcessWrapperBuilder() {
        return new OSWorkflowWrapperBuilder();
    }

}
