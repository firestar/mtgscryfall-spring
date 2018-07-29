package com.synload.mtg.backend.database.models.mtg;

import com.synload.mtg.backend.api.utils.*;

import java.util.List;
import java.util.Map;

public class MTGCardFace {
  @APIMapping({"name"})
  public String name;

  @APIMapping({"type_line"})
  public String type;

  @APIMapping({"oracle_text"})
  public String oracle;

  @APIMapping({"flavor_text"})
  public String flavor;

  @APIMapping({"colors"})
  public List<String> colors;

  @APIMapping({"power"})
  public String power;

  @APIMapping({"toughness"})
  public String toughness;

  @APIMapping({"image_uris"})
  public Map<String, String> images;

  @APIMapping({"mana_cost"})
  public String mana;
}
