package com.trangile.prototype.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(transactionManager="ordersTransactionManager")
public class InventoryService {

}
