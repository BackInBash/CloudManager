/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.ssh;

import de.markus.cloudmanager.shared.models.SshPublicPrivateKey;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.KeyPair;
import java.io.ByteArrayOutputStream;

/**
 *
 * @author hax0r
 */
public class key {

    /**
     * Automatically generate SSH keys.
     *
     * @return SSH public and private key
     * @throws Exception exception thrown
     */
    public SshPublicPrivateKey generateSSHKeys() throws Exception {
        JSch jsch = new JSch();
        KeyPair keyPair = KeyPair.genKeyPair(jsch, KeyPair.RSA);
        ByteArrayOutputStream privateKeyBuff = new ByteArrayOutputStream(2048);
        ByteArrayOutputStream publicKeyBuff = new ByteArrayOutputStream(2048);

        keyPair.writePublicKey(publicKeyBuff, "CloudManager");

        keyPair.writePrivateKey(privateKeyBuff);

        System.out.println(publicKeyBuff.toString());
        return new SshPublicPrivateKey(privateKeyBuff.toString(), publicKeyBuff.toString());
    }

}
