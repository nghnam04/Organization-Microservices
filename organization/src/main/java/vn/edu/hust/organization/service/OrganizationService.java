package vn.edu.hust.organization.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.edu.hust.organization.dto.OrganizationDto;
import vn.edu.hust.organization.entity.Organization;
import vn.edu.hust.organization.mapper.OrganizationMapper;
import vn.edu.hust.organization.repository.OrganizationRepository;

@Service
@AllArgsConstructor
public class OrganizationService {
    private OrganizationRepository organizationRepository;

    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
