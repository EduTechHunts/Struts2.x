package com.tctalk.apps.mmgr.db.businessobjects;
// Generated by Hibernate Tools 3.4.0.CR1

/**
 * AlbumtblBO generated by hbm2java
 */

public class AlbumtblBO implements java.io.Serializable {

	private static final long serialVersionUID = -1445059679188116334L;
	private int musicId;
	private String albumTitle;
	private String albumGenre;
	private String albumArtists;
	private int noOfTracks;

	public AlbumtblBO() {
	}

	public AlbumtblBO(int musicId, String albumTitle, String albumGenre,
			String albumArtists, int noOfTracks) {
		this.musicId = musicId;
		this.albumTitle = albumTitle;
		this.albumGenre = albumGenre;
		this.albumArtists = albumArtists;
		this.noOfTracks = noOfTracks;
	}

	public int getMusicId() {
		return this.musicId;
	}

	public void setMusicId(int musicId) {
		this.musicId = musicId;
	}

	public String getAlbumTitle() {
		return this.albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public String getAlbumGenre() {
		return this.albumGenre;
	}

	public void setAlbumGenre(String albumGenre) {
		this.albumGenre = albumGenre;
	}

	public String getAlbumArtists() {
		return this.albumArtists;
	}

	public void setAlbumArtists(String albumArtists) {
		this.albumArtists = albumArtists;
	}

	public int getNoOfTracks() {
		return this.noOfTracks;
	}

	public void setNoOfTracks(int noOfTracks) {
		this.noOfTracks = noOfTracks;
	}

}