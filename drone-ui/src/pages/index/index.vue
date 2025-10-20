<template>
  <view class="content">
    <image class="logo" src="/static/logo.png"></image>
    <view class="text-area">
      <text class="title">无人机平台 · 首页</text>
    </view>
    <view class="nav">
      <navigator url="/pages/user/index" class="nav-item">用户中心</navigator>
      <navigator url="/pages/supply/index" class="nav-item">供给方</navigator>
      <navigator url="/pages/demand/index" class="nav-item">需求方</navigator>
      <navigator url="/pages/order/index" class="nav-item">订单</navigator>
      <navigator url="/pages/message/index" class="nav-item">消息</navigator>
    </view>
  </view>
</template>
<script>
export default {
  data() {
    return {}
  }
}
</script>
<style>
.content { padding: 32rpx; }
.logo { height: 200rpx; width: 200rpx; margin: 60rpx auto 30rpx auto; display:block; }
.text-area { text-align:center; margin-bottom: 20rpx; }
.title { font-size: 36rpx; color: #333; }
.nav { display:flex; flex-wrap:wrap; gap: 20rpx; justify-content:center; margin-top: 40rpx; }
.nav-item { padding: 20rpx 28rpx; background:#f0f2f5; border-radius: 12rpx; color:#333; }
</style>
