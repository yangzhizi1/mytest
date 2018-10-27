package com.itheima.Servict;

import com.itheima.Model.Items;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ServiceDome {
      List<Items> seleItems();
      List<Items> selectId(int id);
}

