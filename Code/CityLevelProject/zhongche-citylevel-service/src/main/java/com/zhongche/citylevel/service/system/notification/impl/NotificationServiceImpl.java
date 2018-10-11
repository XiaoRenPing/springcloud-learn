package com.zhongche.citylevel.service.system.notification.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.zhongche.citylevel.constants.CommonConst;
import com.zhongche.citylevel.dao.SysUserNotificationsMapper;
import com.zhongche.citylevel.dto.notification.NotificationsQueryDto;
import com.zhongche.citylevel.entity.SysUserNotifications;
import com.zhongche.citylevel.entity.SysUserNotificationsExample;
import com.zhongche.citylevel.entity.SysUsers;
import com.zhongche.citylevel.service.base.BaseService;
import com.zhongche.citylevel.service.system.notification.INotificationService;
import com.zhongche.citylevel.utils.UWException;

/**
 * 系统消息业务服务
 * 
 * @ClassName: NotificationServiceImpl
 * @Description:
 * @author 肖仁枰
 * @date 2018年8月13日
 */
@Service("notificationService")
public class NotificationServiceImpl extends BaseService implements INotificationService {

	@Autowired
	SysUserNotificationsMapper notificationDao;
	
	/**
	 * 给用户添加消息提醒
	 * <p>Title: addSysUserNotifications</p>   
	 * <p>Description: </p>   
	 * @param id
	 * @param message   
	 * @see com.zhongche.citylevel.service.system.notification.INotificationService#addSysUserNotifications(java.lang.Long, java.lang.String)
	 */
	public void addSysUserNotifications(Long userId, String message) {
		SysUserNotifications sysUserNotifications = new SysUserNotifications();
		sysUserNotifications.setUserid(userId);
		sysUserNotifications.setMessage(message);
		sysUserNotifications.setCreationtime(new Date());
		sysUserNotifications.setState(CommonConst.NUM_0);
		notificationDao.insertSelective(sysUserNotifications);
	}

	public PageInfo<SysUserNotifications> findNotificationsInfoPage(NotificationsQueryDto jobQueryDto) {
		SysUserNotificationsExample sysUserNotificationsExample = new SysUserNotificationsExample();
		SysUserNotificationsExample.Criteria sysUserNotificationsCriteria = sysUserNotificationsExample.createCriteria();
		if(jobQueryDto.getContent() != null) {
			sysUserNotificationsCriteria.andMessageLike(this.fullLike(jobQueryDto.getContent()));
		}
		//initPage(jobQueryDto);
		List<SysUserNotifications> sysUserNotificationsList = notificationDao.selectByExample(sysUserNotificationsExample); 
		return new PageInfo<SysUserNotifications>(sysUserNotificationsList);
	}

	public Integer saveNotifications(SysUserNotifications sysUserNotifications) {
		return notificationDao.insertSelective(sysUserNotifications);
	}

	public Integer updateNotificationsInfo(SysUserNotifications sysUserNotifications) {
		return notificationDao.updateByPrimaryKeySelective(sysUserNotifications);
	}

	public Integer deleteNotifications(Long id) {
		return notificationDao.deleteByPrimaryKey(id);
	}

	/**
	 * 我的消息
	 */
	public PageInfo<SysUserNotifications> findNotificationByUser(NotificationsQueryDto jobQueryDto, HttpServletRequest request) {
		//接收人
		SysUsers sessionUser = (SysUsers) request.getSession().getAttribute("sessionUser");
		if(sessionUser == null) {
			throw new UWException("您的登录失效，请重新登录！");
		}
		SysUserNotificationsExample sysUserNotificationsExample = new SysUserNotificationsExample();
		SysUserNotificationsExample.Criteria sysUserNotificationsCriteria = sysUserNotificationsExample.createCriteria();
		sysUserNotificationsCriteria.andCreatoruseridEqualTo(sessionUser.getId());
		if(jobQueryDto.getContent() != null) {
			sysUserNotificationsCriteria.andMessageLike(this.fullLike(jobQueryDto.getContent()));
		}
		//initPage(jobQueryDto);
		List<SysUserNotifications> sysUserNotificationsList = notificationDao.selectByExample(sysUserNotificationsExample); 
		return new PageInfo<SysUserNotifications>(sysUserNotificationsList);
	}

	

	
}
