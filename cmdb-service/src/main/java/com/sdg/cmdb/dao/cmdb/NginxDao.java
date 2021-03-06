package com.sdg.cmdb.dao.cmdb;


import com.sdg.cmdb.domain.nginx.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface NginxDao {

    /**
     * 获取vhost数目
     *
     * @param serverName
     * @return
     */
    long getVhostSize(
            @Param("serverName") String serverName);


    /**
     * 获取vhost详情
     *
     * @param serverName
     * @param pageStart
     * @param length
     * @return
     */
    List<VhostDO> getVhostPage(
            @Param("serverName") String serverName,
            @Param("pageStart") long pageStart, @Param("length") int length);

    VhostDO getVhost(@Param("id") long id);


    int addVhost(VhostDO vhostDO);

    int delVhost(@Param("id") long id);

    int updateVhost(VhostDO vhostDO);


    List<VhostEnvDO> queryVhostEnvByVhostId(@Param("vhostId") long vhostId);

    VhostEnvDO getVhostEnv(@Param("id") long id);

    int addVhostEnv(VhostEnvDO vhostEnvDO);

    int delVhostEnv(@Param("id") long id);

    int updateVhostEnv(VhostEnvDO vhostEnvDO);

    List<EnvFileDO> queryEnvFileByEnvId(@Param("envId") long envId);

    EnvFileDO getEnvFile(@Param("id") long id);

    int addEnvFile(EnvFileDO envFileDO);

    int delEnvFile(@Param("id") long id);

    int updateEnvFile(EnvFileDO envFileDO);


    int addVhostServerGroup(VhostServerGroupDO vhostServerGroupDO);

    List<VhostServerGroupDO> queryVhostServerGroupByVhostId(@Param("vhostId") long vhostId);

    int delVhostServerGroup(@Param("id") long id);

    List<NginxPlaybookDO> queryPlaybookPage();

    NginxPlaybookDO getPlaybook(@Param("id") long id);

    int addPlaybook(NginxPlaybookDO nginxPlaybookDO);

    int updatePlaybook(NginxPlaybookDO nginxPlaybookDO);

    int delPlaybook(@Param("id") long id);

    int addNginxTcp(NginxTcpDO nginxTcpDO);


    NginxTcpDO checkNginxTcp(NginxTcpDO nginxTcpDO);

    NginxTcpDO getNginxTcp(@Param("id") long id);

    int updateNginxTcpFinished(NginxTcpDO nginxTcpDO);

    List<NginxTcpDO> queryNginxTcpAll(@Param("envType") int envType);

    int getNginxTcpSize(
            @Param("isAdmin") boolean isAdmin,
            @Param("username") String username,
            @Param("serviceName") String serviceName,
            @Param("envType") int envType);

    List<NginxTcpDO> getNginxTcpPage(
            @Param("isAdmin") boolean isAdmin,
            @Param("username") String username,
            @Param("serviceName") String serviceName,
            @Param("envType") int envType,
            @Param("pageStart") long pageStart, @Param("length") int length);


    NginxTcpDubboDO getNginxTcpDubboByKey(@Param("clusterKey") String clusterKey, @Param("dubbo") String dubbo);

    int addNginxTcpDubbo(NginxTcpDubboDO nginxTcpDubboDO);

    List<NginxTcpDubboDO> queryNginxTcpDubbo(@Param("clusterKey") String clusterKey);

    int delNginxTcpDubbo(@Param("id") long id);


}
