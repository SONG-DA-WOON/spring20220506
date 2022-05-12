<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="path"%>

<nav aria-label="Page navigation example">
	<ul class="pagination justify-content-center">
		<c:forEach begin="${pageInfo.left }" end="${pageInfo.right }"
			var="pageNum">
	
			<c:url value="${path }" var="link">
				<c:param name="page" value="${pageNum }"></c:param>
			</c:url>
			<li class="page-item">
				<a class="page-link" href="${link }">Previous</a>
			</li>
			<li class="page-item ${pageInfo.current == pageNum ? 'active' : '' }">
				<a class="page-link" href="${link }">${pageNum }</a>
			<li class="page-item">
			
			<li class="page-item" >
				<a class="page-link" href="${link }">Next</a>
			</li>

		</c:forEach>
	</ul>
</nav>
<nav aria-label="...">
	<ul class="pagination">
		<li class="page-item disabled">
			<a class="page-link">Previous</a>
		</li>
		<li class="page-item">
			<a class="page-link" href="#">1</a>
		</li>
		<li class="page-item active" aria-current="page">
			<a class="page-link" href="#">2</a>
		</li>
		<li class="page-item">
			<a class="page-link" href="#">3</a>
		</li>
		<li class="page-item">
			<a class="page-link" href="#">Next</a>
		</li>
	</ul>
</nav>