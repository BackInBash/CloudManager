/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.cloudinit;

import java.util.Base64;

/**
 *
 * @author hax0r
 */
public class decode {

    public String base64(String Payload) {
        byte[] decoded = Base64.getDecoder().decode(Payload);
        return new String(decoded);
    }
}
