package com.idc.server;

import com.idc.api.interfaces.RPCRegistryCenter;
import com.idc.api.interfaces.impl.RPCRegisterCenterImpl;
import com.idc.server.service.MessageServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RpcServerApplicationTests {

    @Test
    public void contextLoads() {
        // 新建服务功能
        MessageServiceImp messageServiceImp = new MessageServiceImp();
        //发布卖煎饼的服务，注册在11234端口
//        try {
//            System.out.println("服务器发布了新的服务!");
//            RPCServer.export(11234, messageServiceImp);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // new version
        RPCRegistryCenter rpcRegistryCenter = new RPCRegisterCenterImpl();

        // address
        String address = "127.0.0.1:11234";
        RPCServer rpcServer = new RPCServer(rpcRegistryCenter, address);

        // blind service
        rpcServer.bind(new MessageServiceImp());

        // publish
//        rpcServer.new_export();
    }

}
