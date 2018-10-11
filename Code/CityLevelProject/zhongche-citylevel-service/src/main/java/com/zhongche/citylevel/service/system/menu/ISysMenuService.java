package com.zhongche.citylevel.service.system.menu;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.github.pagehelper.PageInfo;
import com.zhongche.citylevel.dto.menu.SysMenuQueryDto;
import com.zhongche.citylevel.dto.menu.SysMenusExt;
import com.zhongche.citylevel.entity.SysMenu;

public interface ISysMenuService {

	String addSysMenu(SysMenu sysMenu);

	SysMenu findSysMenuById(Long id);

	String deleteSysMenu(Long id);

	PageInfo<SysMenu> pageListSysMenu(SysMenuQueryDto menuQueryDto);

	boolean updateSysMenu(SysMenu sysMenu);
	
	public List<SysMenu> getSubMenuList(Long parenId);

	List<SysMenusExt> findMenuByUser(HttpServletRequest request);

	SysMenusExt findParentMenuByCurrent(Long id);
}
