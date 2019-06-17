/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.models;

/**
 *
 * @author hax0r
 */
/**
 * Internal class to retain the generate SSH keys.
 */
public class SshPublicPrivateKey {

    private String sshPublicKey;
    private String sshPrivateKey;

    /**
     * Constructor.
     *
     * @param sshPrivateKey SSH private key
     * @param sshPublicKey SSH public key
     */
    public SshPublicPrivateKey(String sshPrivateKey, String sshPublicKey) {
        this.sshPrivateKey = sshPrivateKey;
        this.sshPublicKey = sshPublicKey;
    }

    /**
     * Get SSH public key.
     *
     * @return public key
     */
    public String getSshPublicKey() {
        return sshPublicKey;
    }

    /**
     * Get SSH private key.
     *
     * @return private key
     */
    public String getSshPrivateKey() {
        return sshPrivateKey;
    }

    /**
     * Set SSH public key.
     *
     * @param sshPublicKey public key
     */
    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }

    /**
     * Set SSH private key.
     *
     * @param sshPrivateKey private key
     */
    public void setSshPrivateKey(String sshPrivateKey) {
        this.sshPrivateKey = sshPrivateKey;
    }
}
