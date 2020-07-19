<template>
  <el-tree
    :data="menus"
    :props="defaultProps"
    :expand-on-click-node="false"
    show-checkbox
    node-key="catId"
    :default-expanded-keys="expandedKey"
  >
    <span class="custom-tree-node" slot-scope="{ node, data }">
      <span>{{ node.label }}</span>
      <span>
        <el-button
          v-if="node.level === 1 || node.level === 2"
          type="text"
          size="mini"
          @click="() => append(data)"
        >新增</el-button>
        <el-button
          v-if="node.childNodes.length === 0"
          type="text"
          size="mini"
          @click="() => remove(node, data)"
        >删除</el-button>
      </span>
    </span>
  </el-tree>
</template>

<script>
export default {
  data () {
    return {
      menus: [],
      expandedKey: [],
      defaultProps: {
        children: 'children',
        label: 'name'
      }
    }
  },
  methods: {
    append (data) {
      console.log(data)
    },
    remove (node, data) {
      var ids = [data.catId]
      this.$confirm(`此操作将永久删除【${data.name}】菜单，是否继续?`, '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.$http({
          url: this.$http.adornUrl('/product/category/delete'),
          method: 'post',
          data: this.$http.adornData(ids, false)
        }).then(({ data }) => {
          this.$message.success('删除成功')
          this.getList()
          // 设置需要默认展开的菜单
          this.expandedKey = [node.parent.data.catId]
        })
      }).catch(() => {
        this.$message.info('取消删除')
      })
    },
    getList () {
      this.$http({
        url: this.$http.adornUrl('/product/category/list/tree'),
        method: 'get'
      }).then(({ data }) => {
        this.menus = data.data
      })
    }
  },
  created () {
    this.getList()
  }
}
</script>

<style>
</style>