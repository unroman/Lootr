package noobanidus.mods.lootr;

import net.fabricmc.api.ModInitializer;
import noobanidus.mods.lootr.event.ServerEvents;

public class LootrFabric implements ModInitializer {
  static {
    ServerEvents.load();
  }

  @Override
  public void onInitialize() {
    Lootr.init();
  }
}