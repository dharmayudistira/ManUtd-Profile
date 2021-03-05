package com.pandecode.manutdprofile.util

import com.pandecode.manutdprofile.R
import com.pandecode.manutdprofile.model.Country
import com.pandecode.manutdprofile.model.Player
import com.pandecode.manutdprofile.model.Position

object PlayerGenerator {

    fun getAllPlayer() : List<Player> {
        return listOf(
            Player(
                photo = R.drawable.de_gea_photo,
                backdropPhoto = R.drawable.de_gea_backdrop,
                name = "David De Gea",
                backNumber = "01",
                positionName = Position.GOALKEEPER.position,
                positionIcon = Position.GOALKEEPER.icon,
                dateOfBirth = "7 November 1990",
                dateOfJoin = "29 June 2011",
                countryName = Country.SPAIN.country,
                countryIcon = Country.SPAIN.icon,
                biography = "When Sir Alex Ferguson signed the Spaniard to replace the outgoing Edwin van der Sar, the youngster was immediately thrust into the limelight. However, having already helped Atletico Madrid to win the Europa League in 2009/10 and the UEFA Super Cup thereafter, he was more than up to the task. His first season at United saw him unfairly scrutinised by sections of the media at every turn, but he adapted to the English game to show his true colours.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.sergio_romero_photo,
                backdropPhoto = R.drawable.sergio_romero_backdrop,
                name = "Sergio Romero",
                backNumber = "22",
                positionName = Position.GOALKEEPER.position,
                positionIcon = Position.GOALKEEPER.icon,
                dateOfBirth = "22 February 1987",
                dateOfJoin = "27 July 2015",
                countryName = Country.ARGENTINA.country,
                countryIcon = Country.ARGENTINA.icon,
                biography = "Romero joined United as a free agent in the summer of 2015 and enjoyed an impressive maiden campaign, keeping six clean sheets in 10 appearances. Though he was largely used as back-up to De Gea, Romero proved his worth when called upon by former boss Louis van Gaal, who previously managed Romero at Dutch club AZ Alkmaar.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.victor_lindelof_photo,
                backdropPhoto = R.drawable.victor_lindelof_backdrop,
                name = "Victor Lindelof",
                backNumber = "02",
                positionName = Position.DEFENDER.position,
                positionIcon = Position.DEFENDER.icon,
                dateOfBirth = "17 July 1994",
                dateOfJoin = "1 July 2017",
                countryName = Country.SWEDEN.country,
                countryIcon = Country.SWEDEN.icon,
                biography = "Lindelof had only been introduced to the squad as a late call-up but performed with distinction at right-back, earning a place in UEFA\'s Team of the Tournament. It helped provide added impetus to his club career as he forced his way into the senior Benfica side and enjoyed experience in the domestic top flight and Champions League.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.eric_bailly_photo,
                backdropPhoto = R.drawable.eric_bailly_backdrop,
                name = "Eric Bailly",
                backNumber = "03",
                positionName = Position.DEFENDER.position,
                positionIcon = Position.DEFENDER.icon,
                dateOfBirth = "12 April 1994",
                dateOfJoin = "8 June 2016",
                countryName = Country.IVORY_COAST.country,
                countryIcon = Country.IVORY_COAST.icon,
                biography = "Bailly\'s quality as an aspiring footballer was spotted by Spanish outfit Espanyol during a youth tournament held in Burkina Faso. He was signed by the Catalan club in December 2011 and joined their youth system at 17, but it was 10 months before he received a work permit enabling him to play.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.phil_jones_photo,
                backdropPhoto = R.drawable.phil_jones_backdrop,
                name = "Phil Jones",
                backNumber = "04",
                positionName = Position.DEFENDER.position,
                positionIcon = Position.DEFENDER.icon,
                dateOfBirth = "21 February 1992",
                dateOfJoin = "1 July 2011",
                countryName = Country.ENGLAND.country,
                countryIcon = Country.ENGLAND.icon,
                biography = "A dogged, brave and talented centre-back, and a player who can also play at full-back and drop into midfield when needed, Jones has been unlucky to see his United career punctuated by spells of injury and illness. But that hasn’t stopped him becoming an important player for both club and country.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.luke_shaw_photo,
                backdropPhoto = R.drawable.luke_shaw_backdrop,
                name = "Luke Shaw",
                backNumber = "23",
                positionName = Position.DEFENDER.position,
                positionIcon = Position.DEFENDER.icon,
                dateOfBirth = "12 July 1995",
                dateOfJoin = "2 June 2014",
                countryName = Country.ENGLAND.country,
                countryIcon = Country.ENGLAND.icon,
                biography = "Shaw then rose through the ranks and made his first-team debut in 2012, aged 16. He went on to nail down the left-back spot at the club, as he flourished under the tutelage of Nigel Adkins and Mauricio Pochettino, eventually amassing 67 appearances for the Saints before leaving for United.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.paul_pogba_photo,
                backdropPhoto = R.drawable.paul_pogba_backdrop,
                name = "Paul Pogba",
                backNumber = "06",
                positionName = Position.MIDFIELDER.position,
                positionIcon = Position.MIDFIELDER.icon,
                dateOfBirth = "15 Maret 1993",
                dateOfJoin = "8 August 2016",
                countryName = Country.FRANCE.country,
                countryIcon = Country.FRANCE.icon,
                biography = "Born in Lagny-sur-Marne on the outskirts of Paris, he started to attract attention as a schoolboy with Le Havre, before United eventually won the race for his signature. Paul went on to become a key member of the Under-18s team, and was a driving force in the FA Youth Cup-winning side of 2011.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.juan_mata_photo,
                backdropPhoto = R.drawable.juan_mata_backdrop,
                name = "Juan Mata",
                backNumber = "08",
                positionName = Position.MIDFIELDER.position,
                positionIcon = Position.MIDFIELDER.icon,
                dateOfBirth = "28 April 1988",
                dateOfJoin = "25 January 2014",
                countryName = Country.SPAIN.country,
                countryIcon = Country.SPAIN.icon,
                biography = "The Reds\' no.8 has asserted himself as one of our key performers during his time at Old Trafford, regularly contributing important goals and assists. That includes a stunning scissor kick at Liverpool in March 2015, and his display on Merseyside was nothing short of mesmeric. Performances like these elevated Juan to the status of a fans\' favourite.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.andreas_pereira_photo,
                backdropPhoto = R.drawable.andreas_pereira_backdrop,
                name = "Andreas Pereira",
                backNumber = "15",
                positionName = Position.MIDFIELDER.position,
                positionIcon = Position.MIDFIELDER.icon,
                dateOfBirth = "1 January 1996",
                dateOfJoin = "1 July 2012",
                countryName = Country.BRAZIL.country,
                countryIcon = Country.BRAZIL.icon,
                biography = "By being involved with the Under-21 squad at the end of 2012/13, it was clear that, even then, he was held in very high regard within the Aon Training Complex. And the young schemer scored on his first full appearance at that level, curling home the winner in the clash against West Ham United at Old Trafford.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.bruno_fernandes_photo,
                backdropPhoto = R.drawable.bruno_fernandes_backdrop,
                name = "Bruno Fernandes",
                backNumber = "18",
                positionName = Position.MIDFIELDER.position,
                positionIcon = Position.MIDFIELDER.icon,
                dateOfBirth = "8 September 1994",
                dateOfJoin = "30 January 2020",
                countryName = Country.PORTUGUESE.country,
                countryIcon = Country.PORTUGUESE.icon,
                biography = "A youth product at Boavista, the midfielder signed for Serie B club in Novara in August 2012, at the age of 17. Initially suffering from homesickness, he eventually grew into his new environment, teaching himself Italian and helping the Blues to fifth position, before joining Udinese in Italy\'s top tier.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.nemanja_matic_photo,
                backdropPhoto = R.drawable.nemanja_matic_backrop,
                name = "Nemanja Matic",
                backNumber = "31",
                positionName = Position.MIDFIELDER.position,
                positionIcon = Position.MIDFIELDER.icon,
                dateOfBirth = "1 August 1988",
                dateOfJoin = "31 July 2017",
                countryName = Country.SERBIA.country,
                countryIcon = Country.SERBIA.icon,
                biography = "The Serbia international may share four syllables of his name with a fellow countryman who made a hugely endearing impact at Old Trafford, Nemanja Vidic, but he is a very different type of footballer. Tough, yes, but rather than being an out-and-out warrior like the former centre-back, he\'s a world-class holding midfielder who screens the defence and allows other attacking players to flourish.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.edinson_cavani_photo,
                backdropPhoto = R.drawable.edinson_cavani_backdrop,
                name = "Edinson Cavani",
                backNumber = "07",
                positionName = Position.FORWARD.position,
                positionIcon = Position.FORWARD.icon,
                dateOfBirth = "14 February 1987",
                dateOfJoin = "5 October 2020",
                countryName = Country.URUGUAY.country,
                countryIcon = Country.URUGUAY.icon,
                biography = "Raised in Salto, in the north-west of his home country, Cavani\'s top-level career began in earnest after a promising showing at the 2007 South American Under-20 Championship, where he scored seven goals as Uruguay finished third, behind Brazil and Argentina.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.anthony_martial_photo,
                backdropPhoto = R.drawable.anthony_martial_backdrop,
                name = "Anthony Martial",
                backNumber = "09",
                positionName = Position.FORWARD.position,
                positionIcon = Position.FORWARD.icon,
                dateOfBirth = "5 December 1995",
                dateOfJoin = "1 September 2015",
                countryName = Country.FRANCE.country,
                countryIcon = Country.FRANCE.icon,
                biography = "Martial began his career in the junior ranks of CO Les Ulis, where Henry and ex-Red Patrice Evra both started their illustrious careers. At the age of 14, he joined Lyon and became a regular for the France youth sides, earning a reputation as one of Europe\'s hottest prospects. His excellent potential was so obvious that Monaco paid €5million for his signature in a transfer that rocked French football.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.marcus_rashford_photo,
                backdropPhoto = R.drawable.marcus_rashford_backdrop,
                name = "Marcus Rashford",
                backNumber = "10",
                positionName = Position.FORWARD.position,
                positionIcon = Position.FORWARD.icon,
                dateOfBirth = "31 October 1997",
                dateOfJoin = "1 July 2014",
                countryName = Country.ENGLAND.country,
                countryIcon = Country.ENGLAND.icon,
                biography = "The homegrown youth product has already come such a long way in a short time and having the happy knack of scoring on his debuts has helped. He netted twice against Midtjylland when thrust into the spotlight in a Europa League tie and followed it up with a brace against Arsenal on his Premier League bow.",
                isFavorite = false
            ),
            Player(
                photo = R.drawable.mason_greenwood_photo,
                backdropPhoto = R.drawable.mason_greenwood_backdrop,
                name = "Mason Greenwood",
                backNumber = "11",
                positionName = Position.FORWARD.position,
                positionIcon = Position.FORWARD.icon,
                dateOfBirth = "1 October 2001",
                dateOfJoin = "1 July 2018",
                countryName = Country.ENGLAND.country,
                countryIcon = Country.ENGLAND.icon,
                biography = "Mason was top scorer in the Under-18 Premier League North in 2017/18, while still a schoolboy and being eligible for Under-16 level. He finished the season with 17 goals from 17 starts, plus a further four outings as a substitute, and was awarded Player of the Tournament when the Reds won the ICGT trophy in the Netherlands, despite being the youngest member of the squad.",
                isFavorite = false
            )
        )
    }
}