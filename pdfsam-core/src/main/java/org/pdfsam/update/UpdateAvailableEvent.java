/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 06/apr/2012
 * Copyright 2012 by Andrea Vacondio (andrea.vacondio@gmail.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.update;

import static org.pdfsam.support.RequireUtils.require;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

/**
 * Event to notify a new version available.
 * 
 * @author Andrea Vacondio
 * 
 */
public class UpdateAvailableEvent {

    private String availableVersion;

    public UpdateAvailableEvent(String availableVersion) {
        require(isNotBlank(availableVersion), "Available version cannot be empty");
        this.availableVersion = availableVersion;
    }

    public String getAvailableVersion() {
        return availableVersion;
    }

}
