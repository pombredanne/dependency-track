/*
 * This file is part of Dependency-Track.
 *
 * Dependency-Track is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * Dependency-Track is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Dependency-Track. If not, see http://www.gnu.org/licenses/.
 */
package org.owasp.dependencytrack.dao;

import org.owasp.dependencytrack.model.ApplicationVersion;

public interface ApplicationVersionDao extends IBaseDao {

    ApplicationVersion getApplicationVersion(final int id);

    void deleteApplicationVersion(final Integer id);

    void addApplicationVersion(final int appid, final String appversion);

    void cloneApplication(final int applicationid, final String applicationname);

    void cloneApplicationVersion(final int applicationid, final String newversion, final String curappver);

    void updateApplicationVersion(final int id, final String appversion);

}
