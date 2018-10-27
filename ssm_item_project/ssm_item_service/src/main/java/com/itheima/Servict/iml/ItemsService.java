package com.itheima.Servict.iml;

import com.itheima.Dao.DaoMome;
import com.itheima.Model.Items;
import com.itheima.Servict.ServiceDome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ItemsService implements ServiceDome {
    @Autowired
    private DaoMome dao;
    public List<Items> seleItems() {
        return dao.selectItems();
    }

    public List<Items> selectId(int id) {
        return dao.selectid(id);
    }
}
