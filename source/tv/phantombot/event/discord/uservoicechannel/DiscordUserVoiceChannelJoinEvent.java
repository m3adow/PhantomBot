/*
 * Copyright (C) 2016-2019 phantombot.tv
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
package tv.phantombot.event.discord.uservoicechannel;

import sx.blah.discord.handle.obj.IUser;
import sx.blah.discord.handle.obj.IVoiceChannel;

public class DiscordUserVoiceChannelJoinEvent extends DiscordUserVoiceChannelEvent {

    /**
     * Class constructor.
     *
     * @param {IUser} user
     */
    public DiscordUserVoiceChannelJoinEvent(IUser user) {
        super(user);
    }

    /**
     * Class constructor.
     *
     * @param {IUser}    user
     * @param {IVoiceChannel} voicechannel
     */
    public DiscordUserVoiceChannelJoinEvent(IUser user, IVoiceChannel voicechannel) {
        super(user, voicechannel);
    }

}
