# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 404 | `qa-53d4272f-0e4c-4730-8093-dedd731ae3f9` |
| 2 | `POST /v1/auth/token` | 200 | 203 | `qa-c038fa52-003a-41cf-b1ba-817d74b7e478` |
| 3 | `GET /v1/admin/stats` | 403 | 67 | `qa-133ba734-cb56-4562-8285-82c9dbab9d71` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-277f361c-c0f6-484c-bd29-69393de6ebb7` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-52f17507-8df0-499a-8e5c-5696ca0c2ef9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-53d4272f-0e4c-4730-8093-dedd731ae3f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53d4272f-0e4c-4730-8093-dedd731ae3f9
Content-Type: application/json

--- request body ---
{"handle":"qa-03ad1399f29f","displayName":"QA 03ad1399f29f","password":"****","region":"eu"}

--- response: 201 in 404 ms ---
Date: Fri, 06 Nov 2026 09:30:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-53d4272f-0e4c-4730-8093-dedd731ae3f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-03ad1399f29f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30063624-4ace-4458-8841-3bbbfe50a887","handle":"qa-03ad1399f29f","displayName":"QA 03ad1399f29f","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.129470838Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c038fa52-003a-41cf-b1ba-817d74b7e478

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c038fa52-003a-41cf-b1ba-817d74b7e478
Content-Type: application/json

--- request body ---
{"handle":"qa-03ad1399f29f","password":"****"}

--- response: 200 in 203 ms ---
Date: Fri, 06 Nov 2026 09:30:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c038fa52-003a-41cf-b1ba-817d74b7e478
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30063624-4ace-4458-8841-3bbbfe50a887"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-133ba734-cb56-4562-8285-82c9dbab9d71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-133ba734-cb56-4562-8285-82c9dbab9d71
Content-Type: application/json

--- response: 403 in 67 ms ---
Date: Fri, 06 Nov 2026 09:30:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-133ba734-cb56-4562-8285-82c9dbab9d71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-133ba734-cb56-4562-8285-82c9dbab9d71"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-277f361c-c0f6-484c-bd29-69393de6ebb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-277f361c-c0f6-484c-bd29-69393de6ebb7
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-277f361c-c0f6-484c-bd29-69393de6ebb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-52f17507-8df0-499a-8e5c-5696ca0c2ef9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52f17507-8df0-499a-8e5c-5696ca0c2ef9
Content-Type: application/json

--- request body ---
{"handle":"qa-03ad1399f29f","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52f17507-8df0-499a-8e5c-5696ca0c2ef9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52f17507-8df0-499a-8e5c-5696ca0c2ef9"}
```
