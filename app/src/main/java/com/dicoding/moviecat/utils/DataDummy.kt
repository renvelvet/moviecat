package com.dicoding.moviecat.utils

import com.dicoding.moviecat.data.MovieEntity
import com.dicoding.moviecat.data.ShowEntity
import java.util.ArrayList

object DataDummy {

    fun generateDummyShows(): List<ShowEntity> {
        val shows = ArrayList<ShowEntity>()

        shows.add(
            ShowEntity(
                1,
                "Girl from Nowhere",
                "A mysterious, clever girl named Nanno transfers to different schools, exposing the lies and misdeeds of the students and faculty at every turn.",
                "2018",
                "2 Seasons",
                "Kitty Chicha Amatayakul, Chanya McClory, Thanawetch Siriwattanakul",
                "Ominous, Gritty, Dark",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABYCFhGmgY2Rykn8Q1dIcrJV9saA_tWrVzWqXkwzT7Ln4tblld_Z0InhaFC-Dkac_eB_X2jFMw8BgYzURByeDKO9caHL-.jpg?r=a9e",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/tx1O544a9T7n8Z_G12qaboulQQE/AAAABb0JNUr-nsSZ8bJ7Ku0apLHHJtjcq3Y_MxLCVerbn47XdXsNagnSTiNEFVj80_g_p1O944hbssThpwJtF0TUDaw6j6caCQeQvPRlZm9a4H_H1wjBTFY0Weiy48GJvmTQV3i8ILYr7mbfmyVDd6lYgQbSubncvmbUHbuLIxzX0BGutw.png?r=2c9",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABfFP9bMS1Q6a_wi84j6JvXtaGyip-xH9hN45Uy7Juj_-So9siyAz389WdKKyLaqSLvxNyJQX3KbXFhGZ7mm2AeG_onOBo8lLyjELwq2b-WFhQ5SivS54j1aqpyjBNBGygv2X2DFbftoo-A9TRQuluz8r2r1Y4g.jpg?r=335"
            )
        )
        shows.add(
            ShowEntity(
                2,
                "Alice in Borderland",
                "An aimless gamer and his two friends find themselves in a parallel Tokyo, where they're forced to compete in a series of sadistic games to survive.",
                "2020",
                "1 Season",
                "Kento Yamazaki, Tao Tsuchiya, Nijiro Murakami",
                "Dark, Suspenseful",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABdNxJdlI9iXyyn_M_8sjMw0E818wDArjNdhMR_55KZrZQ7XBm6NymafPoePjhXVymMgQaJ_D8BVsTc01GVwsNXnhEU3s.jpg?r=601",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/tx1O544a9T7n8Z_G12qaboulQQE/AAAABYkYrteboHe0bXRkRLrdNrQc2BUzPPQ5lj_mZRD9HOT1zUHd-pf17M1ezX6Cr4kXvn-TxN025VcRZOtj5B_mGhBeV4q8aBhp_I2cpL-l9I25KeuIO2Lw0fOxvgI3Spaoawi3fksj00yqFm5Zgka59KDVdZe7pwKxinxHsWQ7dlhq7Q.png?r=0a3",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABZcs_dL1SVlkJTX3NHVymAWmpSnhjNGdXj-EJkY2mr65acQNCbHwc0wBibdb-MJPN29jTym2k0WsPVGTGpYMRvixUxfOZ9O6ImJDDMVeUE8J6QFb-9Q1KqQtgHBB.jpg?r=230"
            )
        )
        shows.add(
            ShowEntity(
                3,
                "Bridgerton",
                "During the Regency era in England, eight close-knit siblings of the powerful Bridgerton family attempt to find love.",
                "2020",
                "13 Episodes",
                "Chutimon Chuengcharoensukying, Chanon Santinatornkul, Teeradon Supapunpinyo",
                "Romance, Historical Film, Regency Romance",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABbccY7toV6K594I9gYLyxqSkc-_LmkYe1IOkZVzSZ9moEHC2jC1dC6MrFh1AOn39K2snrDS5whV6nvApvPy0k9deptBf.jpg?r=3d3",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/tx1O544a9T7n8Z_G12qaboulQQE/AAAABWJs3Oxazky13O_sq-4eJpl_9BLynya674Mha4awt78eE3b2f6TJpvWvrIxdt7VIJyupp0MSwAGiDTLTp64RuYKDCn7xzddNZHi4WrRjGBvcBhSAMyhEFX78dJNHazJGx8I_FSJpZe9ogpRSRrkxCNX1D_wy-UK5LMtlwIwPMUt4fg.png?r=704",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABa18G3tFqm2fWGrfkXzEGZ-6RgSioq6PS4HhmmeXbuZp1wBRqWtVgYmIXik8Iqi1RtKd1he2njteAmYOWwu9QqNL4ZYDuCFpL5z0GElSJNk75Lg7H18kWK3CJf_5.jpg?r=b24"
            )
        )
        shows.add(
            ShowEntity(
                4,
                "Go Ahead",
                "Three friends from troubled families form a unique, lasting bond — but their pasts soon cast a cloud over their lives.",
                "2020",
                "40 Episodes",
                "Seven Tan, Song Weilong, Steven Zhang",
                "Sentimental, Heartfelt, Emotional, Romantic",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABVuV8N_P17lOUZR28iFq05HJlW5WS4r509mdnssur7kXZQqEmMqG1VZKaKXXewKxpVTvUXKxoHJRlXFiIiwR-epja0fH.jpg?r=6b4",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABZjbW2OT3oSp3kHdz2lbkmqYiig7W07m5ZETGL9QZ7XTdWWEhXL9s51OPGXE8HcBtL9qgq_8hZWktUCvg0MfXJOVqNjBP4-bdoH0.png?r=129",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABUNJ7bRFRuWsUNtPaMuywcc6GTVga2237YCAazU7DGDr2wMegnMQ48a7JkeZPgXT4QI5aTtkEaqgh81kamAOBFM19XE.webp?r=0f8"
            )
        )
        shows.add(
            ShowEntity(
                5,
                "Hormones",
                "High school students in Bangkok wrestle with issues such as sex, teen pregnancy, drugs, school violence, family turmoil and more in this Thai drama.",
                "2013",
                "3 Seasons",
                "Pachara Chirathivat, Ungsumalynn Sirapatsakmetha, Sutatta Udomsilp",
                "Scandalous, Swoonworthy, Romantic",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABXhci-7hHlwMUT1c_c995n3ArO-x2-FPq3TG71a5vc3hg-XQryFSUMe4z76Ndg82E4E-MDd1fKkQO-_wrnh57RG8gJG5.jpg?r=1f1",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABYa0zhPOVOUsWbLHsGXoNsBCUEFyTaSTRWN-_YadlopHBKzpRH05jlpBPn9JF1QbzB8uE8c_-2rCv4XOskajO-050ZrmrT2O8jr4.png?r=fcc",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABQDmcfBZBpGPR4l1lv8K2K4tXUqUUyjupYmxKYQlQwzcc4Ukfgm5xVHu1ELpT3PiBBcbQAM0ncL8K81RNznZuHhQbng.webp?r=08e"
            )
        )
        shows.add(
            ShowEntity(
                6,
                "Extracurricular",
                "A model high school student who's steeped in a world of serious crime finds his double life upended when a classmate takes an interest in his secret.",
                "2020",
                "10 Episodes",
                "Kim Dong-hee, Jung Da-bin, Park Ju-hyun",
                "Crime TV Shows, Teen TV Shows, Korean TV Shows, TV Thrillers, TV Dramas",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABcYWogkUru45KRDP62tg_ZvlKu-2H5XtNrPdhRN5nSLOBBPCR032FLTAAsOwlv_tUi6p_0vPVd8KdtYaZFZ_z6mYGkXZ.jpg?r=8bf",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/tx1O544a9T7n8Z_G12qaboulQQE/AAAABcGCSC7KmCdPaInXhwQJud-k7U1gdN3QsLrXiMZB3BIivUWEgKPjqbLzPdS2uf4Y0hXTC6BjXRof9NPJ5oUfYkcm_J-AGVFzWa_ZCBy5hrukNCo2cI99vRooY6e9oPOBiQ-QrDnCW-rhaRBx00QABaRJksAyOibnu1tfxMm2_jtdaQ.png?r=e27",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABRqP5nLuBzR0jPNDoqbr-i_ZVcPotveV3AMW3ISwWmoZJE9wKIaf6pfoKcX1NHtnb1ff3sxRPtI8gE9XdraqjuIzPMlLRDxlIUirad2Le3aQYqfQPz6kAzNT_4yo.jpg?r=b2d"
            )
        )
        shows.add(
            ShowEntity(
                7,
                "The Uncanny Counter",
                "Noodle shop employees by day and demon hunters by night, the Counters use special abilities to chase down malevolent spirits that prey on humans.",
                "2020",
                "16 Episodes",
                "Cho Byeong-kyu, Yu Jun-sang, Kim Se-jeong",
                "K-dramas based on Webtoon, Fantasy TV Shows, Korean TV Shows, TV Thrillers, TV Dramas, TV Action & Adventure",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABWhcJz5Hl9wL6XKpQkq0K2HUP89hlUpYsCBwYUhJOnXRs0RIqiYO_a7fKUliS60wgS0YYxeyLYJEk9ouXp1GDtwnL-6t.jpg?r=02d",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/tx1O544a9T7n8Z_G12qaboulQQE/AAAABXqfFLDBgwuwtqerSEXs5piw4_7qdwL82ANcTttjRzVL8_djMDlEpODzFixRs-SR9EJ5L82LtoUjePag7Nng2k-o9v_h-faZtWox_kd0LL0FE9CULtB1xvAkmoptV7h83wV1vyqSbBcPwwRrfcrJCDT5mMgOjSMdLnIKUe03syyYOg.png?r=aff",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABUqVmmQK_xB06R98Rgip1EecdzWlq3Aiy78Az_koP3WnDAXZuQbbuWpgv8HjKZu8r5KYXUpbEVzTay6sJLbyZnNYYC-dE9q5JThgsPtx-o4WvJ4kgBJRRQCNZW10.jpg?r=033"
            )
        )
        shows.add(
            ShowEntity(
                8,
                "The Promised Neverland",
                "When three gifted kids learn that their isolated orphanage isn’t the haven they thought, they vow to lead the other children in a risky escape plan.",
                "2019",
                "12 Episodes",
                "Sumire Morohoshi, Maaya Uchida, Mariya Ise",
                "Mystery & Thriller Anime, TV Shows Based on Manga, Japanese TV Shows, TV Thrillers, Anime Series, Shounen Anime, Fantasy Anime",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABevXrU4FnXjAI9inqpf52zDBTLkgvjq1aMyjHiOlKnYLWo3eSlFxeVuWX5cuuwLMQ9KD0TZsBPgWyZFDC6qI5c3xb1Zf.jpg?r=8ba",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABU5qSoo1LYG_Pv9Y1dFZe3iweaTqisFlRSjeqvdzF7l1S-FWvQ7Xu-hqHxjq07nv3rDFm-z-6lk5Dz5uQgrNMeC4Cg7MCVhz-7M1.png?r=b5a",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABf2XB0Hr8DPc0bZdBrlva5kIrA1yULv3t8Uu2-rZlS_CauNu230a9VxfOVqryO8i7L4B3i-lSqjr6Lco-q3Bg67TMyU.webp?r=e6a"
            )
        )
        shows.add(
            ShowEntity(
                9,
                "Erased",
                "After finding his mom killed, Satoru's time-traveling ability takes him back 18 years for a chance to prevent her death and those of three classmates.",
                "2017",
                "12 Episodes",
                "Yuki Furukawa, Mio Yuki, Jin Shirasu",
                "TV Mysteries, TV Shows Based on Manga, Japanese TV Shows, TV Thrillers, TV Dramas",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABeSj0HH9emKSwQIDaLAsJVuyI6rXPjCrF3MfFtso8FXXPxLeth8D7CQDrbZDZo9pviky8TV4Ijeuv5-V_LkSaB7lq6Zb.jpg?r=ca0",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABY39sSZZXodZ2fEThjsD_AytMnTH_R6BJ7wjNxs7iQRfCxjphE1T1RiY_ehbA8BLEHFxLS0Sjwh3BVAkvi9P2i5ULLmtaeBuvrJl.png?r=3be",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABWgiJizN_pSZ-q8eCmTD0F9P81A2C1K2EwOTKWTgMgJN4Ed1WM8m-s8TOE-zg_6E_flbh1_knEHPNMTChnhQ9jZkdGHQVR4pxo8GV7QPvG_mbYqUMBvuowqdMppc.jpg?r=dcf"
            )
        )
        shows.add(
            ShowEntity(
                10,
                "The Queen's Gambit",
                "In a 1950s orphanage, a young girl reveals an astonishing talent for chess and begins an unlikely journey to stardom while grappling with addiction.",
                "2020",
                "7 Episodes",
                "Anya Taylor-Joy, Bill Camp, Marielle Heller",
                "TV Shows Based on Books, Social Issue TV Dramas, TV Dramas, US TV Shows",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABcL2iWNIx4vi4cc0PT0PTlMcuXiOrJcg0UujHyeug-6AETl6AmELWTiRI0nzrJ4MyTI-mPSFzuSnLTH63iJyJxMIVp5M.jpg?r=038",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/tx1O544a9T7n8Z_G12qaboulQQE/AAAABcKrFBGTCBvScMtWc-og890uVGAY17bX1Ubji7aF45di0ImJWVrTpv3uMzv7A_Ka113nAT8MKrcF7NbCgmlsZuXrWapkT68Qoq9B92KjEGxv_l-OTBIwV5t5DjxFPn9AaiB18Bsh76OyFJaNdJKWOKK9xWR9kQllQ_qMx9_dKO_QsA.png?r=a7f",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABTkLaJLrR7faXhHg_plP0nXDQ4L2Uy4QWERQL58jtuB2yp7l3AoXr41P6QY-XzvkS-lQpOqBqvq21jjipSZ6zHK8IRVKqf2bTJ61Lir5CXBI7Vi-Q3GD4PlAwaZz.jpg?r=93f"
            )
        )
        shows.add(
            ShowEntity(
                11,
                "The Millionaire Detective - Balance: UNLIMITED",
                "Millionaire detective Daisuke Kambe and his ornery partner solve crimes by unconventional means after Kato joins a new, problematic police unit.",
                "2020",
                "11 Episodes",
                "Yusuke Onuki, Mamoru Miyano, Kozo Shioya",
                "Crime TV Shows, TV Shows Based on Books, Japanese TV Shows, Anime Series, Drama Anime, Action Anime",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABWBsR01S0bwuWXJIo6DfxVgL8_Ityhc5vCH7rY4lJjeE0fbwsTGDverLnHFiaFIN95OLr_2hPypUhA7_YaW1LF6Ivd3B.jpg?r=553",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABdG-RIj7QWewlIIWn2-GRj_vpzXzte89epnzbVpfzUYXEYQq8GznGHyX8PoNhCPk42TVD1iFTn-J49jQ64MEmhstVWpjTwBQej93.png?r=c6e",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABVlHYlfgk3eBk29E98k0mknRKkiaD3GXLhjwnSVOD-Xc6CFSvJ8JMFv3zMQ9KBevUb2Mw9egvDDhIjO5bGA1HaYyzZw.webp?r=d92"
            )
        )
        shows.add(
            ShowEntity(
                12,
                "Death Note",
                "When a Japanese high schooler comes into possession of a mystical notebook, he finds he has the power to kill anybody whose name he enters in it.",
                "2006",
                "37 Episodes",
                "Mamoru Miyano, Kappei Yamaguchi, Shido Nakamura",
                "Crime TV Shows, Horror Anime, Mystery & Thriller Anime, TV Shows Based on Manga, Japanese TV Shows, TV Thrillers, TV Horror, Anime Series, Shounen Anime",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/E8vDc_W8CLv7-yMQu8KMEC7Rrr8/AAAABT-MJinvi2Rl2Lwh22zuJGnXxtuOiSgLCWqlD0uCPH3bfekfJ9JjJuvQhbndYjUNTzvYmPgFI9BVJ45hvpHxk43EIMX3.jpg?r=e58",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABeL5sQj_MwIs9WQH856cu25Ag1JnxcZh6MogOPxJa-k7Sl1g-hKimVOM-ZqsAZajkQw3sZZwY5g9gtUXLUNSVMlwb573AEH27iV1.png?r=338",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABTfEaLCYiwiaexojphIHx1-rLwnFlrSJ_4-WoT7ufr_oOsMDGSUgWgvF64kd5JfjDJH-dayMFP9-euyEEvHLIzN9_pE.webp?r=f47"
            )
        )
        shows.add(
            ShowEntity(
                13,
                "Angels of Death",
                "Waking up with no memory in a sealed building, cool-headed Rachel and her serial killer companion try to escape, floor by terrifying floor.",
                "2018",
                "16 Episodes",
                "Haruka Chisuga, Nobuhiko Okamoto, Takahiro Sakurai",
                "Horror Anime, TV Shows Based on Manga, Japanese TV Shows, TV Horror, Anime Series, Anime based on a Video Game",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABQEhI3VKbeEk7PiTXjqQEYCbGrvdaupc7i-Q5XgBhMYYG5U2-_PML8MyXchGcL1bH3GfFjRsnx1UID67PVfGBe8873dN.jpg?r=dfe",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABY41rYLs9wUEJ7jV8rpZOAJX_CLHGCAmdvSfZoZbMfhzhWKuxKJccaGT3YSVFOD03D8uc8O4IYK4QOYxTxvlgH0hfEsWZJ9xIdOu.png?r=2ac",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABQ6IxmfT2pzBXutQXle89jFd5thZQ4QoKxmCXHsDaNB3yyIHQv99fR3C0Fe28xuMivIhrJQBOsoas3YaI7dv57gzIEc.webp?r=d6f"
            )
        )

        return shows
    }

    fun generateDummyMovies(): List<MovieEntity> {
        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                1,
                "The Call",
                "Connected by phone in the same home but 20 years apart, a serial killer puts another woman’s past — and life — on the line to change her own fate.",
                "2020",
                "1h 52m",
                "Park Shin-hye, Jun Jong-seo, Kim Sung-ryoung",
                "Korean Movies, Thriller Movies",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABYGTrISL8XjJBQQDsp1GH5s2zYujn4ld4MPauofHDHpqJlHnRZuYpOLQKAq0XnLL6pAL76x1-YKeVGWOCKxV23KG4WnZ.jpg?r=b8b",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/tx1O544a9T7n8Z_G12qaboulQQE/AAAABVUSFyRdt73CamVj6bcLiU_IP3JpODSsVySZGlyc3ayuMeYMRUBCqYNBQnCQO0Juxc-7LNtbi5fSG1fFW02dVCVT4wd3S1t_T0gaMMmhY8SH0AxiN7AjmESGXu52OMD5jAs4FkWqUI-JTgymIDDtw6sQzGmwtkLZspjB7Qi2Why6SA.png?r=3de",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABWw8OTSZhLZxptA_wtBv7UR8IKaGIp2mESYa8K1EMvRLT8LcsU0vTEEejTK5jWOXkfbMRzgpzrBD3HX2JX4ywcv-Y5z09n9qInRmzJRjLMEC52BhHaVFYs-5X1ZV.jpg?r=ed1"
            )
        )
        movies.add(
            MovieEntity(
                2,
                "On Your Wedding Day",
                "A high school student develops a crush on a new transfer student but is soon separated from her -- until their paths cross again years later.",
                "2018",
                "1h 50m",
                "Park Bo-young, Kim Young-kwang",
                "Korean Movies, Romantic Movies",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABRz0gQ_yAQYGHUabrXnrm0Aw1qLH86hKFqDh8IBnCKgzlDC_9rgJDvT0rNTAXE87ncTKjFAkQDxxmYRiRXTDYdXMXAYF.jpg?r=8c8",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABUJBhs3RWmWiBnVXucgMf5fHt08uAVvwmgBXiL9bUnsOdAsnAP1K2KNWSIDkw4oVqA0kBsG9fbshZDEZvXU-i_TTqNUSTf-cI9er.png?r=60d",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABQNetjwDzH043dX-oLQTe3IvrFlrwOFxaeTqK7B3LH53K1x7rf59kK2mrU-N_ZafHIvfS9acMGA91eAntyWLCrMMhlY.jpg?r=0ec"
            )
        )
        movies.add(
            MovieEntity(
                3,
                "#Alive",
                "As a grisly virus rampages a city, a lone man stays locked inside his apartment, digitally cut off from seeking help and desperate to find a way out.",
                "2020",
                "1h 38m",
                "Yoo Ah-in, Park Shin-hye",
                "Korean Movies, Horror Movies",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABYDtyUyyZbi35T2dOC2UY4cURIGDEvtp6qepBn0ErQ-rhW0yiLah0A-q-DwK8XZ-o2ysAxOyOwOEh4ia17lezSyaMIQn.jpg?r=5c6",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/tx1O544a9T7n8Z_G12qaboulQQE/AAAABS8I0SVgkXbOHBLSuMAmtzwZGOeSUzNw_lTTv-GlDKcqgtOrVymiaV4WffCGk1k7T5drQikc1mHD0b_SVh3gj9y7jP2Mpnfh0yVijUAj5Cd2nzfNq6wU8W70nesUPPpqxQQZI0aUwYAIPadkf_xsk_i1U6ZTfUqptM3sZ3rU1A2u_w.png?r=5b5",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABWwjB0gPhss9coE4tlz6za8g9KuYfE3DDUBBTwxVyw00EBroYZsrBb9dkBsrYvjkcXyHbWrRZPKFCmxwSaYr_mISnvYQtxmD0UUF_HswsD5vNLyCY8CZ2MviecHv.jpg?r=400"
            )
        )
        movies.add(
            MovieEntity(
                4,
                "Home",
                "Oh, a loveable misfit alien who is on the run from his own alien race, takes shelter on planet Earth and befriends Tip, an adventurous young girl who is on a quest to find her displaced mother Lucy.",
                "2015",
                "1h 34m",
                "Jim Parsons,Rihanna,Steve Martin",
                "Family or Comedy",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABYgc913hXtu2Co_5CTGGdiqSC57UkVJnvR7fDc6HBfj3NFGknMTk9EhrI4WnjXQ9ab4VOLWLv5SRev25n2Eq1DOcjzhp.jpg?r=7fc",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABajVV54Z0yXvIDzrA3hPAm6UAxTjm9xPYG0NfkeRky2wjDbVDEmX-vKnRx00rWSvsAGCrsXy2UxenzhVYnVNGx3Bzs7FsErHOOq7.png?r=be7",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABZSoLLRPQh9heKjDKik4I17T9tTGi8XU0AoUCe9U5HORgqVeK-ZOCh74PDHO95_rci_5Fb0Q-BJwcm6BA19h29t4Ixs.jpg?r=88f"
            )
        )
        movies.add(
            MovieEntity(
                5,
                "Gifted",
                "A child prodigy gets caught in a custody battle between the kindhearted uncle who raised her and the grandmother who wants to cultivate her genius.",
                "2017",
                "1h 41m",
                "Chris Evans, Mckenna Grace, Octavia Spencer",
                "Family Features, US Movies, Children & Family Movies, Dramas",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABa3NkXS__-KPQnEjARcFtzo7LmB7192FUrvotQzkW3XAk7_BdEHNcqLUi34Opkk29CT4j5ujpULfRTIqcaEdLGg-Pq_A.jpg?r=ca3",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABWA0R43u2JZY7rixnkrFI_DYQsrtf1_cVQDXPSjy0gWq9JaOYn08DwI8BjKxxExnwfysoeUfsO2D4xEC2VS8IRte8_zurs_Fs7dl.png?r=1fe",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABf2Wk9IsdjOGVHC9EMzHv3Ny58B4DscgFh9n5zTwGmy1XDfREl7rubKw94o3Q6pQT8qYXXTvgZlcPhUIX92zWsxkc7k.jpg?r=6c4"
            )
        )
        movies.add(
            MovieEntity(
                6,
                "Minions",
                "The banana-yellow, linguistically garbled henchmen of \"Despicable Me\" star in this prequel, recounting the story of their villain-worshipping history.",
                "2015",
                "1h 30m",
                "Sandra Bullock, Jon Hamm, Michael Keaton",
                "Family Features, US Movies, Children & Family Movies, Comedies",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABeQfP2yCD0CwCAqhW0GHaYRZi-__mP3GBlt7bvf2l-yYcStHiXXp2d4ehn-PNC5LDzIkdzKOs6u822DqZzVT6sPBN9jW.jpg?r=82e",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABWSOC06Cb293x5tizQu3Cbj9vkvK-lqSv3bx3lT9UnjB-PvQMROo1LDo8EukaVhvDSKkTc6lyJyZz9HSzC_W0vPnMR1Kbrv1vB3k.png?r=abd",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABZNYLGeXRiisotBoxlI9vTZKWv-uCrt8t_uJBmP3NPunqr51BWl9Iq_tkCRiM7CoId7GjunahTbenxa9QffhnNbg6DU.jpg?r=253"
            )
        )
        movies.add(
            MovieEntity(
                7,
                "How to Train Your Dragon: The Hidde World",
                "After meeting an enchanted creature, Hiccup and Toothless set out to find a legendary dragon paradise before evil hunter Grimmel finds them first.",
                "2019",
                "1h 44m",
                "Jay Baruchel, America Ferrera, F. Murray Abraham",
                "Family Features, US Movies, Movies Based on Books, Children & Family Movies",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABd0TlxPZqzZnbLYgkp2uWznNHclc-ds5WqWJKu-WEtHCgfpXAEQTOVf1qPUoAQUm04jByoijLCIt_mS9-ekxGugX2Lg4.jpg?r=da9",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABaH2nR_-vVbKOqbjfvSEKSWpR18jW_IDXOqtkgvxIJz31idk5mKTWHNs_EyHU9JsGBf-oz-XjRVJKVUsRPJhj9ifxUlQ8b534Df7.png?r=a8d",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABVoxGGqHxEITruCEwDXLPvBWAdgP55HMGseHVvLHPygIgyMXiIKd4DlU63d4JSIscSlWfhmq0p7sBmrCd39eG-RPgQc.jpg?r=bc9"
            )
        )
        movies.add(
            MovieEntity(
                8,
                "Divergent",
                "In a divided, war-torn world, Tris discovers her special abilities and bands with Four to resist a sinister plot against those like them.",
                "2014",
                "2h 19m",
                "Shailene Woodley, Miles Teller, Ashley Judd",
                "Sci-Fi Movies, US Movies, Teen Movies, Movies Based on Books, Action & Adventure",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABdlEwDsgGdNZzVJ0zVWEZLRKkdz5tJA3ypNyCnf_GySJZWi-EKveURBvdywUW0e90D8qu4U1PFI1fDoJZFYm8s3PqTeY.jpg?r=384",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABVBLvblwO0Qm46IrT7iwq4WYxNsoxaxrn0qFS3KWXtUN0VZldsECZ0mCz5aoytgbYb-h-_xeDsS4XtsK8E6wFkCVyOJ8v46gTQkW.png?r=88e",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABQmv0MSY32T8FjnQGUnQYdyzS3gxe1Kf69XC1jEkQFYb7gf8OhHzcqpV4g-Ph7If0g5iHISq7nyhhfvgICd4qX97yjQ.jpg?r=d6f"
            )
        )
        movies.add(
            MovieEntity(
                9,
                "The Divergent Series: Insurgent",
                "While war brews between the factions, Jeanine hunts relentlessly for Tris and her Divergent powers, which alone can open a mysterious relic.",
                "2015",
                "1h 58m",
                "Shailene Woodley, Theo James, Kate Winslet",
                "Sci-Fi Movies, US Movies, Teen Movies, Movies Based on Books, Action & Adventure",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABd0t_x1JmmoHJCZUqxvx1M9k3rzCv_20G2811RaCIdz53dTwSdRc0iDthBbM9IyozG6EyeGXtlXscEEWRitH0lnMxd6P.jpg?r=544",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABU-IUvsDGxcUT9mRosVyE1pzHBXE4IRGIrfRt2K8VLOgqjtUoQwlXBf4CMIK6QNSMiDUMvOH6W3Fu4rF03-wGAIXuPljHR2eN1D_.png?r=52c",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABbd6t_qqgCt73mPAlTe0G72fETZ_XWfEXyxFntDASR6SoPJrcqr5627kbKbVH9nk0TVKsJI4Kn3OyMNms1d19egnLK0.jpg?r=314"
            )
        )
        movies.add(
            MovieEntity(
                10,
                "Twilight",
                "When Bella Swan moves in with her father, she starts school and meets Edward, a mysterious classmate who reveals himself to be a 108-year-old vampire.",
                "2008",
                "2h 1m",
                "Kristen Stewart, Robert Pattinson, Billy Burke",
                "US Movies, Teen Movies, Movies Based on Books, Action & Adventure, Dramas, Romantic Movies",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABfwQW65fPV0UCCV5CZBP3zkte40lGQ38dbvxfb6qtrbHABeszUmg7JrUTGSwGoYtb-t3tWtcMaTaXMSqndRJPt37aeUn.jpg?r=a8f",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABb1kFk1HW-qBEguEONOLYLfxdZsEUYG-CIwuHlX4Saw4xbuU8BrbvjEROQuudKDkE6Kc2v5EvbkeFgvbkj7sBw8n3cUSG4M04XZJ.png?r=e1f",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABZ9fhhwYy7m5XhrhiNVMr3K8YxJApIqiryOVWqw88U3V_UjPJNQ80pdHPxYvyqTfL6fhIInliROEFSnCIYe2UD6jBRs.jpg?r=89b"
            )
        )
        movies.add(
            MovieEntity(
                11,
                "To All The Boys: Always and Forever",
                "Senior year of high school takes center stage as Lara Jean returns from a family trip to Korea and considers her college plans — with and without Peter.",
                "2021",
                "1h 55m",
                "Lana Condor, Noah Centineo, Janel Parrish",
                "Romantic Comedies, US Movies, Teen Movies, Movies Based on Books, Comedies, Romantic Movies",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABaGkjlSFx_DgXsu7-Le7pFFSzdlUgk95s9ooD7o6n_N1wwI3uYEs7P_zz8JVXWHfYVQTAXs95ffu8Xgn9PiLiey82f5N.jpg?r=09a",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/tx1O544a9T7n8Z_G12qaboulQQE/AAAABUpVryFpIegUYj-9yBLnUq06U8V_nSpVe-tWOLtAYqDQL_XFOY0qnX3NbjySILgL4fYSgPYjGxDKPOj6HztBzVkv7lu9ZWO3Brcnxzsj6-gJjtok5Iah9VGQ2ZdDTdGWjPpPzajoxTPYaOVYzH4ojvPiqt5KUl1jJ6jZ7_GSBUXJIQ.png?r=b41",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABVAvHS1g1BYRrXiNaoNWaKo33KOq9vg6227OwxZA54tS2pk5waNeI6w1kh8-JHcofg5SInp6zt5lwL1zOj7BrAHoshHpfjzfEfye49dFChu-BcZ7Y-hdqpf93rPw.jpg?r=cf5"
            )
        )
        movies.add(
            MovieEntity(
                12,
                "The Twilight Saga: New Moon",
                "Still reeling from the departure of vampire Edward Cullen, a heartbroken Bella Swan finds comfort in her friendship with werewolf Jacob Black.",
                "2009",
                "2h 10m",
                "Kristen Stewart, Robert Pattinson, Taylor Lautner",
                "US Movies, Teen Movies, Movies Based on Books, Dramas, Romantic Movies",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABX0I7qZd4snpQGhADGhUszBaNGx_AecetAMIOpkqpqRw1u5scA3KA9wC8e_1pofYJvOqsuZLY-UfGKPdzO2mbiMEt154.jpg?r=515",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABejSCQL9VjeXiU2oDkaUQ8n_vrMGJBEBc-YTbc9HE8Z0w23_0RELcQ1EUyMgmXgPhoAoMKwTwYNjAGA0roiYPKU5WRon6IOqa-Gx.png?r=26e",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABSyOyVvER1kaSMCCETbvK9M7kIzhorGHDB_EsXehyj9xkXueYBb8NhKenfpU55K0R89eiGPShu5-i9iAZDBr2Nzkv3o.jpg?r=5b1"
            )
        )
        movies.add(
            MovieEntity(
                13,
                "The Twilight Saga: Eclipse",
                "With a bloodthirsty enemy on a quest for revenge, Bella must reconcile her love for vampire Edward and her growing feelings for werewolf Jacob.",
                "2010",
                "2h 3m",
                "Kristen Stewart, Robert Pattinson, Taylor Lautner",
                "US Movies, Teen Movies, Movies Based on Books, Dramas, Romantic Movies",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABaV0AkVNms4iQ7gQkNubh7dahvcpts-FtLMc1UfkZBHwNZwt5Tk60ga3nnHtGTwbW0POE0dYV5ivbQGclUi1rrz68swn.jpg?r=c7f",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/LmEnxtiAuzezXBjYXPuDgfZ4zZQ/AAAABRdH96OqExQ_RZbw6_XHhUcWGJrlWJ6wN8ocabpB_DNErBjsL_hXHQ7tZkxayZndE2V8b6DpPeOaz_0tlwhJK4J65mXkTV7_pAeO.png?r=8fb",
                "https://occ-0-58-325.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABWmlL006mQ1xs71_yY_3guzXZd7oxWmk53ghCuuhYDQkzSgqroQhmo39PaO2Vo7Kz_hvQLlrrPto1RUNSh_fR10XF1c.jpg?r=50a"
            )
        )

        return movies
    }

}