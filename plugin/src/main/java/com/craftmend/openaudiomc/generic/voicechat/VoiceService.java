package com.craftmend.openaudiomc.generic.voicechat;

public interface VoiceService {

    /**
     * Blocking method that tries to login to a server and establish a connection
     * @param host Server full host (eg https://joostspeeltspellen.voice.openaudiomc.net/) with a trailing slash
     * @param password Server password
     */
    void connect(String host, String password);

    void shutdown();

    boolean isEnabled();

}
