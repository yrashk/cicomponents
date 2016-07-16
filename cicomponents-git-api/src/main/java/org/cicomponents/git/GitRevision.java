/**
 * Copyright (c) 2016, All Contributors (see CONTRIBUTORS file)
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.cicomponents.git;

import org.cicomponents.Resource;
import org.cicomponents.fs.File;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Ref;

public interface GitRevision extends File, Resource {
    Git getRepository();
    Ref getRef();
}
