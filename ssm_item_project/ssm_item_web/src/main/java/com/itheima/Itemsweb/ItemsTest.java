package com.itheima.Itemsweb;

import com.itheima.Model.Items;
import com.itheima.Servict.ServiceDome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("acca")
public class ItemsTest {
    @Autowired
    private ServiceDome itemsService;


    @RequestMapping("ItemAll")
    public ModelAndView  select() {
        List<Items> items = itemsService.seleItems();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",items);
        mv.setViewName("itemsList");
        return mv;
    }
@RequestMapping("ItemAllid")
    public ModelAndView  seleid(int id) {
        List<Items> items = itemsService.selectId(id);
        ModelAndView mo  = new ModelAndView();
        mo.setViewName("editItems");
        mo.addObject("items",items);
        return mo;


    }
}
