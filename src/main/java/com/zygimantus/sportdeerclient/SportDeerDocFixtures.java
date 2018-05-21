
package com.zygimantus.sportdeerclient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id_country",
    "id_league",
    "id_season",
    "id_stage",
    "first_half_ended_at",
    "fixture_status",
    "fixture_status_short",
    "game_ended_at",
    "game_started_at",
    "id_referee",
    "id_team_season_away",
    "id_team_season_home",
    "lineup_confirmed",
    "number_goal_team_away",
    "number_goal_team_home",
    "referee_name",
    "round",
    "schedule_date",
    "second_half_ended_at",
    "second_half_started_at",
    "spectators",
    "stadium",
    "team_season_away_name",
    "team_season_home_name"
})
public class SportDeerDocFixtures
    extends SportDeerDoc
{

    @JsonProperty("id_country")
    private Integer idCountry;
    @JsonProperty("id_league")
    private Integer idLeague;
    @JsonProperty("id_season")
    private Integer idSeason;
    @JsonProperty("id_stage")
    private Integer idStage;
    @JsonProperty("first_half_ended_at")
    private String firstHalfEndedAt;
    @JsonProperty("fixture_status")
    private String fixtureStatus;
    @JsonProperty("fixture_status_short")
    private String fixtureStatusShort;
    @JsonProperty("game_ended_at")
    private String gameEndedAt;
    @JsonProperty("game_started_at")
    private String gameStartedAt;
    @JsonProperty("id_referee")
    private Integer idReferee;
    @JsonProperty("id_team_season_away")
    private Integer idTeamSeasonAway;
    @JsonProperty("id_team_season_home")
    private Integer idTeamSeasonHome;
    @JsonProperty("lineup_confirmed")
    private String lineupConfirmed;
    @JsonProperty("number_goal_team_away")
    private Integer numberGoalTeamAway;
    @JsonProperty("number_goal_team_home")
    private Integer numberGoalTeamHome;
    @JsonProperty("referee_name")
    private String refereeName;
    @JsonProperty("round")
    private String round;
    @JsonProperty("schedule_date")
    private String scheduleDate;
    @JsonProperty("second_half_ended_at")
    private String secondHalfEndedAt;
    @JsonProperty("second_half_started_at")
    private String secondHalfStartedAt;
    @JsonProperty("spectators")
    private Integer spectators;
    @JsonProperty("stadium")
    private String stadium;
    @JsonProperty("team_season_away_name")
    private String teamSeasonAwayName;
    @JsonProperty("team_season_home_name")
    private String teamSeasonHomeName;

    @JsonProperty("id_country")
    public Integer getIdCountry() {
        return idCountry;
    }

    @JsonProperty("id_country")
    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    @JsonProperty("id_league")
    public Integer getIdLeague() {
        return idLeague;
    }

    @JsonProperty("id_league")
    public void setIdLeague(Integer idLeague) {
        this.idLeague = idLeague;
    }

    @JsonProperty("id_season")
    public Integer getIdSeason() {
        return idSeason;
    }

    @JsonProperty("id_season")
    public void setIdSeason(Integer idSeason) {
        this.idSeason = idSeason;
    }

    @JsonProperty("id_stage")
    public Integer getIdStage() {
        return idStage;
    }

    @JsonProperty("id_stage")
    public void setIdStage(Integer idStage) {
        this.idStage = idStage;
    }

    @JsonProperty("first_half_ended_at")
    public String getFirstHalfEndedAt() {
        return firstHalfEndedAt;
    }

    @JsonProperty("first_half_ended_at")
    public void setFirstHalfEndedAt(String firstHalfEndedAt) {
        this.firstHalfEndedAt = firstHalfEndedAt;
    }

    @JsonProperty("fixture_status")
    public String getFixtureStatus() {
        return fixtureStatus;
    }

    @JsonProperty("fixture_status")
    public void setFixtureStatus(String fixtureStatus) {
        this.fixtureStatus = fixtureStatus;
    }

    @JsonProperty("fixture_status_short")
    public String getFixtureStatusShort() {
        return fixtureStatusShort;
    }

    @JsonProperty("fixture_status_short")
    public void setFixtureStatusShort(String fixtureStatusShort) {
        this.fixtureStatusShort = fixtureStatusShort;
    }

    @JsonProperty("game_ended_at")
    public String getGameEndedAt() {
        return gameEndedAt;
    }

    @JsonProperty("game_ended_at")
    public void setGameEndedAt(String gameEndedAt) {
        this.gameEndedAt = gameEndedAt;
    }

    @JsonProperty("game_started_at")
    public String getGameStartedAt() {
        return gameStartedAt;
    }

    @JsonProperty("game_started_at")
    public void setGameStartedAt(String gameStartedAt) {
        this.gameStartedAt = gameStartedAt;
    }

    @JsonProperty("id_referee")
    public Integer getIdReferee() {
        return idReferee;
    }

    @JsonProperty("id_referee")
    public void setIdReferee(Integer idReferee) {
        this.idReferee = idReferee;
    }

    @JsonProperty("id_team_season_away")
    public Integer getIdTeamSeasonAway() {
        return idTeamSeasonAway;
    }

    @JsonProperty("id_team_season_away")
    public void setIdTeamSeasonAway(Integer idTeamSeasonAway) {
        this.idTeamSeasonAway = idTeamSeasonAway;
    }

    @JsonProperty("id_team_season_home")
    public Integer getIdTeamSeasonHome() {
        return idTeamSeasonHome;
    }

    @JsonProperty("id_team_season_home")
    public void setIdTeamSeasonHome(Integer idTeamSeasonHome) {
        this.idTeamSeasonHome = idTeamSeasonHome;
    }

    @JsonProperty("lineup_confirmed")
    public String getLineupConfirmed() {
        return lineupConfirmed;
    }

    @JsonProperty("lineup_confirmed")
    public void setLineupConfirmed(String lineupConfirmed) {
        this.lineupConfirmed = lineupConfirmed;
    }

    @JsonProperty("number_goal_team_away")
    public Integer getNumberGoalTeamAway() {
        return numberGoalTeamAway;
    }

    @JsonProperty("number_goal_team_away")
    public void setNumberGoalTeamAway(Integer numberGoalTeamAway) {
        this.numberGoalTeamAway = numberGoalTeamAway;
    }

    @JsonProperty("number_goal_team_home")
    public Integer getNumberGoalTeamHome() {
        return numberGoalTeamHome;
    }

    @JsonProperty("number_goal_team_home")
    public void setNumberGoalTeamHome(Integer numberGoalTeamHome) {
        this.numberGoalTeamHome = numberGoalTeamHome;
    }

    @JsonProperty("referee_name")
    public String getRefereeName() {
        return refereeName;
    }

    @JsonProperty("referee_name")
    public void setRefereeName(String refereeName) {
        this.refereeName = refereeName;
    }

    @JsonProperty("round")
    public String getRound() {
        return round;
    }

    @JsonProperty("round")
    public void setRound(String round) {
        this.round = round;
    }

    @JsonProperty("schedule_date")
    public String getScheduleDate() {
        return scheduleDate;
    }

    @JsonProperty("schedule_date")
    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    @JsonProperty("second_half_ended_at")
    public String getSecondHalfEndedAt() {
        return secondHalfEndedAt;
    }

    @JsonProperty("second_half_ended_at")
    public void setSecondHalfEndedAt(String secondHalfEndedAt) {
        this.secondHalfEndedAt = secondHalfEndedAt;
    }

    @JsonProperty("second_half_started_at")
    public String getSecondHalfStartedAt() {
        return secondHalfStartedAt;
    }

    @JsonProperty("second_half_started_at")
    public void setSecondHalfStartedAt(String secondHalfStartedAt) {
        this.secondHalfStartedAt = secondHalfStartedAt;
    }

    @JsonProperty("spectators")
    public Integer getSpectators() {
        return spectators;
    }

    @JsonProperty("spectators")
    public void setSpectators(Integer spectators) {
        this.spectators = spectators;
    }

    @JsonProperty("stadium")
    public String getStadium() {
        return stadium;
    }

    @JsonProperty("stadium")
    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    @JsonProperty("team_season_away_name")
    public String getTeamSeasonAwayName() {
        return teamSeasonAwayName;
    }

    @JsonProperty("team_season_away_name")
    public void setTeamSeasonAwayName(String teamSeasonAwayName) {
        this.teamSeasonAwayName = teamSeasonAwayName;
    }

    @JsonProperty("team_season_home_name")
    public String getTeamSeasonHomeName() {
        return teamSeasonHomeName;
    }

    @JsonProperty("team_season_home_name")
    public void setTeamSeasonHomeName(String teamSeasonHomeName) {
        this.teamSeasonHomeName = teamSeasonHomeName;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(idTeamSeasonHome).append(numberGoalTeamAway).append(lineupConfirmed).append(secondHalfEndedAt).append(refereeName).append(scheduleDate).append(teamSeasonHomeName).append(stadium).append(idLeague).append(fixtureStatusShort).append(secondHalfStartedAt).append(teamSeasonAwayName).append(firstHalfEndedAt).append(idReferee).append(spectators).append(idCountry).append(gameStartedAt).append(round).append(idSeason).append(idStage).append(fixtureStatus).append(gameEndedAt).append(numberGoalTeamHome).append(idTeamSeasonAway).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SportDeerDocFixtures) == false) {
            return false;
        }
        SportDeerDocFixtures rhs = ((SportDeerDocFixtures) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(idTeamSeasonHome, rhs.idTeamSeasonHome).append(numberGoalTeamAway, rhs.numberGoalTeamAway).append(lineupConfirmed, rhs.lineupConfirmed).append(secondHalfEndedAt, rhs.secondHalfEndedAt).append(refereeName, rhs.refereeName).append(scheduleDate, rhs.scheduleDate).append(teamSeasonHomeName, rhs.teamSeasonHomeName).append(stadium, rhs.stadium).append(idLeague, rhs.idLeague).append(fixtureStatusShort, rhs.fixtureStatusShort).append(secondHalfStartedAt, rhs.secondHalfStartedAt).append(teamSeasonAwayName, rhs.teamSeasonAwayName).append(firstHalfEndedAt, rhs.firstHalfEndedAt).append(idReferee, rhs.idReferee).append(spectators, rhs.spectators).append(idCountry, rhs.idCountry).append(gameStartedAt, rhs.gameStartedAt).append(round, rhs.round).append(idSeason, rhs.idSeason).append(idStage, rhs.idStage).append(fixtureStatus, rhs.fixtureStatus).append(gameEndedAt, rhs.gameEndedAt).append(numberGoalTeamHome, rhs.numberGoalTeamHome).append(idTeamSeasonAway, rhs.idTeamSeasonAway).isEquals();
    }

}
