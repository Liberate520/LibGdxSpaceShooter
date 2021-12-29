package ru.samsung;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

public class MyGdxGame extends InputAdapter implements ApplicationListener {
	public PerspectiveCamera cam;

	public Model model;
	public ModelInstance instance;
	public ModelBatch modelBatch;

	public Environment environment;

	final float[] startPos = {150f, -9f, 0f};
	final float bound = 45f;
	float[] pos = {startPos[0], startPos[1], startPos[2]};
	float[] Vpos = new float[3];

	protected Label label;
	protected Label crosshair;
	protected BitmapFont font;
	protected Stage stage;

	protected long startTime;
	protected long hits;

	boolean isUnder = false;
	long underFire;

	final float zone = 12f;
	final float speed = 2f;
	public AssetManager assets;
	public boolean loading;

	@Override
	public void create() {

	}

	private float getSpeed() {
		return speed * Math.signum((float) Math.random() - 0.5f) * Math.max((float) Math.random(), 0.5f);
	}

	@Override
	public void render() {


	}

	@Override
	public void dispose() {
	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height, true);
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return true;
	}
}