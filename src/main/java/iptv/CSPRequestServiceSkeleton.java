/**
 * CSPRequestServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package iptv;

import com.example.axis2demo.utls.AppUtil;
import com.example.axis2demo.utls.PrintLog;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  CSPRequestServiceSkeleton java skeleton for the axisService
 */

public class CSPRequestServiceSkeleton
    implements CSPRequestServiceSkeletonInterface  {

    private static ApplicationContext APPLICATION_CONTEXT;

    /**
     * Auto generated method signature
     *
     * @param execCmd0
     * @return execCmdResponse1
     */
    public ExecCmdResponse execCmd(ExecCmd execCmd0) {
        //TODO : fill this with the necessary business logic
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        ExecCmdResponse res = new ExecCmdResponse();




        PrintLog p = null;
         p  = (PrintLog)AppUtil.getObject("printLog");
        System.out.println("p:"+p);
        CSPResult result = new CSPResult();

        result.setResult(2000);
        org.apache.axis2.databinding.types.soapencoding.String desc = new org.apache.axis2.databinding.types.soapencoding.String();
        desc.setString("CmdFileURL:"+execCmd0.getCmdFileURL()+"时间"+df.format(new Date())+"---CSPID:"+execCmd0.getCSPID()+"---LSPID:"+execCmd0.getLSPID()+"---CorrelateID:"+execCmd0.getCorrelateID());
        System.out.println(desc);
        System.out.println(p.outLog());
        result.setErrorDescription(desc);
        res.setExecCmdReturn(result);
        return res;
        //throw new UnsupportedOperationException("Please implement " +
            //this.getClass().getName() + "#execCmd");
    }
}
