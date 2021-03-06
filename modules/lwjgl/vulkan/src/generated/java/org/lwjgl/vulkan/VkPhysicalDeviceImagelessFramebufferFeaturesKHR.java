/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure indicating support for imageless framebuffers.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2KHR}, it is filled with values indicating whether the feature is supported. {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable this feature.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRImagelessFramebuffer#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code imagelessFramebuffer} &ndash; indicates that the implementation supports specifying the image view for attachments at render pass begin time via {@link VkRenderPassAttachmentBeginInfoKHR}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceImagelessFramebufferFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 imagelessFramebuffer;
 * }</code></pre>
 */
public class VkPhysicalDeviceImagelessFramebufferFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGELESSFRAMEBUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGELESSFRAMEBUFFER = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImagelessFramebufferFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code imagelessFramebuffer} field. */
    @NativeType("VkBool32")
    public boolean imagelessFramebuffer() { return nimagelessFramebuffer(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imagelessFramebuffer} field. */
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR imagelessFramebuffer(@NativeType("VkBool32") boolean value) { nimagelessFramebuffer(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR set(
        int sType,
        long pNext,
        boolean imagelessFramebuffer
    ) {
        sType(sType);
        pNext(pNext);
        imagelessFramebuffer(imagelessFramebuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImagelessFramebufferFeaturesKHR set(VkPhysicalDeviceImagelessFramebufferFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceImagelessFramebufferFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceImagelessFramebufferFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceImagelessFramebufferFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceImagelessFramebufferFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceImagelessFramebufferFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeaturesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeaturesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImagelessFramebufferFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImagelessFramebufferFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImagelessFramebufferFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImagelessFramebufferFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImagelessFramebufferFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #imagelessFramebuffer}. */
    public static int nimagelessFramebuffer(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImagelessFramebufferFeaturesKHR.IMAGELESSFRAMEBUFFER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImagelessFramebufferFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImagelessFramebufferFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #imagelessFramebuffer(boolean) imagelessFramebuffer}. */
    public static void nimagelessFramebuffer(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImagelessFramebufferFeaturesKHR.IMAGELESSFRAMEBUFFER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImagelessFramebufferFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImagelessFramebufferFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceImagelessFramebufferFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceImagelessFramebufferFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImagelessFramebufferFeaturesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImagelessFramebufferFeaturesKHR.npNext(address()); }
        /** Returns the value of the {@code imagelessFramebuffer} field. */
        @NativeType("VkBool32")
        public boolean imagelessFramebuffer() { return VkPhysicalDeviceImagelessFramebufferFeaturesKHR.nimagelessFramebuffer(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImagelessFramebufferFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImagelessFramebufferFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imagelessFramebuffer} field. */
        public VkPhysicalDeviceImagelessFramebufferFeaturesKHR.Buffer imagelessFramebuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImagelessFramebufferFeaturesKHR.nimagelessFramebuffer(address(), value ? 1 : 0); return this; }

    }

}