package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.resource.drawable.DrawableResource;

/**
 * A resource wrapping an {@link GifDrawable}.
 */
public class GifDrawableResource extends DrawableResource<GifDrawable> {
  public GifDrawableResource(GifDrawable drawable) {
    super(drawable);
  }

  @Override
  public Class<GifDrawable> getResourceClass() {
    return GifDrawable.class;
  }

  @Override
  public int getSize() {
   return drawable.getSize();
  }

  @Override
  public void recycle() {
    drawable.stop();
    drawable.recycle();
  }
}
