package io.realm.examples.appmodules.modules;

import io.realm.annotations.RealmModule;
import io.realm.examples.appmodules.model.Snake;
import io.realm.examples.appmodules.model.Spider;

@RealmModule(classes = {Snake.class, Spider.class})
public class CreepyAnimalsModule {
}
