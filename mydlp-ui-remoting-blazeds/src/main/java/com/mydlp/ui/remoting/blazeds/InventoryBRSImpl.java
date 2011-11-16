package com.mydlp.ui.remoting.blazeds;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

import com.mydlp.ui.dao.InventoryDAO;
import com.mydlp.ui.domain.InventoryCategory;

@Service("inventoryBRS")
@RemotingDestination
public class InventoryBRSImpl implements InventoryBRS
{
	@Autowired
	protected InventoryDAO inventoryDAO;
	
	public InventoryDAO getInventoryDAO() {
		return inventoryDAO;
	}

	public void setInventoryDAO(InventoryDAO inventoryDAO) {
		this.inventoryDAO = inventoryDAO;
	}

	@Override
	public List<InventoryCategory> getInventory() {
		return getInventoryDAO().getInventory();
	}


}