package vn.edu.hust.organization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.hust.organization.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    Organization findByOrganizationCode(String organizationCode);
}
