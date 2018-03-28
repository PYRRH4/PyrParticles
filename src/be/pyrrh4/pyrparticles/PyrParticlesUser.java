package be.pyrrh4.pyrparticles;

import be.pyrrh4.core.PluginData;
import be.pyrrh4.pyrparticles.particle.ParticleDisplayer;
import be.pyrrh4.pyrparticles.particle.ParticleEffect;
import be.pyrrh4.pyrparticles.trail.Trail;

public class PyrParticlesUser extends PluginData {

	// ------------------------------------------------------------
	// Fields and constructor
	// ------------------------------------------------------------

	private ParticleEffect particleEffect = null;
	private ParticleDisplayer particleDisplayer = ParticleDisplayer.AROUND;
	private Trail trail = null;
	private long lastGadgetUsed = 0L;

	public PyrParticlesUser() {}

	// ------------------------------------------------------------
	// Methods
	// ------------------------------------------------------------

	public ParticleEffect getParticleEffect() {
		return particleEffect;
	}

	public void setParticleEffect(ParticleEffect particleEffect) {
		this.particleEffect = particleEffect;
	}

	public ParticleDisplayer getParticleDisplayer() {
		return particleDisplayer;
	}

	public void setParticleDisplayer(ParticleDisplayer particleDisplayer) {
		this.particleDisplayer = particleDisplayer;
	}

	public Trail getTrail() {
		return trail;
	}

	public void setTrail(Trail trail) {
		this.trail = trail;
	}

	public long getLastGadgetUsed() {
		return lastGadgetUsed;
	}

	public void setLastGadgetUsed(long lastGadgetUsed) {
		this.lastGadgetUsed = lastGadgetUsed;
	}

}