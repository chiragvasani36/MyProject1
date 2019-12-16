package com.mindtree.gooddeed.service;

import java.util.List;

import com.mindtree.gooddeed.dto.CampusMindDTO;
import com.mindtree.gooddeed.dto.GoodDeedDTO;
import com.mindtree.gooddeed.dto.SupervisorDTO;

public interface GoodDeedService {

	boolean assignGoodDeed(CampusMindDTO campusmind, int id);

	List<CampusMindDTO> getAllMinds(int gid);

	List<GoodDeedDTO> getAllgooddeeds();

	SupervisorDTO getAllGoodDeeds(int superid);

}
