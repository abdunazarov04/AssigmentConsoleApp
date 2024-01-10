package uz.isystem.service.impl;

import uz.isystem.PersonTypeOnEnum.FoodsEnum;
import uz.isystem.PersonTypeOnEnum.WatersEnum;
import uz.isystem.been.ClientBeen;

public interface ClientService {
    void showClientTable();
    void showClientFoods(ClientBeen client);
    void showClientSum();
}
