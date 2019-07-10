/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.cloud.hetzner;

import java.util.ArrayList;
import java.util.List;
import me.tomsdevsn.hetznercloud.objects.general.Datacenter;
import me.tomsdevsn.hetznercloud.objects.general.ServerType;
import me.tomsdevsn.hetznercloud.objects.general.Image;
import me.tomsdevsn.hetznercloud.objects.general.Server;

/**
 *
 * @author markus
 */
public class get extends api {

    public List<Server> allServers() {
        return cloudAPI.getServers().getServers();
    }

    public Server serverByID(int id) {
        return cloudAPI.getServerById(id).getServer();
    }

    public List<Server> serverByName(String name) {
        return cloudAPI.getServerByName(name).getServers();
    }

    public List<String> getIPs() {
        List<String> ip = new ArrayList<>();
        for (Server server : cloudAPI.getServers().getServers()) {
            ip.add(server.getPublicNet().getIpv4().getIp());
        }
        return ip;
    }
    
    public List<Datacenter> allDC(){
        return cloudAPI.getDatacenters().getDatacenters();
    }
    
    public List<Datacenter> allDCs(){
        List<Datacenter> dcs = new ArrayList<Datacenter>();
        for(Datacenter d : cloudAPI.getDatacenters().getDatacenters()){
            dcs.add(d);
        }
        return dcs;
    }
    
    public Datacenter DCByID(long id){
        return cloudAPI.getDatacenter(id).getDatacenter();
    }
    
    public List<Image> allOSImages(){
        return cloudAPI.getImages().getImages();
    }
    
    public List<ServerType> serverTypes(){
        return cloudAPI.getServerTypes().getServerTypes();
    }
    
    public List<ServerType> serverTypebyName(String name){
        return cloudAPI.getServerTypeByName(name).getServerTypes();
    }
}
