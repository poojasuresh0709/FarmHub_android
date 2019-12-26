package com.android.farmapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat.WearableExtender;
import android.support.v4.media.TransportMediator;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.android.farmapp.BuildConfig;
import com.android.farmapp.Contact;
import com.android.farmapp.R;

public class Content extends ActionBarActivity {
    TextView Contentsdfd;
    TextView Items;
    TextView Subdescs;
    String item;
    String subdesc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_content);
        this.Items = (TextView) findViewById(R.id.textView4);
        this.Subdescs = (TextView) findViewById(R.id.textView5);
        this.Contentsdfd = (TextView) findViewById(R.id.textView6);
        Bundle bundleGetResult = getIntent().getExtras();
        this.item = bundleGetResult.getString("Itemsnew");
        this.subdesc = bundleGetResult.getString("subcont");
        this.Items.setText(this.item);
        setTitle(BuildConfig.FLAVOR);
        setcontenting();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_content, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                startActivity(new Intent(this, Contact.class));
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                return true;
            case R.id.send_feedback:
                Intent intent=new Intent(this,Feedback.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void setcontenting() {
        String str = this.item;
        switch (str) {
            case "banana":
                if (this.subdesc.equals("land_prepare")) {
                    this.Subdescs.setText("Land Prepare");
                    this.Contentsdfd.setText("Prior to planting banana, green manuring crop like daincha, cowpea etc. may be grown. The land can be ploughed 2-4 times and leveled. Ratovator or harrow is used to break the clod and bring the soil to a fine tilt. During soil preparation basal dose of FYM (about 50 tonnes/ha. before last harrowing) is added and thoroughly mixed into the soil.\n");
                } else if (this.subdesc.equals("Planting_material")) {
                    this.Subdescs.setText("Planting Material");
                    this.Contentsdfd.setText("About 70% of the farmers are using suckers as planting material while the rest 30% of the farmers are using tissue culture seedlings. Sword suckers with well-developed rhizome, conical or spherical in shape having actively growing conical bud and weighing approximately 450-700 gm are commonly used as propagating material.\n\ufffd\nSuckers generally may be infected with some pathogens and nematodes. Similarly due to the variation in age and size of sucker, crop is not uniform, harvesting is prolonged and management becomes difficult. Therefore, in-vitro clonal propagation i.e. Tissue culture plants are recommended for planting. They are healthy, disease free, uniform in growth and early yielding");
                } else if (this.subdesc.equals("Planting_season")) {
                    this.Subdescs.setText("Planting Season");
                    this.Contentsdfd.setText("Planting of tissue culture banana can be done throughout\ufffdthe year as per the market demand except when the temperature is too low or too high. The planting time may be adjusted so as to avoid high temperature and drought at the time of emergence of bunches (i.e. approx. 7-8 months after planting). The planting time for long duration cultivars is different from short duration ones.\n");
                } else if (this.subdesc.equals("Planting_Method")) {
                    this.Subdescs.setText("Planting Method");
                    this.Contentsdfd.setText("Pit planting is commonly followed in garden system of cultivation.\ufffdA pit size of 0.5 x 0.5 x 0.5 m. is normally required. Small pits are dug in case of ridges and furrows. The pits are to be refilled with topsoil mixed with 10 kg of FYM (well decomposed), 250 gm of neem cake and 20 gm of carbofuran. Prepared pits are left open for 15-20 days for solar radiation to kill all the insects, soil borne diseases and for aeration before refilling. In saline alkali soil where pH is above 8, pit mixture is to be modified incorporating organic matter and gypsum.\n\ufffd\nThe suckers are planted in the center of the pit and soil around is compacted. Plants are planted in the pits keeping pseudo stem 2cm below the ground level. Soil around the plant is gently pressed. Deep planting should be avoided. The field is irrigated immediately after planting\n");
                } else if (this.subdesc.equals("Nutrition")) {
                    this.Subdescs.setText("Nutrition");
                    this.Contentsdfd.setText("Banana requires high amount of nutrients, which are often supplied only in part by the soil. Nutrient requirement (worked out on all India basis) is 10 kg FYM, 200 - 250gm N; 60-70gm P; 300gm K/plant. Banana crop requires 7-8 Kg N, 0.7- 1.5 Kg P and 17-20 Kg K per metric ton yield. Traditionally farmers use more of urea and less of phosphorous and potash. Urea is applied in three to four split doses.\n\ufffd\nAbout 100 g. of N/plant as top dressing in three equal split doses 60, 90 and 120 days after planting.\ufffd\ufffdFurther application of 100 g. potash and also 40 g. of phosphorus are essential and applied at planting. Application of full dose of P and K at planting and N in three equal doses in shallow rings about 8-10 cm. deep are recommended.\n");
                } else if (this.subdesc.equals("irrigation")) {
                    this.Subdescs.setText("Irrigation");
                    this.Contentsdfd.setText("Banana being a succulent, evergreen and shallow rooted crop requires large quantity of water for increasing productivity. Water requirement of banana has been worked out to be 1,800 \ufffd 2,000 mm per annum. In winter, irrigation is provided at an interval of 7-8 days while in summer it should be given at an interval of 4-5 days. However, during rainy season irrigation is provided if required as excess irrigation will lead to root zone congestion due to removal of air from soil pores, thereby affecting plant establishment and growth. In all, about 70-75 irrigations are provided to the crop.\n\ufffd\nBanana production should be supported by an efficient irrigation system like drip irrigation.\ufffd\ufffdNormal furrows, basin and trench systems are followed. Application of drip irrigation and mulching technology has reported to improve water use efficiency. There is saving of 58% of water and increasing yield by 23-32% under drip. Besides, the system also enables efficient fertilizer application through the fertigation technique.\n");
                } else if (this.subdesc.equals("Diseases")) {
                    this.Subdescs.setText("Diseases");
                    this.Contentsdfd.setText("The main diseases reported are panama wilt (Fusarium oxysporum), anthracnose (Gleosporium musarum), leaf spot (Sigatoka) [Mycosphaarella musicola\ufffd&\ufffdCercospora musae] , shoot rot (Ceratostomella paradoxa) and viral diseases. Disease free planting material should be used and the infected plant parts destroyed. Spraying with 1 % Bordeaux, copper oxychloride or carbendazim in case of fungal infections has been found to give positive results");
                } else if (this.subdesc.equals("Harvesting_yield")) {
                    this.Subdescs.setText("Harvesting yield");
                    this.Contentsdfd.setText("Banana is harvested when the fruit is slightly or fully mature depending on the market preferences. For long distance transportation, harvesting is done at 75-80 % maturity.\ufffd\ufffdThe fruit is climacteric and can reach consumption stage after ripening operation");
                }
                break;
            case "cashew":
                if (this.subdesc.equals("land_prepare")) {
                    this.Subdescs.setText("Land Prepare");
                    this.Contentsdfd.setText("When selecting land for cashew, soils with salinity/alkalinity or waterlogging should be avoided. Soil depth, slope, course texture, soil fertility and water availability seem to impose very little limitations as cashew is a hardy crop. For establishing new plantations, land preparation should begin with the first pre-monsoon rains. Land should be cleared of shrub vegetation before digging pits for planting");
                } else if (this.subdesc.equals("Planting_material")) {
                    this.Subdescs.setText("Planting material");
                    this.Contentsdfd.setText("Pits are usually dug at the onset of the pre-monsoon rains to a size of 60cm x 60cm x 60cm in light to medium soils. If a hard substrate like laterite is present pits may be 1m x 1m to compensate for the lesser depth of soil. It is preferable to dig pits 15-20 days before planting to expose planting holes to direct sunlight which can help remove termites and other harmful insects that can damage young plants, if present. When filling, top soil mixed with compost (5 kg) or poultry manure (2 kg) and 200g of rock phosphate are placed in the pits. Contour planting is usually followed in sloping areas. Standard conservation measures need to be followed on steep lands when establishing cashew plantations.\nYoung plants are planted in the months of July-August. Most nurseries supply 5-12 month old grafted plants in polybags. At planting, the polythene bag is removed without disturbing the ball of earth and the roots. Care is taken to place the grafted plant in the pits leaving the graft joint at least 5 cm above ground level. Normally the scion is staked to avoid damage from wind and the support should remain up to the third year from planting. Most orchard growers use mulch around the planting hole to suppress weeds and conserve moisture.");
                } else if (this.subdesc.equals("Planting_season")) {
                    this.Subdescs.setText("Planting season");
                    this.Contentsdfd.setText("Planting of grafted plants is usually carried out during the monsoon season from July-August both in the west coast as well as in the east coast. Orchards should have pits dug to receive grafted plants well in advance of the main monsoon weather");
                } else if (this.subdesc.equals("Planting_Method")) {
                    this.Subdescs.setText("Planting Method");
                    this.Contentsdfd.setText("In the western and eastern coastal areas cashew is grown mostly on sloping land. A considerable amount of nutrient leaching and soil erosion are common in such situations. Growers have been advised to construct terraces and contour pits to conserve runoff water. Studies on the extent of root distribution revealed that 90 percent of the root system was confined to a radius of 2m and a depth of 1 m. In order to achieve maximum utilization of applied nutrients, fertilizer practices were confined to this part of the root zone. Before the advent of the south west monsoon in May-June, basins of about 1.5m radius are prepared for 2 year-old trees and subsequently widened to 2m in the third year. Terraces are made by removing the soil from the elevated portion above the tree trunks to create basins of 1.5-2m. Contour drains are also constructed to collect rain water above the tree-line and prevent soil wash from the slopes.");
                } else if (this.subdesc.equals("Nutrition")) {
                    this.Subdescs.setText("Nutrition");
                    this.Contentsdfd.setText("Application of 10-15 kg of farmyard manure or compost annually is generally recommended for cashew. In addition, the current fertilizer recommendation is 500g N (1.1 kg urea), 125g P\ufffd2O\ufffd5(625g rock phosphate) and 125g K\ufffd2\ufffdO (208g muriate of potash) per tree per year. This has increased production in the All India cashew trials carried out at the research centers. These trials also showed that the cashew responds well to increased N applications up to 750g. Since local NPK fertilizer mixtures do not deliver the required nutrients, application of straight fertilizer is recommended.\nFertilizer is applied annually at the end of the rainy season into a shallow trench at the drip line of trees. It is also recommended that fertilizer be applied in split doses during pre-monsoon (May-June) and post-monsoon (September-October) periods to assure better uptake of nutrients. If a single application is done, the post-monsoon period is more suitable when ground moisture is adequate. One third the recommended dose is applied in the first year, two third the dose in the second year and the full dose thereafter.\n");
                } else if (this.subdesc.equals("irrigation")) {
                    this.Contentsdfd.setText(BuildConfig.FLAVOR);
                } else if (this.subdesc.equals("Diseases")) {
                    this.Contentsdfd.setText(BuildConfig.FLAVOR);
                } else if (this.subdesc.equals("Harvesting_yield")) {
                    this.Subdescs.setText("Harvesting yield");
                    this.Contentsdfd.setText("Bearing commences after the third year of planting and the trees will be in full production by the tenth year whilst the economic life of a tree is about 20 years. The main harvesting season is from February to May. Most farmers harvest their crop before they drop to prevent pilferage. This very often results in poor quality of the kernels. The optimum stage of harvest is when nuts drop to the ground. High quality nuts are obtained when freshly fallen nuts are separated from the cashew apples and sun dried for 2-3 days to bring down the moisture percentage from about 25 percent to below 9 percent. It is very essential to dry the nuts in order to prevent spoilage during storage. The drying process helps to retain flavor and quality of the kernels. When cashew apples are used for processing, harvesting has to be carried out before they drop. A simple test of maturity is to float nuts in water when mature nuts will sink while the immature and unfilled nuts will float. Nuts are usually gathered every week during the harvest season. Cashew apples for the fresh fruit market should be harvested daily.\nNormally, about 92 % of the trees yield by the third year from planting. The average yield per tree increases from about 2 kg at 3-5 years to 4 kg at 6-10 years and 5-10 kg when trees are 11-15 years of age. Thereafter, trees yield in excess of 10 kg as the trees get older.\n");
                }
                break;
            case "coconut":
                if (this.subdesc.equals("land_prepare")) {
                    this.Subdescs.setText("Land Prepare");
                    this.Contentsdfd.setText("Climate and Soil\nThe coconut palm is found to grow under varying climatic and soil conditions. A rainfall of about 2000 mm per year, well distributed throughout, is ideal for proper growth and maximum production.\ufffdTemperature: Mean annual temperature of 27\ufffdC with a diurnal variation of\ufffd5-7\ufffdC is ideal - temperature <15\ufffdC results in abnormalities of the fruit\nCoconut is grown under different soil types such as loamy, laterite, coastal sandy, alluvial, clayey and reclaimed soils of the marshy low lands. The ideal soil conditions for better growth and performance of the palm are proper drainage, good water-holding capacity, and presence of water table within 3m and absence of rock or any hard substratum within 2m of the surface.\n");
                } else if (this.subdesc.equals("Planting_material")) {
                    this.Subdescs.setText("Planting material");
                    this.Contentsdfd.setText("Selection of Seed gardens\nGardens should have palms with a high proportion of heavy bearers but it should be kept in mind that this must not be from very favorable conditions Garden should be free from the incidence of diseases and not prone to severe attacks of pests.\nSelection of Mother palms\ufffd\nPalms should be regular bearers with annual yield of greater than 80 nuts and copra content not less than 150g/nut under rain fed condition (Irrigation-120 nuts/year). Palms should have reached full bearing stage and have been giving consistently high yields for at least four years. Avoid very old palms of above 60 years age. Palms which produce barren nuts or those shedding large number of immature nuts should be discarded\n\n\nSite Selection\nShallow soils with underlying hard rock, low lying areas subject to water stagnation and clayey soils are to be avoided. Proper supply of moisture either through well distributed rainfall or through irrigation should be ensured before planting.\nOn slopes and in areas of undulating terrain, prepare the land by contour terracing or bunding. In low-lying areas mounds are to be formed at planting site to a height of at least 1m above water level. In reclaimed \ufffdkayal\ufffd areas, seedlings are planted on field bunds.\ufffd\n\nIn loamy soils with low water table, a pit size of 1mx1mx1m is recommended. In laterite soils with underlying rocks, take larger pits of size 1.2m x 1.2m x 1.2m. In sandy soils the size need not exceed 0.75m x 0.75m x 0.75 m\n");
                } else if (this.subdesc.equals("Planting_season")) {
                    this.Subdescs.setText("Planting season");
                    this.Contentsdfd.setText("Seedlings can be transplanted in the beginning of the south west monsoon. If irrigation facilities are available, it is advisable to take up planting at least a month before the onset of the monsoon so that the seedlings get well established before heavy rains. Planting can also be taken up before the onset of the north-east monsoon. In low-lying areas subject to inundation during monsoon period, transplanting may be done after the cessation of the monsoon.\n");
                } else if (this.subdesc.equals("Planting_Method")) {
                    this.Subdescs.setText("Planting Method");
                    this.Contentsdfd.setText("Before planting the pits are filled up with top soil and powdered cow dung / compost up to a depth of 50 to 60 cm. Then take a small pit inside this, so as to accommodate the nut attached to the seedling. Plant the seedling inside this pit and fill up with soil. Press the soil well so as to avoid water stagnation. If there is chance for white-ant attack apply Sevidol 8G (5gm.) inside the small pit before planting.\ufffd\nIn laterite areas apply 2 kg common salt per pit for improving the physical condition of the soil. Burying 25 to 30 coconut husks per pit in layers will be useful for moisture conservation.\nCare of young Palms\nThe transplanted seedlings should be shaded and irrigated adequately during the summer months. Also provide staking so that winds may not uproot the young seedlings. For the first two years after planting, irrigate the seedling twice a week during the dry summer months. Shading is a must to the transplanted seedlings.\n");
                } else if (this.subdesc.equals("Nutrition")) {
                    this.Subdescs.setText("Nutrition");
                    this.Contentsdfd.setText("Irrigation\nSoil moisture very often limits coconut production in those areas where long spell of dry weather prevail or where the rainfall is scanty and ill-distributed. So irrigate the palms during summer months in basins around the palm. The irrigation requirement varies according to the soil type and climatic condition. Generally, an adult palm requires 600 to 800 liters of water once in four to seven days. Irrigate in basins of 1.8m radius and 10-20 cm depth. In coastal sandy soils, sea water can be used for irrigating adult palms. Do not irrigate seedlings and very young palms upto 2 year with sea water. In irrigated gardens interruption of irrigation would lead to serious set-back in yield and general condition of palms. Hence, when once started irrigation should be continued regularly and systematically. Drip irrigation is the best suited method of irrigation for coconut. It saves water, labour and energy.\n");
                } else if (this.subdesc.equals("irrigation")) {
                    this.Subdescs.setText("irrigation");
                    this.Contentsdfd.setText("Soil moisture very often limits coconut production in those areas where long spell of dry weather prevail or where the rainfall is scanty and ill-distributed. So irrigate the palms during summer months in basins around the palm. The irrigation requirement varies according to the soil type and climatic condition. Generally, an adult palm requires 600 to 800 liters of water once in four to seven days. Irrigate in basins of 1.8m radius and 10-20 cm depth. In coastal sandy soils, sea water can be used for irrigating adult palms. Do not irrigate seedlings and very young palms upto 2 year with sea water. In irrigated gardens interruption of irrigation would lead to serious set-back in yield and general condition of palms. Hence, when once started irrigation should be continued regularly and systematically. Drip irrigation is the best suited method of irrigation for coconut. It saves water, labour and energy.\n");
                } else if (this.subdesc.equals("Diseases")) {
                    this.Contentsdfd.setText(BuildConfig.FLAVOR);
                } else if (this.subdesc.equals("Harvesting_yield")) {
                    this.Subdescs.setText("Harvesting yield");
                    this.Contentsdfd.setText("On an average, coconut yields 44 nuts/palm/year. However, under scientific cultivation West Coast Tall gives 80 nuts/palm/year in coastal Kerala and Karnataka. The hybrids yield 100-140 nuts/palm/year. Coconuts ripen in 12-13 months from the opening of the inflorescence. To get maximum yield of copra and oil only fully mature nuts should be harvested. Immature nuts provide 6-33 and 5-33% less copra and oil respectively. Superior, golden-brown, quality fiber with elastic and good tungsten strength is obtained from 10-month-old nuts. The harvested nuts are stored in heaps under shade for a few days since the stored nuts are easy to husk. The moisture content of the meat decreases, whereas thickness of the meat layer increases. However, storage of harvested nuts is beneficial if fully matured nuts are harvested. Postharvest management of coconut involves its conversation into copra and coconut oil. Coconut husk is used to manufacture coir mat, cushion and other products");
                }
                break;
            case "jasmine":
                if (this.subdesc.equals("land_prepare")) {
                    this.Subdescs.setText("Land Prepare");
                    this.Contentsdfd.setText("Jasmine can be grown on a wide range of soils. Well drained sandy loams and red loams with a soil pH range between 6.5-7.5 are ideal for its cultivation");
                } else if (this.subdesc.equals("Planting_material")) {
                    this.Contentsdfd.setText(BuildConfig.FLAVOR);
                } else if (this.subdesc.equals("Planting_season")) {
                    this.Subdescs.setText("Planting season");
                    this.Contentsdfd.setText("It is a sun loving crop and prefers warm humid climate for its successful growth. It performs well at an elevation of 600 to 1200 m from sea level. The ideal planting time is from June to August. \ufffd");
                } else if (this.subdesc.equals("Planting_Method")) {
                    this.Subdescs.setText("Planting Method");
                    this.Contentsdfd.setText("Varieties\n1. Jasminum auriculatum Vahl. (Vasantha mallige/Parimullai/Co1 mullai): It is a shrub and flowers\ufffd\ufffd\ufffd\ufffd\ufffd \n\ufffd\ufffd\ufffd\ufffd\ufffd Throughout the year. The peak harvest can be had during the monsoon. Flowers are highly scented  and\ufffdpossess good essential oil recovery (0.24 to 0.42%). The flowers are used for extraction of essential oil. \ufffd \n\n2.\ufffd\ufffdJasminum grandiflorum Linn. (Jaji mallige/Ajjige): The plant is a semi creeper and bears fragrant flowers\ufffdfrom June to September. The essential oil content in the flowers ranges from 0.24 to 0.42 per cent. \ufffdArka Surabhi\ufffd is a variety released under this species from IIHR, Bangalore. \n\n\nCultivation\nPlough the land 3 to 4 times and bring it to a fine tilth. Dig pits of 30 cm cube (1 c.ft) maintaining a spacing of 1.5 x 1.5 m for Jali mallige. After the pits are ready, fill them with 20 kg. FYM along with equal quantity of top soil. Transplant rooted cuttings in the center of pits and irrigate. The best time for planting is any time between July and December. \ufffd \nPruning\nPruning is necessary to get high yield and to keep the bushes to manageable size, it is done once in a year during December. The shoots are cut to half their original length. Diseased leaves and dry shoots are also removed.\n");
                } else if (this.subdesc.equals("Nutrition")) {
                    this.Subdescs.setText("Nutrition");
                    this.Contentsdfd.setText("1.\ufffd\ufffd\ufffd\ufffd\ufffd Spray 2 ml oxydemeton methyl or 1 ml Monocrotophos with 3 g wettable sulphur in 1 litre of water\ufffd\n\ufffd\ufffd\ufffd\ufffd\ufffd Whenever pests and diseases are noticed.\n2.\ufffd\ufffd\ufffd\ufffd\ufffd Spray the plants with 1 ml of contaf in 1 litre or water for controlling leaf spot and leaf blight whenever\ufffd\n\ufffd\ufffd\ufffd\ufffd\ufffd noticed.\n3.\ufffd\ufffd\ufffd\ufffd\ufffd Spray 2 ml Malathion with 3 g wettable sulphur in 1 litre of water to control white flies, scales and mealy\ufffd\n\ufffd\ufffd\ufffd\ufffd\ufffd bugs.\n4.\ufffd\ufffd\ufffd\ufffd\ufffd Dust 5% Sulphur to control mite infestation.\n5.\ufffd\ufffd\ufffd\ufffd\ufffd Apply Furadon 3% granule at the rate of 10 g/pit and then plant the rooted cuttings to control nematodes. \ufffd ");
                } else if (this.subdesc.equals("irrigation")) {
                    this.Subdescs.setText("irrigation");
                    this.Contentsdfd.setText("Irrigate the plants once a week. After flowering no irrigation is normally required till after the next pruning and manuring. After pruning, the soil around the main stem should be stirred up to a depth of 15 cm. This should be repeated once in every two or three months. Keep the plot clean by removing the weeds as and when necessary. \ufffd ");
                } else if (this.subdesc.equals("Diseases")) {
                    this.Subdescs.setText("Diseases");
                    this.Contentsdfd.setText("Major insects\t   :    Red scale, mealy bug; jasmine bud; mite; leaf eating caterpillar and      \n         While files.\nMajor diseases:     Cercospora leaf spot, leaf blight, mildew and root knot nematode");
                } else if (this.subdesc.equals("Harvesting_yield")) {
                    this.Subdescs.setText("Harvesting yield");
                    this.Contentsdfd.setText("Indole is one of the constituent of perfumery importance present in buds. It is highly volatile. Fully opened, freshly collected flowers during early morning hours are used for extraction. The main flowering season in vasantha mallige is during the months of April to October and for Jaji mallige it is during June to September.\n\n");
                }
                break;
            case "jowar":
                if (this.subdesc.equals("land_prepare")) {
                    this.Subdescs.setText("Land Prepare");
                    this.Contentsdfd.setText("Soil- Well-drained, light to medium soils is suitable.  And is to be thoroughly ploughed. Small size graded channel cum bund could be of use for conservation of soil moisture.  ");
                } else if (this.subdesc.equals("Planting_material")) {
                    this.Subdescs.setText("Planting Material");
                    this.Contentsdfd.setText("Seed Rate: 3 kg/acre. Sowing Time \ufffd June-July (onset of monsoon) for Kharif and October-November for Rabi.  Spacing: 45 cms x 15 cms \n");
                } else if (this.subdesc.equals("Planting_season")) {
                    this.Subdescs.setText("Planting season");
                    this.Contentsdfd.setText("Rabi: September/October under rain fed conditions early around the middle of September is the ideal time for planting. If soil moisture is available planting can be extended up to the first week of October. compaction of soil immediately after sowing will help in proper emergence and establishment of seedlings");
                } else if (this.subdesc.equals("Planting_Method")) {
                    this.Subdescs.setText("Planting Method");
                    this.Contentsdfd.setText("During the last plough four tons FYM/acre can be applied.  20 kg N, 15 kg O2 P5 and 12 kg K2 O/ acre as basal dose and 15 kg N/acre as top dressing at 20-30 days after sowing.  Under irrigation fertilizer dose can be increased to 80N and 40 P kg/ha. N should be applied in two splits, 50% at sowing and 50% as top dose at 30 days after sowing.  If Zn deficiency is observed on standing crop spray ZnSo4 0.2% (2g/lit) twice or thrice at weekly intervals");
                } else if (this.subdesc.equals("Nutrition")) {
                    this.Subdescs.setText("Nutrition");
                    this.Contentsdfd.setText("Pest Control Stem borer: Apply lindane 6G granules on leaf whorls at 1.5kg/ha or spray endosulfan 35 EC (1000-1250ml). Earhead pests: Dust malathion 5% dust. Midge on earhead: Dust carbaryl 5%. Mites: Dust sulphur @ 25 kg/ha or spray 2.5 kg wettable sulphur ( 3g/lit) or kelthane 5ml/lit (500ml). ");
                } else if (this.subdesc.equals("irrigation")) {
                    this.Subdescs.setText("Irrigation");
                    this.Contentsdfd.setText("For successful crop, even under rain fed condition, one irrigation on 45 days after sowing is essential. For irrigated crop, weekly irrigation for light soils and once in 15 days for heavy black cotton soils is recommended.  Irrigation at flowering and grain filling stage is essential for a better harvest.\n");
                } else if (this.subdesc.equals("Diseases")) {
                    this.Subdescs.setText("Diseases");
                    this.Contentsdfd.setText("Disease control Grain smut, loose smut and Head smut: Treat seed with sulphur at 5g, thiram, or captan@ 4g/kg. Downy mildew: Treat seed with thiram @ 4g/kg of seed. Spray mancozeb (3g/lit). Use resistant varieties like CSH-1 and CSH-5");
                } else if (this.subdesc.equals("Harvesting_yield")) {
                    this.Subdescs.setText("Harvesting Yeild");
                    this.Contentsdfd.setText("Harvesting, Storage and Drying Ear heads should be harvested when the grain is ripe and dried in the layers. Earheads Should not is heaped to avoid the loss of seed viability.  Threshing may be done with mechanical threshers. Otherwise stone roller threshing or cattle threshing may be done. The grain should be stored in airtight containers like seed bins. Grain should be dried thoroughly before storing. Periodical drying of grain once a month will control the store grain pests like weevils");
                }
                break;
            default:
        }
    }
}
