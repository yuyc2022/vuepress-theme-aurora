package xyz.xcye.admin.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.xcye.admin.po.Permission;
import xyz.xcye.service.base.BaseDao;

/**
 * @author xcye <br/>
 * @table permission <br/>
 * @description permission 数据表DAO层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 */

@Mapper
public interface AuroraPermissionDao extends BaseDao<Permission> {

}