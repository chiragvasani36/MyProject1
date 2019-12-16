package com.mindtree.gooddeed.service.Imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.gooddeed.dto.CampusMindDTO;
import com.mindtree.gooddeed.dto.GoodDeedDTO;
import com.mindtree.gooddeed.dto.SupervisorDTO;
import com.mindtree.gooddeed.entity.CampusMind;
import com.mindtree.gooddeed.entity.GoodDeed;
import com.mindtree.gooddeed.entity.Supervisor;
import com.mindtree.gooddeed.repository.CampusMindRepository;
import com.mindtree.gooddeed.repository.GoodDeedRepository;
import com.mindtree.gooddeed.repository.SupervisorRepository;
import com.mindtree.gooddeed.service.GoodDeedService;

@Service
public class GoodDeedImplement implements GoodDeedService {
	@Autowired
	GoodDeedRepository goodrepository;
	@Autowired
	CampusMindRepository camprepository;
	@Autowired
	SupervisorRepository superrepository;

	@Override
	public boolean assignGoodDeed(CampusMindDTO campusmind, int id) {

		boolean check = false;
		GoodDeed gooddeed = goodrepository.getOne(id);
		CampusMind campus = new CampusMind();

		if (this.goodrepository.existsById(id)) {
			campus.setMid(campusmind.getMid());
			campus.setName(campusmind.getName());
			campus.setGooddeed(gooddeed);
			camprepository.save(campus);
			check = true;
		}
	
		return check;
	}

	@Override
	public List<CampusMindDTO> getAllMinds(int gid) {
		GoodDeed gooddeed = goodrepository.getOne(gid);
		List<CampusMindDTO> campusdto = new ArrayList<>();
		if (gid == gooddeed.getDeedId()) {
			for (CampusMind campusMind : gooddeed.getCampusmind()) {
				CampusMindDTO cdto = new CampusMindDTO();
				cdto.setMid(campusMind.getMid());
				cdto.setName(campusMind.getName());
				campusdto.add(cdto);
			}

		}
		return campusdto;
	}

	@Override
	public List<GoodDeedDTO> getAllgooddeeds() {
		List<GoodDeed> gooddeeds = goodrepository.findAll();
		List<GoodDeedDTO> gooddeeds1 = new ArrayList<GoodDeedDTO>();

		for (GoodDeed goodDeed : gooddeeds) {
			List<CampusMind> campus = goodDeed.getCampusmind();
			List<CampusMindDTO> cdto = new ArrayList<CampusMindDTO>();
			for (CampusMind campusMind : campus) {
				cdto.add(new CampusMindDTO(campusMind.getMid(), campusMind.getName(), null));
			}
			if (campus.size() <= 3) {
				gooddeeds1.add(new GoodDeedDTO(goodDeed.getDeedId(), goodDeed.getDeedName(), cdto));
			}
		}

		return gooddeeds1;
	}

	@Override
	public SupervisorDTO getAllGoodDeeds(int superid) {
		// TODO Auto-generated method stub
		Supervisor supervisor = superrepository.findById(superid).get();
		List<CampusMind> list = supervisor.getGooddeed().getCampusmind();
		List<CampusMindDTO> cdto = new ArrayList<CampusMindDTO>();
		for (CampusMind campusMind : list) {
			CampusMindDTO cdto1 = new CampusMindDTO(campusMind.getMid(), campusMind.getName());
			cdto.add(cdto1);
		}
		GoodDeedDTO gooddto = new GoodDeedDTO(supervisor.getGooddeed().getDeedId(),
				supervisor.getGooddeed().getDeedName(), cdto);
		SupervisorDTO sdto = new SupervisorDTO(supervisor.getSupervisorId(), supervisor.getSupervisorName(), gooddto);

		return sdto;
	}

}
