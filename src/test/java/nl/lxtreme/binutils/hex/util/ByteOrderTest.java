/*******************************************************************************
 * Copyright (c) 2011, J.W. Janssen
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     J.W. Janssen - Cleanup and make API more OO-oriented.
 *******************************************************************************/
package nl.lxtreme.binutils.hex.util;


import static org.junit.Assert.*;

import java.nio.*;

import org.junit.*;


/**
 * 
 */
public class ByteOrderTest
{
  // METHODS

  /**
   * Test method for
   * {@link nl.lxtreme.cpemu.util.ByteOrderUtils#createWord(int, int)}.
   */
  @Test
  public void testCreateBigEndianWord()
  {
    assertEquals(0xABCD, ByteOrderUtils.createWord(ByteOrder.BIG_ENDIAN, 0xAB, 0xCD));
  }

  /**
   * Test method for
   * {@link nl.lxtreme.cpemu.util.ByteOrderUtils#createWord(int, int)}.
   */
  @Test
  public void testCreateLittleEndianWord()
  {
    assertEquals(0xABCD, ByteOrderUtils.createWord(ByteOrder.LITTLE_ENDIAN, 0xCD, 0xAB));
  }

  /**
   * Test method for
   * {@link nl.lxtreme.cpemu.util.ByteOrderUtils#createWord(int, int)}.
   */
  @Test
  public void testDecodeWordOk()
  {
    assertEquals(0xABCD, ByteOrderUtils.decode(ByteOrder.BIG_ENDIAN, (byte) 0xAB, (byte) 0xCD));
    assertEquals(0xCDAB, ByteOrderUtils.decode(ByteOrder.BIG_ENDIAN, (byte) 0xCD, (byte) 0xAB));
    assertEquals(0xCDAB, ByteOrderUtils.decode(ByteOrder.LITTLE_ENDIAN, (byte) 0xAB, (byte) 0xCD));
    assertEquals(0xABCD, ByteOrderUtils.decode(ByteOrder.LITTLE_ENDIAN, (byte) 0xCD, (byte) 0xAB));
  }

  /**
   * Test method for
   * {@link nl.lxtreme.cpemu.util.ByteOrderUtils#swap16(int)}.
   */
  @Test
  public void testSwitchBigEndianByteOrder()
  {
    assertEquals(0xCDAB, ByteOrderUtils.swap16(0xABCD));
  }

  /**
   * Test method for
   * {@link nl.lxtreme.cpemu.util.ByteOrderUtils#swap16(int)}.
   */
  @Test
  public void testSwitchLittleEndianByteOrder()
  {
    assertEquals(0xCDAB, ByteOrderUtils.swap16(0xABCD));
  }

} /* ByteOrderTest */

/* EOF */
