package br.com.munif.encatman.api;

import br.com.munif.encatman.application.service.EnqueteService;
import br.com.munif.encatman.domain.model.Enquete;
import gumga.framework.application.GumgaService;
import gumga.framework.presentation.GumgaAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMethod;
import gumga.framework.presentation.RestResponse;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.validation.BindingResult;
import gumga.framework.application.GumgaTempFileService;
import gumga.framework.core.QueryObject;
import gumga.framework.core.SearchResult;
import gumga.framework.domain.domains.GumgaImage;
import gumga.framework.presentation.GumgaAPI;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/enquete")
public class EnqueteAPI extends GumgaAPI<Enquete, Long> {


    @Autowired
    public EnqueteAPI(GumgaService<Enquete, Long> service) {
        super(service);
    }

    @Override
    @Transactional
    public Enquete load(@PathVariable Long id) {
        return ((EnqueteService)service).loadEnqueteFat(id);
    }

    @Override
    @Transactional
    public SearchResult<Enquete> pesquisa(QueryObject qo) {
        return super.pesquisa(qo); //To change body of generated methods, choose Tools | Templates.
    }
    
    


}
