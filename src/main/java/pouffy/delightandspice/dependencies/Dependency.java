package pouffy.delightandspice.dependencies;

import net.minecraftforge.fml.ModList;

public class Dependency {
    private boolean loaded;

    public Dependency(String modID) {
        this.loaded = ModList.get().isLoaded(modID);
    }

    public boolean isLoaded() {
        return this.loaded;
    }
}
