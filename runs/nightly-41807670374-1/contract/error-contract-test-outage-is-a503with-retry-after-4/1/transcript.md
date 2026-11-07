# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-c1fcc6d6-ec1d-4716-8eeb-940b4ec81862` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-f3d3c84a-9343-4300-8f96-38b834232833` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-8e669f5e-215a-425f-8e7c-04e9fc911f60` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-3154817b-6e58-412a-9a11-d0f89038776f` |
| 5 | `DELETE /v1/accounts/me` | 503 | 8 | `qa-1132ea83-8e2c-4382-9aad-0b0634f3d0a6` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-6c69f261-9064-401b-b5e0-354a084531d6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-afcdec90-909f-445e-9dde-de3051fd1427` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-9de8c88f-fd5e-4238-b1d9-b368561e8ae1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-dbd20297-9e33-449f-a8ae-81ae795b55f6` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-8ef8fa0a-13e3-4fc1-8141-5f6bb601669a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c1fcc6d6-ec1d-4716-8eeb-940b4ec81862

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1fcc6d6-ec1d-4716-8eeb-940b4ec81862
Content-Type: application/json

--- request body ---
{"handle":"qa-0a81047d38e7","displayName":"QA 0a81047d38e7","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1fcc6d6-ec1d-4716-8eeb-940b4ec81862
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Location: /v1/accounts/qa-0a81047d38e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e0da0096-f4d0-49a5-a253-dd2fec04b2f5","handle":"qa-0a81047d38e7","displayName":"QA 0a81047d38e7","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.397476540Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f3d3c84a-9343-4300-8f96-38b834232833

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3d3c84a-9343-4300-8f96-38b834232833
Content-Type: application/json

--- request body ---
{"handle":"qa-878f7c69c2d7","displayName":"QA 878f7c69c2d7","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3d3c84a-9343-4300-8f96-38b834232833
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 9
Location: /v1/accounts/qa-878f7c69c2d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54705831-36d2-4308-97f8-e067f7ee7a1a","handle":"qa-878f7c69c2d7","displayName":"QA 878f7c69c2d7","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.448162984Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8e669f5e-215a-425f-8e7c-04e9fc911f60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e669f5e-215a-425f-8e7c-04e9fc911f60
Content-Type: application/json

--- request body ---
{"handle":"qa-0a81047d38e7","password":"****"}

--- response: 200 in 39 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e669f5e-215a-425f-8e7c-04e9fc911f60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0da0096-f4d0-49a5-a253-dd2fec04b2f5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3154817b-6e58-412a-9a11-d0f89038776f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3154817b-6e58-412a-9a11-d0f89038776f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-878f7c69c2d7","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3154817b-6e58-412a-9a11-d0f89038776f
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
Location: /v1/conversations/cnv_f83ea773-c01a-4540-949e-c16d8585360f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f83ea773-c01a-4540-949e-c16d8585360f","subject":"Error contract","status":"open","region":"eu","participants":["qa-0a81047d38e7","qa-878f7c69c2d7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.531526950Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1132ea83-8e2c-4382-9aad-0b0634f3d0a6

--- request headers ---
Accept: application/json
X-Fault-Key: cd471717-3dda-49eb-9d74-30c64746173a
X-Fault: unavailable-once
X-Correlation-Id: qa-1132ea83-8e2c-4382-9aad-0b0634f3d0a6
Content-Type: application/json

--- response: 503 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1132ea83-8e2c-4382-9aad-0b0634f3d0a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-1132ea83-8e2c-4382-9aad-0b0634f3d0a6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6c69f261-9064-401b-b5e0-354a084531d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c69f261-9064-401b-b5e0-354a084531d6
Content-Type: application/json

--- request body ---
{"handle":"qa-878f7c69c2d7","password":"****"}

--- response: 200 in 57 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c69f261-9064-401b-b5e0-354a084531d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54705831-36d2-4308-97f8-e067f7ee7a1a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-afcdec90-909f-445e-9dde-de3051fd1427

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afcdec90-909f-445e-9dde-de3051fd1427
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-afcdec90-909f-445e-9dde-de3051fd1427
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-9de8c88f-fd5e-4238-b1d9-b368561e8ae1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9de8c88f-fd5e-4238-b1d9-b368561e8ae1
Content-Type: application/json

--- request body ---
{"handle":"qa-878f7c69c2d7","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9de8c88f-fd5e-4238-b1d9-b368561e8ae1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9de8c88f-fd5e-4238-b1d9-b368561e8ae1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dbd20297-9e33-449f-a8ae-81ae795b55f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbd20297-9e33-449f-a8ae-81ae795b55f6
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dbd20297-9e33-449f-a8ae-81ae795b55f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8ef8fa0a-13e3-4fc1-8141-5f6bb601669a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ef8fa0a-13e3-4fc1-8141-5f6bb601669a
Content-Type: application/json

--- request body ---
{"handle":"qa-0a81047d38e7","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ef8fa0a-13e3-4fc1-8141-5f6bb601669a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ef8fa0a-13e3-4fc1-8141-5f6bb601669a"}
```
