package legoset;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import movie.YearAdapter;

import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LegoSet {
    @XmlAttribute
    private int number;
    @XmlAttribute
    private URL url;

    private String name;
    private String theme;
    private String subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;
    private Packaging packaging;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    @XmlElement
    private Ratings ratings;
}