package me.crypnotic.neutron.api.user;

import java.util.Optional;
import java.util.UUID;

import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.proxy.Player;

public interface User<T extends CommandSource> {

    void load() throws Exception;

    void save() throws Exception;
    
    Optional<T> getBase();

    String getName();

    CommandSource getReplyRecipient();
    
    Optional<UUID> getUUID();

    void setReplyRecipient(CommandSource source);

    default boolean isPlayer() {
        return getBase().isPresent() && getBase().get() instanceof Player;
    }
}
