package com.fanya.p2p.front.user.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fanya.p2p.common.entity.SysOrganization;
import com.fanya.p2p.common.service.OrganizationService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-14
 * <p>Version: 1.0
 */
@Controller
@RequestMapping("/organization")
public class OrganizationController {
     /**
    @Reference
    private OrganizationService organizationService;

    @RequiresPermissions("organization:view")
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        return "organization/index";
    }

    @RequiresPermissions("organization:view")
    @RequestMapping(value = "/tree", method = RequestMethod.GET)
    public String showTree(Model model) {
        model.addAttribute("organizationList", organizationService.findAll());
        return "organization/tree";
    }

    @RequiresPermissions("organization:create")
    @RequestMapping(value = "/{parentId}/appendChild", method = RequestMethod.GET)
    public String showAppendChildForm(@PathVariable("parentId") Long parentId, Model model) {
        SysOrganization parent = organizationService.findOne(parentId);
        model.addAttribute("parent", parent);
        SysOrganization child = new SysOrganization();
        child.setParentId(parentId);
        child.setParentIds(parent.makeSelfAsParentIds());
        model.addAttribute("child", child);
        model.addAttribute("op", "新增");
        return "organization/appendChild";
    }

    @RequiresPermissions("organization:create")
    @RequestMapping(value = "/{parentId}/appendChild", method = RequestMethod.POST)
    public String create(SysOrganization organization) {
        organizationService.createOrganization(organization);
        return "redirect:/organization/success";
    }

    @RequiresPermissions("organization:update")
    @RequestMapping(value = "/{id}/maintain", method = RequestMethod.GET)
    public String showMaintainForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("organization", organizationService.findOne(id));
        return "organization/maintain";
    }

    @RequiresPermissions("organization:update")
    @RequestMapping(value = "/{id}/update", method = RequestMethod.POST)
    public String update(SysOrganization organization, RedirectAttributes redirectAttributes) {
        organizationService.updateOrganization(organization);
        redirectAttributes.addFlashAttribute("msg", "修改成功");
        return "redirect:/organization/success";
    }

    @RequiresPermissions("organization:delete")
    @RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
    public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
        organizationService.deleteOrganization(id);
        redirectAttributes.addFlashAttribute("msg", "删除成功");
        return "redirect:/organization/success";
    }


    @RequiresPermissions("organization:update")
    @RequestMapping(value = "/{sourceId}/move", method = RequestMethod.GET)
    public String showMoveForm(@PathVariable("sourceId") Long sourceId, Model model) {
        SysOrganization source = organizationService.findOne(sourceId);
        model.addAttribute("source", source);
        model.addAttribute("targetList", organizationService.findAllWithExclude(source));
        return "organization/move";
    }

    @RequiresPermissions("organization:update")
    @RequestMapping(value = "/{sourceId}/move", method = RequestMethod.POST)
    public String move(
            @PathVariable("sourceId") Long sourceId,
            @RequestParam("targetId") Long targetId) {
        SysOrganization source = organizationService.findOne(sourceId);
        SysOrganization target = organizationService.findOne(targetId);
        organizationService.move(source, target);
        return "redirect:/organization/success";
    }

    @RequiresPermissions("organization:view")
    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String success() {
        return "organization/success";
    }
    **/

}
