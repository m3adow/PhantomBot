/*
 * Copyright (C) 2016-2018 phantombot.tv
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package tv.phantombot.event.discord.role;

import sx.blah.discord.handle.obj.IRole;
import sx.blah.discord.handle.obj.IUser;

import tv.phantombot.event.discord.DiscordEvent;


/**
 *
 * @author ScaniaTV
 */
public abstract class DiscordRoleEvent extends DiscordEvent {
    private final IRole role;
    
    /**
     * Abstract constructor
     * 
     * @param role
     */
    protected DiscordRoleEvent(IRole role) {
        super();
        
        this.role = role;
    }
    
    /**
     * Method that returns the ID of the role created.
     * 
     * @return 
     */
    public String getRoleID() {
        return role.getStringID();
    }
    
    /**
     * Method that returns the IRole object created.
     * 
     * @return 
     */
    public IRole getDiscordRole() {
        return role;
    }
}
