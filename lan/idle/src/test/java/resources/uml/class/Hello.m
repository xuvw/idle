/*
 * Copyright (c) 2015 - present Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

//
//  Hello.m
//  HelloWorldApp
//

#import "Hello.h"
#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
@interface Hello ()<UITableViewDelegate>

@end

@implementation Hello

- (Hello*)return_hello {
  return [Hello new];
}

- (NSString*)null_dereference_bug {
  Hello* hello = nil;
  return hello->_s;
}

- (NSString*)ivar_not_nullable_bug:(Hello*)hello {
  Hello* ret_hello = [hello->_hello return_hello];
  return ret_hello->_s;
}

- (NSString*)parameter_not_null_checked_bug:(Hello*)hello {
  Hello* ret_hello = [hello return_hello];
  return ret_hello->_s;
}

@end
